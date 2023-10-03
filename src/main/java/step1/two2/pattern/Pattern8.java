package step1.two2.pattern;

public class Pattern8 {

    /*

    *********
     *******
      *****
       ***
        *

     */
    public static void main(String[] args) {
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
