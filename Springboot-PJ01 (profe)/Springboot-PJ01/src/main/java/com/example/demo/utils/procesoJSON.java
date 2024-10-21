package com.example.demo.utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.example.demo.models.employee;

public class procesoJSON {
	
    private static employee parseEmployeeObject(JSONObject employee) 
    {
        JSONObject employeeObject = (JSONObject) employee.get("employee");
        String firstName = (String) employeeObject.get("firstName");    
     //   System.out.println(firstName);
        String lastName = (String) employeeObject.get("lastName");  
     //   System.out.println(lastName);
        String website = (String) employeeObject.get("website");    
     //   System.out.println(website);
        employee miEmployee = new employee(firstName,lastName,website);
        return miEmployee;
    }

public ArrayList<String> JSONParseo(){
	ArrayList<String> salida = new ArrayList();
	
	JSONParser jsonParser = new JSONParser();
    try (FileReader reader = 
 		   new FileReader("src/main/resources/employees.json"))
    {
         Object obj = jsonParser.parse(reader);
         JSONArray employeeList = (JSONArray) obj;
//         System.out.println(employeeList);
//         employeeList.forEach( emp -> parseEmployeeObject( (JSONObject) emp ) );
         for ( Object emp :employeeList) {
        	 salida.add(parseEmployeeObject( (JSONObject) emp ).toString());
         }  

     } catch (FileNotFoundException e) {
         e.printStackTrace();
     } catch (IOException e) {
         e.printStackTrace();
     } catch (ParseException e) {
         e.printStackTrace();
     }
	return salida;	
}
}
