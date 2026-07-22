public class q8 {
    static void main() {
        for(int i = 0; i <= 5; i++ ){
            System.out.println("i = " + i);
        }
//        System.out.println(i);
//        it will show an error because the i is only scoped to the for loop and we are using it in global scope
    }
}
