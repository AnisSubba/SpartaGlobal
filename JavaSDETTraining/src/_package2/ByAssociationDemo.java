package _package2;

public class ByAssociationDemo {
    public static void increment(int n){
        n++;
        System.out.println("n inside the method is: " + n);
    }

    public static void main(String[] args){
        int x = 1;
        System.out.println("Before the call, x is: " + x);
        // due to this x is n = so n++ mean 1 + 1 = 2, it is only n inside the method.
        increment(x);
        System.out.println("After the call, x is: "+ x);
    }
}
