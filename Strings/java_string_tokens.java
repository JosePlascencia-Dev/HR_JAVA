package Strings;

import java.util.Scanner;

public class java_string_tokens {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] t = s.split("[^a-zA-Z]");
        int tol = 0;
        for(String ss : t){
            if(ss.length() != 0)
                tol++;
        }
        System.out.println(tol);
        for(String ss : t){
            if(ss.length() != 0)
                System.out.println(ss);
        }
        scan.close();
    }
}
