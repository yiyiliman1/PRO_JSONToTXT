package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.utils.procesoJSON;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

@SpringBootApplication
public class SpringbootPj01Application {
//	SpringApplication.run(SpringbootPj01Application.class, args);

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException 
	{
    	procesoJSON miJSON =new procesoJSON();
    	ArrayList<String> resultado = miJSON.JSONParseo();
    	PrintWriter print = 
    			new PrintWriter(new FileWriter("src/main/resources/salida.txt"));
    
    	for (String x:resultado) {
    		print.println(x);
    	}
    	print.close();
	}
}