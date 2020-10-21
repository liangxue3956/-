package main;

import java.util.List;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "a,b,c,d,e"; 
		 
		List<String> result= Arrays.asList(str.split(","));
		
		System.out.println(result);

	}

}
