package step1.two2.pattern;

public class Pattern10 {

    /*

    *
    * *
    * * *
    * * * *
    * * *
    * *
    *

     */
    public static void main(String[] args) {
        int n = 5;
        // pattern 2
        for (int i = 0; i<n; i++){
            for (int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // pattern 5
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= (n - 1) - i + 1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
