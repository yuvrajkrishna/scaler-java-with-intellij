import java.util.Scanner;

public class q5loops {
    static void main() {
        Scanner input = new Scanner(System.in);
        int number ;
        int choice ;
        int evenSum = 0;
        int oddSum = 0;

        do{
            System.out.print("Enter a number : ");
            number = input.nextInt();

            if(number % 2 == 0){
                evenSum = evenSum + number;
            }
            else{
                oddSum = oddSum + number;
            }

            System.out.print("Do you want to contiue ? Press 1 for yes or 0 for no");

            choice = input.nextInt();

        }while(choice == 1);

        System.out.println("Sum of even Numbers : " + evenSum );
        System.out.println("Sum of odd Numbers : " + oddSum);
    }
}
