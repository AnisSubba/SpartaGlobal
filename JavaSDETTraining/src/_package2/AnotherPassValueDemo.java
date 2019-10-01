package _package2;

public class AnotherPassValueDemo {
    public static void swap(int n1, int n2){
        // it a sorting algorithm
        System.out.println("\tInside the swap method: ");
        System.out.println("\t\tBefore swapping n1 is: " + n1 + ", n2 is: " + n2);

        //we swap n1 with n2
        int temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("\t\tAfter swapping n1 is: " + n1 + ", n2 is: " + n2);
    }

    public static void main(String[] args) {
        int num1 = 8;
        int num2 = 16;
        System.out.println("Before invoking the swap method, num1 is: " + num1 + ", and num2 is: " + num2);
        // invoke the swap method
        swap(num1, num2);
        System.out.println("After invoking the swap method, num1 is: " + num1 + ", and num2 is: " + num2);
    }
}
