import java.util.Scanner;
public class java_stdin_stdout_2 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int i = scan.nextInt();
            double d = scan.nextDouble();
            String s = "";
            while(scan.hasNext()){
                s += scan.nextLine();
            }
            System.out.println("String: " + s);
            System.out.println("Double: " + d);
            System.out.println("Int: " + i);
        }
    }
}
