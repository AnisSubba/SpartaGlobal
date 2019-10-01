package _package2;

public class FromVoidToValueMethod {
    public static char getGrade(double score){
        // from void to value method
        if(score >= 90.0)
            return 'A';
        else if (score >= 80.0)
            return 'B';
        else if (score >= 70.0)
            return 'C';
        else if (score >= 60.0)
            return 'D';
        else
            return 'F';
    }
    public static void main (String[] args){
        // since it is value you can insert it to the out.println method
        System.out.println("the grade is:" + getGrade(60.5));
        System.out.println("The grade is:" + getGrade(85.2));
    }
}
