import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int cal = 0 ;
        while(cal < n){
            System.out.println("Running 1 step");
            cal = cal +1;
        }
        System.out.println("Target Acheived Take Rest");
    }
}