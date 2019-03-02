package entity;
/**
 * 电影类:
 * id，电影名，演员，时长，类型，上映时间，评分，简介
 */
public class Movie {
//	电影表，
//	（id，电影名，演员，时长，类型，上映时间，评分，简介 ）
//	1，阿凡达，小红，200，动作，2016-08-12,80，动物世界
//	2，钢铁侠，小王，130，爱情，2018-09-10,99，机器人
	private int movieId;
	private String movieName;
	private String actor;
	private String timeLength;
	private String type;
	private String releaseTime;
	private float score;
	private String introduction;
	private int focus;
	
	public Movie() {
		
	}

	public Movie(int movieId, String movieName, String actor, String timeLength, String type,
			String releaseTime,float score, String introduction,int focus) {
		this.movieId = movieId;
		this.movieName = movieName;
		this.actor = actor;
		this.timeLength = timeLength;
		this.type = type;
		this.releaseTime = releaseTime;
		this.score = score;
		this.introduction = introduction;
		this.focus=focus;
	}
	
	public Movie(String movieName, String actor, String timeLength, String type,
			String releaseTime, String introduction) {
		this.movieName = movieName;
		this.actor = actor;
		this.timeLength = timeLength;
		this.type = type;
		this.releaseTime = releaseTime;
		this.introduction = introduction;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}



	public String getMovieName() {
		return movieName;
	}



	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}



	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getTimeLength() {
		return timeLength;
	}

	public void setTimeLength(String timeLength) {
		this.timeLength = timeLength;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getReleaseTime() {
		return releaseTime;
	}

	public void setReleaseTime(String releaseTime) {
		this.releaseTime = releaseTime;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}



	public int getFocus() {
		return focus;
	}

	public void setFocus(int focus) {
		this.focus = focus;
	}

	@Override
	public String toString() {
		return "电影名:"+ movieName + "\n" + 
				"演员:"+actor+ "\n" +
				"时长:"+timeLength+ "\n" +
				"类型:"+type+ "\n" +
				"上映时间:"+releaseTime+ "\n" +
				"得分:"+score+ "\n" +
				"简介:"+introduction+ "\n" +
				"关注度:"+focus+ "\n" ;
	}



	
	
	
	
	
	
}
