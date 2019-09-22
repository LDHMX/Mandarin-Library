package model;

public class Post {
	private String Title;
	private String Content;
	public Post(String title, String content) {
		super();
		Title = title;
		Content = content;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	
}
