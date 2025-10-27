
import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter you number");
        int num1 = sc.nextInt();
        System.out.println("Enter you number");
        int num2 = sc.nextInt();

        int result = lcm(num1, num2);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + result);
       
    }
    public static int lcm(int num1, int num2){
        int i = 1;
        while(true){
            int fact = num1*i;
            if(fact % num2 == 0){
                return fact;
            }
                i++;
            }
        }
}
