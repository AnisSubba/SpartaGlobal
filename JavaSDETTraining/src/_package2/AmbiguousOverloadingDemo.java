package _package2;

public class AmbiguousOverloadingDemo {
    public static double max (int num1, double num2){
        if (num1 > num2 ) return num1;
        else return num2;
    }
    public static double max ( double num1, int num2){
        if (num1 > num2) return num1;
        else return num2;

    }

    public static void main(String[] args) {
        System.out.println(max(1,2.5)); // since 1 is int and 2.5 is double .. it choose the int num1, double num2
    }
}
