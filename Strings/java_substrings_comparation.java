package Strings;

import java.util.Scanner;

public class java_substrings_comparation {
    public static String getSmallestAndLargest(String s, int k) {
        java.util.List<String> a = new java.util.ArrayList<>();
        for(int i = 0; i<s.length()-k+1;i++){
            a.add(s.substring(i,k+i));
        }
        java.util.Collections.sort(a);
        return a.get(0) + "\n" + a.get(a.size()-1);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
