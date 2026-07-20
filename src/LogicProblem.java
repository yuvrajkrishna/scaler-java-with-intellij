import java.util.Scanner;
public class LogicProblem  {

    static void main() {
//        I NEED TO WRITE A LOOP TO PRINT
//        ALL NUMBERS FROM N TO 1
//        ALL EVEN NUMBERS FROM 1 TO N
//        SUM OF ALL NUMBERS FROM 1 TO N
//        SUM OF ALL ODD NUMBERS FROM 1 TO N
//        PRINT ALL MULTIPLICATION OF 4 FROM 1 TO N
//        
//    System.out.println("Please enter the value of N");
//    Scanner sc = new Scanner(System.in);
//
//    int n = sc.nextInt();

//    for(int i = 1; i <= n; i++){
//        System.out.println(i);
//    }

//    for(int i = 2;i <= n; i+=2){
//            System.out.println(i);
//    }

//    int start = n;
//    while(start>0){
//        System.out.println(start);
//        start--;
//    }
//    int st = 1;
//    while(st <=100){
//        System.out.println(st);
//
//        st*=2;
//    }
//

//    int num = 5;
//    int factorial = 1;
//    for(int i = 1; i <= num; i++){
//        factorial *= i;
//    }
//        System.out.println(factorial);

//    int num = 10;
//    int i = 2;
//    int sum = 0;
//    while(i<=num){
//        if(i%2==0){
//            sum += i;
//        }
//        i+=2;
//    }
//        System.out.println(sum);

//        Give a series of form 3i+2 print first n terms of series
        int num = 5;
        int i = 1;
        while(i <= num){
            int term = 3*i+2;
            if(term % 5 == 0){
                i++;
                num++;
                continue;
            }
            System.out.println(term);
            i++;
        }


    }
}


