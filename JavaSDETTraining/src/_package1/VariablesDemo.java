package _package1;

import java.sql.SQLOutput;

public class VariablesDemo {
    //below is example of instance variable
    int a = 1;
    String myName = "Anis Subba";
    String hobbies = "MMA";

    //below is example of Static Variable
    //since it is already static you don't have to define it in static void main.
    static int b = 10;
    static String myAddress = "London";

    public static void main (String[] args) {
        //defining the objects
        VariablesDemo object1 = new VariablesDemo();
        //printing the variables
        System.out.println(object1.a + " , " + object1.hobbies + " , " + object1.myName);

        //printing the static variables
        System.out.println(b + ", " + myAddress);

        //below is example of local variable
        //it inside the static void main, you state the message and print it
        String myMessage = "hi how you doing.";
        System.out.println(myMessage);


    }
}
