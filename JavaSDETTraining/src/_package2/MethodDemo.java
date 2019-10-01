package _package2;

public class MethodDemo {
    // stating the value returning methods
    public static int max(int num1, int num2){
        int result;
        if(num1 > num2){
            result = num1;
        }else {
            result =num2;

        }
        return result;
    }
    public static void main(String[] args){
        int z = max(4,7);
        System.out.println(z);
        // or
        System.out.println(max(6, 5));
    }
}
