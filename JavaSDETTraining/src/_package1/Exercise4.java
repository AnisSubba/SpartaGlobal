package _package1;

public class Exercise4 {
    public static void main(String[] args) {

//        for (int i = 1; i <= 5; i++) {
//            for (int j = 5; j >= i; j--) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        int number = 5;
        for(int i = 1; i <= number; i++){
            for(int j = i; j <= number - 1; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
