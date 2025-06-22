package Strings;

import java.util.Scanner;

public class java_regex {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
        in.close();
    }
}

class MyRegex{
    String p = "([0-9]|[0-9][0-9]|[01][0-9][0-9]|2[0-4][0-9]|2[0-5][0-5])";
    String pattern = p+"."+p+"."+p+"."+p;
    public MyRegex(){}
}