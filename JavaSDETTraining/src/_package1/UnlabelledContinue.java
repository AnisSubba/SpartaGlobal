package _package1;

public class UnlabelledContinue {

    public static void main (String[] args){
        String myPhrase = " pater piper picked a " + " peck of pickled peppers";
        int max = myPhrase.length();
        int numPs = 0;

        for (int i = 0; i < max; i++){
            //trying to find all the Ps
            if (myPhrase.charAt(i) == 'p')
//                continue; // this is unlabelled continue
            //processing another letter to find p.
            numPs++;
            continue;
        }
        System.out.println("Found " + numPs + " p's in myPhase." );
    }
}
