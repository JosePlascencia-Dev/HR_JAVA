package Introduction;
import java.util.Scanner;

public class java_static_initializer_block {

    static boolean flag = false;
    static int B, H;

    static{
        Scanner scan = new Scanner(System.in);
        B = scan.nextInt();
        H = scan.nextInt();
        scan.close();
        if(B>0 && H>0)
            flag=true;
        else if(B<=0 || H<=0){
            flag=false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
    public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}


}
