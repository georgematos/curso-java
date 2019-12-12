package exercicio_string_builder_posts;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	
	private List<Comment> comments = new ArrayList<>();

	public Post() {
		
	}

	public Post(Date moment, String title, String content) {
		super();
		this.moment = moment;
		this.title = title;
		this.content = content;
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Title: " + title + "\n");
		sb.append("Likes: " + likes + "\n");
		sb.append("Data: " + moment + "\n");
		sb.append("Content: " + content + "\n");
		sb.append("Comments: \n");
		for (Comment c : comments) {
			sb.append("Comment " + comments.indexOf(c) + ": " + c.getText() + "\n");
		}

		return sb.toString();
	}

	public void addComment(Comment comment) {
		comments.add(comment);
	}
	
	public void removeComment(Comment comment) {
		comments.remove(comment);		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public Date getMoment() {
		return moment;
	}

}
