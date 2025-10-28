
import java.util.Scanner;

public class fabonaci {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you number");
        int num = sc.nextInt();
        fab(num);

    }

    public static void fab(int num){
        int a = 0;
        int b = 1;

        while (a <= num) {
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;

        }
    }
    
}
