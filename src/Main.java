import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String wor = " Hello, My name is Prabath Rai but you can call me rai aka RAI";
        String occurenceWord = "rai";

        String[] temp = wor.split(" ");
        System.out.println(Arrays.toString(temp));
        int count = 0;
        for( int i = 0; i < temp.length; i++){
            if(occurenceWord.equalsIgnoreCase(temp[i])){
                count += 1;
            }
        }
        System.out.println("Number of word occurence is " + count);
    }
}