package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		String jsonStr = "{\n"
				+ "    \"employee\": {\n"
				+ "      \"firstName\": \"Lokesh\",\n"
				+ "      \"lastName\": \"Gupta\",\n"
				+ "      \"website\": \"howtodoinjava.com\"\n"
				+ "    }\n"
				+ "  },\n"
				+ "  {\n"
				+ "    \"employee\": {\n"
				+ "      \"firstName\": \"Brian\",\n"
				+ "      \"lastName\": \"Schultz\",\n"
				+ "      \"website\": \"example.com\"\n"
				+ "    }\n"
				+ "  }\n";
		
		JSONObject json = new JSONObject(jsonStr);
		
		System.out.println(XML.toString(json));
	}

}
