package step1.two2.pattern;

public class Pattern9 {

    /*

         *
        ***
       *****
      *******
     *********
     *********
      *******
       *****
        ***
         *
     */

    public static void main(String[] args) {
        // pattern 7
        for(int i = 0; i < 5; i++){
            // space
            for(int j = 0; j < 5 - i - 1; j++){
                System.out.print(" ");
            }
            // star
            for(int j = 0; j < 2*i + 1; j++){
                System.out.print("*");
            }
            // space
            for(int j = 0; j < 5 - i - 1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        // pattern 8
        for(int i = 0; i < 5; i++){
            // space
            for(int j = 0; j < i ; j++){
                System.out.print(" ");
            }
            // star
            for(int j = 0; j < 2*(5 - i - 1) + 1; j++){
                System.out.print("*");
            }
            // space
            for(int j = 0; j < i ; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
