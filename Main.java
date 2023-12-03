import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int [] testing = {1,1,1,2};

        for(int elem : testing){
            System.out.println(elem);
        }
        int [] A = Arrays.stream(testing)
            .map(val ->  val * 2).toArray();

        for (int elem : A){
            System.out.println(elem);
        }


        int steve = 11;
        String test = Integer.toString(steve);
        System.out.println(test);
        String first = test.substring(0,1);
        int out = Integer.parseInt(first);
        System.out.println(out);



    }
}