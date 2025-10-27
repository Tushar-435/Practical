
import java.util.Scanner;

public class sumOfDigit {
    public static void main(String[] args) {
        int num = readNum();
        int result = sumOf(num);
        System.out.println("Sum of digits of " + num + " is: " + result);
      
    }

    public static int readNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter here :");

        int num  = sc.nextInt();
        return num;
    }
    
    public static int sumOf(int num){
        int sum = 0;
        while (num > 0){
            sum+=num%10;
            num/=10;
        }

        return sum;

    }

}
