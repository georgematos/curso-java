package exercicio_string_builder_posts;

import java.util.Calendar;
import java.util.Date;

public class MainTest {

	public static void main(String[] args) {
		//Date moment, String title, String content, Integer likes
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		String title = "Java é muito difícil de aprender?";
		String content = "Estou procurando uma linguagem de programação para aprender,vocês recomendariam Java?";

		Post post = new Post(date, title, content);

		post.setLikes(2);

		Comment comment1 = new Comment();
		comment1.setText("Java não é muito amigável pra começar, tente Python");
		Comment comment2 = new Comment();
		comment2.setText("Eu recomendo começar com Ruby");

		post.addComment(comment1);
		post.addComment(comment2);

		System.out.println(post);
		
		System.out.println("-----------------------------------");
		
		post.removeComment(comment1);

		System.out.println(post);
	}
	
}
