package maps.demo1;

import java.util.Map;
import java.util.TreeMap;

public class demo {

	public static void main(String[] args) {

		Map<String, String> cookies = new TreeMap<>();

		cookies.put("username", "Maria");
		cookies.put("email", "maria@email.com");
		cookies.put("phone", "99721122");

		cookies.remove("email");
		cookies.put("phone", "99721133");

		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone"));
		
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}

	}

}
