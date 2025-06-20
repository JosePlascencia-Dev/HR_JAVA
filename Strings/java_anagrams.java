package Strings;

import java.util.Scanner;

public class java_anagrams {
    
    static boolean isAnagram(String s1, String s2) {
        String alfa = "abcdefghijklmnopqrstuvwxyz";
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        int a[] = new int[alfa.length()];
        int b[] = new int[alfa.length()];
        if(s1.length()!=s2.length())
            return false;
        for(int i = 0; i < alfa.length(); i++){
            int contador1 = 0;
            int contador2 = 0;
            for(int j = 0; j < s1.length(); j++){
                if(s1.charAt(j) == alfa.charAt(i))
                    contador1++;
                if(s2.charAt(j) == alfa.charAt(i))
                    contador2++;
            }
            a[i]= contador1;
            b[i]= contador2;   
        }
        for(int i = 0; i < alfa.length(); i++){
            if(a[i] != b[i])   
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
