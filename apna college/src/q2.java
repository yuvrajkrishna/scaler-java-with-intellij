import java.util.Scanner;

public class q2 {
    static void main() {
        System.out.println("Enter your temperature to check whether you have fever or not ");
        Scanner input = new Scanner(System.in);
        Double n = input.nextDouble();
        if(n > 100 ){
            System.out.println("You have Fever");
        }
        else{
            System.out.println("You don't have Fever");
        }
    }

}
