package application;

import java.util.Map;
import java.util.TreeMap;

public class Programam {

	public static void main(String[] args) {

		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("Name", "Maria");
		cookies.put("Email", "maria@gmail.com");
		cookies.put("Phone", "67984049966");
		
		System.out.println("Conatins 'phone' key: " + cookies.containsKey("Phone"));
		System.out.println("Email: " + cookies.get("Email"));
		
		System.out.println("ALL COOKIES:");
		
		for(String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}

	}

}
