package step1.two2.pattern;

public class Pattern4 {

    /*

     1
     2 2
     3 3 3
     4 4 4 4

     */

    public static void main(String[] args) {
        for (int i = 1; i<=4; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
