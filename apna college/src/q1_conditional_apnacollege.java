import java.util.Scanner;

public class q1_conditional_apnacollege {
    static void main() {
        System.out.println("Enter Number to Check Whether Number is Positive or Negative");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n >=0) {
            System.out.println("Positive Numbers");
        }
        else{
            System.out.println("Negative Numbers");
        }
    }
}
