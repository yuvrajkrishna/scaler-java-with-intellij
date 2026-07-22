public class invertedandrotatedhalfpyramid {
    static void main() {
        int n = 4;
        for(int i = 1; i <= n; i++){
//            space
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
//            star
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
