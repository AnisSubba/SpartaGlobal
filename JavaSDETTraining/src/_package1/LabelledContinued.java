package _package1;

public class LabelledContinued {
    public static void main(String[] args) {

        String myPhrase = "Look for a Substring in me.";
        String substring = "bas";
        boolean foundIt = false;
        System.out.println(substring.length());
        int max  = myPhrase.length() - substring.length();

        test:
        for(int i = 0; i <= max; i++){
            int n = substring.length();
            System.out.println(n);
            int j = i;
            System.out.println(j);
            int k = 0;
            while ( n-- != 0){
                if (myPhrase.charAt(j++) != substring.charAt(k++)){
                    continue test; //This is a labelled continue

                }
            }
            foundIt = true;
            break test;
        }
        System.out.println(foundIt ? "Found it " : "Didn't find it.");
    }
}
