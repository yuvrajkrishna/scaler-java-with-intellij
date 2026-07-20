import java.util.Scanner;

public class q5_leapyear {
    static void main() {
        System.out.println("Enter Year to Check that year is leap year or not");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("Leap Year");
                }
                else{
                    System.out.println("Not Leap Year");
                }
            }
            else{
                System.out.println("Leap Year");
            }
        }
        else{
            System.out.println("Not Leap Year");
        }
        sc.close();
    }
}
