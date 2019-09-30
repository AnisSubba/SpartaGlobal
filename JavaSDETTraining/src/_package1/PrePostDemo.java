package _package1;

public class PrePostDemo {
    public static void main(String[] args){
        int i = 3;
        // add 1
        i++;
        System.out.println(i);

        ++i;
        System.out.println(i);
        System.out.println(++i);
        //print whats the output is so far if i = 1 then i++ = 1
        System.out.println(i++);
        System.out.println(i);

        int a = 1;
        System.out.println(++a);

        int b = 1 ;
        System.out.println(b++);

    }
}
