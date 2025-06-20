package Strings;

import java.util.Scanner;

public class java_string_reverse {
    public static void main(String[] args) {
        java_string_reverse s = new java_string_reverse();
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        if(s.palindrome(A))
            System.out.println("Yes");
        else
            System.out.println("No");
        sc.close();
    }
    
    public boolean palindrome(String s){
        String inv = new StringBuilder(s).reverse().toString();
        return inv.equals(s);
    }
}
