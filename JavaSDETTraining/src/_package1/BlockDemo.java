package _package1;

public class BlockDemo {
    public static void main (String[] args){
        boolean condition = true;
        if (condition) { // start of block 1
            System.out.println("Condition is true.");
        } //end of block 1
        else
            { //start of block 2
            System.out.println("Condition is false.");
        } //end of block 2
    }
}
