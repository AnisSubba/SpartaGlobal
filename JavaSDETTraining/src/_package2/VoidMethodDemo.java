package _package2;

public class VoidMethodDemo {
    public static void printGrade(double score){
        // this is a statement in void method
        if (score >= 90.0){
            System.out.println('A');
        } else if (score >= 80.0){
            System.out.println('B');
        } else if (score >= 70.0){
            System.out.println('C');
        } else if (score >= 60.0){
            System.out.println('D');
        } else {
            System.out.println('F');
        }
    }
    public static void main(String[] args){
        // 'ln' means no space
        System.out.print("the grade is: " );
        printGrade(78.8);
        System.out.print("the grade is: ");
        printGrade(88.9);
    }
}
