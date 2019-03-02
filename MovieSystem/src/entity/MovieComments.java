package entity;


/**
 * ��Ӱ����
 * id���������ݣ���Ӱid������ʱ�䣬�û�id
 */

public class MovieComments {
//	���۱�
//	��id���������ݣ���Ӱid������ʱ�䣬�û�id��
//	1,��ÿ���1,2018-09-19 xx:xx:xx��1
//	2,��ÿ�����2,2018-09-19 xx:xx:xx��2
//	3,��ÿ�ѽ��2,2018-09-19 xx:xx:xx��2
//	4,��ÿ��ģ�2,2018-09-19 xx:xx:xx��2
//	5,��ĺÿ���2,2018-09-19 xx:xx:xx��1
//	6,����Ǻÿ���1,2018-09-19 xx:xx:xx��2
//	7,���̫�ÿ��ˣ�1,2018-09-19 xx:xx:xx��1
	private int CommentsId;
	private String content;
	private int movieId;
	private String time;
	private String userName;
	
	public MovieComments() {
	}
	
	public MovieComments( String content, int movieId, String time, String userName) {
		this.content = content;
		this.movieId = movieId;
		this.time = time;
		this.userName = userName;
	}

	public MovieComments(int commentsId, String content, int movieId, String time, String userName) {
		CommentsId = commentsId;
		this.content = content;
		this.movieId = movieId;
		this.time = time;
		this.userName = userName;
	}

	public int getCommentsId() {
		return CommentsId;
	}

	public void setCommentsId(int commentsId) {
		CommentsId = commentsId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}


	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getMoreComment() {
		return userName + ":" + content+"\t"+time;
	}

	@Override
	public String toString() {
		return content+"\t"+movieId+"\t"+time;
	}
	
	public String allComments() {
		return CommentsId+"\t"+content+"\t"+movieId+"\t"+time+"\t"+userName;
	}
	
	
}
