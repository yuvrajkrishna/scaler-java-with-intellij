import java.util.Scanner;

public class conditional {
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
