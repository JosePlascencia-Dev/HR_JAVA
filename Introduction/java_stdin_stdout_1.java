package Introduction;
import java.util.*;

public class java_stdin_stdout_1 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();

            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
    }

}
