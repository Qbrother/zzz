package entity;


/**
 * 电影评论
 * id，评论内容，电影id，评论时间，用户id
 */

public class MovieComments {
//	评论表
//	（id，评论内容，电影id，评论时间，用户id）
//	1,真好看，1,2018-09-19 xx:xx:xx，1
//	2,真好看啊，2,2018-09-19 xx:xx:xx，2
//	3,真好看呀，2,2018-09-19 xx:xx:xx，2
//	4,真好看的，2,2018-09-19 xx:xx:xx，2
//	5,真的好看，2,2018-09-19 xx:xx:xx，1
//	6,真的是好看，1,2018-09-19 xx:xx:xx，2
//	7,真的太好看了，1,2018-09-19 xx:xx:xx，1
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
