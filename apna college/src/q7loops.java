import java.util.Scanner;

public class q7loops {
    static void main() {
        System.out.println("Enter the number to print its table : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1 ; i <= 10; i++){
            System.out.println(n + " * " +i +" = " + n*i);
        }
    }
}
