package Test5.entity;

import java.util.List;

public class PegeBean<T> {
	private Integer pc;//当前页
	private Integer tr;//总数据(条数)
	private Integer ps;//页面大小，即页面显示多少东西
	private Integer tp;//总页数
	private List<T> beanList;//获得的当前页数据
	public Integer getPc() {
		return pc;
	}
	public void setPc(Integer pc) {
		this.pc = pc;
	}
	public Integer getTr() {
		return tr;
	}
	public void setTr(Integer tr) {
		this.tr = tr;
	}
	public Integer getPs() {
		return ps;
	}
	public void setPs(Integer ps) {
		this.ps = ps;
	}
	
	//    20/5=4页21/5=4+1页
	public Integer getTp() {
		int tp=tr/ps;
		return tr%ps==0?tp:tp+1;
	}

	public List<T> getBeanList() {
		return beanList;
	}
	public void setBeanList(List<T> beanList) {
		this.beanList = beanList;
	}
	@Override
	public String toString() {
		return "PageBean [pc=" + pc + ", tr=" + tr + ", ps=" + ps + ", tp=" + tp + ", beanList=" + beanList + "]";
	}
	
	
}
