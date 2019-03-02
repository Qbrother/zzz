var xhr;
function createXMLHTTPRequest(){
	 xhr=new XMLHttpRequest();  //创建ajax核心对象
}

function check(){
	 var username=document.getElementById("username").value;
	 createXMLHTTPRequest();
	 xhr.open("get","ajax.do?username="+username);  //发送请求;
	 xhr.send(null);   //发送;
	 //接收服务器的响应数据;
	 xhr.onreadystatechange=callBack;
}
function callBack(){
	 if(xhr.readyState==4 && xhr.status==200){  //可以开始接收返回的数据了....
		 //服务器响应类型 1.字符串   2.xml文件
		 var content=xhr.responseText; //服务器以字符串的方式返回;
		 var resname=document.getElementById("resname");
		 resname.innerHTML="<font color='red'>"+content+"</font>";  		 
	 }
}

window.onload = function() {
		//获得所有元素
		var username = document.getElementById("username");
		var resname = document.getElementById("resname");
		var psd1 = document.getElementById("psd1");
		var psd2 = document.getElementById("psd2");
		var respsd1 = document.getElementById("respsd1");
		var respsd2 = document.getElementById("respsd2");
		var phone = document.getElementById("phone");
		var resphone = document.getElementById("resphone");
		var verification = document.getElementById("verification");
		var resver = document.getElementById("resver");

		var firstNumber = /^\w/;//开头需满足条件
		var allNumber = /^\w{1}\w{3,29}$/;//开头结尾必须有才能满足条件,即^和$

		
		
		 username.onblur = function() {
			if (username.value == null || username.value == "") {
				resname.innerHTML = "<font color='red'>用户名不能为空</font>";
			} else if (username.value.length < 4) {
				resname.innerHTML = "<font color='red'>长度不能少于4位</font>";
			} else if (username.value.length > 30) {
				resname.innerHTML = "<font color='red'>长度不能大于30位</font>";
			} else if (!firstNumber.test(username.value)) {
				resname.innerHTML = "<font color='red'>首位只能是字母或是数字或_</font>";
			} else if (!allNumber.test(username.value)) {
				resname.innerHTML = "<font color='red'>字符不能为特殊字符串</font>";
			}else{
				resname.innerHTML = "<font color='green'>该用户名可用</font>";
			}
			
		} 
		
		
		
		
		psd1.onblur = function() {
			if (psd1.value == null || psd1.value == "") {
				respsd1.innerHTML = "<font color='red'>密码不能为空</font>";
			} else if (psd1.value.length < 6) {
				respsd1.innerHTML = "<font color='red'>密码长度不能少于6位</font>";
			} else if (psd1.value.length > 20) {
				respsd1.innerHTML = "<font color='red'>密码长度不能大于20位</font>";
			} else {
				respsd1.innerHTML = "<font color='green'>通过</font>";
			}
		}

		psd2.onblur = function() {
			if (psd2.value != psd1.value) {
				respsd2.innerHTML = "<font color='red'>两次密码不一致</font>";
			} else if (psd1.value.length >= 6 && psd1.value.length >= 6
					&& psd1.value == psd1.value) {
				respsd2.innerHTML = "<font color='green'>两次密码一致</font>";
			}
		}
		
		var num=/\D/;
		phone.onblur = function() {
			if (phone.value == null || phone.value == "") {
				resphone.innerHTML = "<font color='red'>手机号码不能为空</font>";
			} else if(num.test(phone.value)){
				resphone.innerHTML = "<font color='red'>手机号码只能是数字</font>";
			}else{
				resphone.innerHTML = "<font color='orange'>手机号码可用于登录、找回密码、就收订单通知等服务</font>";
			}
		}

		var verificationCode = /gkdd/i;
		verification.onblur = function() {
			if (verificationCode.test(verification.value)) {
				resver.innerHTML = "<font color='green'>验证码正确</font>";
			} else {
				resver.innerHTML = "<font color='red'>验证码错误</font>";
			}
		}
		
		
	}