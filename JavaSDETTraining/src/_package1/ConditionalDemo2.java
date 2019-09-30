package _package1;

public class ConditionalDemo2 {
    public static void main(String[] args) {
        int val1 = 1;
        int val2 = 2;
        int result;

        boolean someCondition = true;
        // if the someCondition is true the it result Val1 or if it is false than Val2 is shown
        // shortcut for the If else statement
        // to make it false you can ! in the conditions
        result = !someCondition ? val1 : val2;
        System.out.println(result);
    }
}
