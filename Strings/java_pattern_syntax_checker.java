package Strings;

import java.util.Scanner;
import java.util.regex.*;

public class java_pattern_syntax_checker{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String pattern = in.nextLine();
            try{
                Pattern.compile(pattern);    
                System.out.println("Valid");
                testCases --;
            }catch(Exception e){
                System.out.println("Invalid");
                testCases --;
            }
            
		}
        in.close();
	}
}