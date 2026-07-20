import java.util.Scanner;
public class q2loops {
    static void main() {
        System.out.print("Enter the number to print till that Number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;
        while(i <= num){
            System.out.println(i);
            i++;
        }
    }
}
