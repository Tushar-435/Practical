import java.util.Scanner;

public class oddNumSum {
    public static void main(String[] args) {
        int num = readNum();            // input lete hain
        int result = oddSum(num);       // odd numbers ka sum nikalte hain
        System.out.println("Sum of odd numbers up to " + num + " is: " + result);

    }
    public static int readNum(){

    Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter here :");

        int num  = sc.nextInt();
        return num;
    }

    public static int oddSum(int num){
        int sum =0;
        int i = 1;
        while (i <= num) {          // jab tak i num se chhota ya barabar hai
            if (i % 2 != 0) {       // agar i odd hai
                sum += i;            // sum me add karo
            }
            i++;                    // next number par jao
        }
        return sum;
    
    
    }      
}