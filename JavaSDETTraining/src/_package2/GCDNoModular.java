package _package2;

import java.util.Scanner;

public class GCDNoModular {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer : ");
        int n1 = input.nextInt();
        System.out.println("Enter Second Integer : ");
        int n2 = input.nextInt();

        int gcd = 1;
        int k = 2;
        while(k <= n1 && k <= n2) { // conditional-AND is used as both conditions has to be meet before stopping the while loop
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k;
            k++;
        }
        System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);
    }
}
