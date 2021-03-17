package Interview;

import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.stream.Stream;

public class AliceBob {
    // Complete the compareTriplets function below.
    static ArrayList<Integer> compareTriplets(ArrayList<Integer> a, ArrayList<Integer> b) {
        
    	ArrayList<Integer> list = new ArrayList<Integer>();
        // list.add(0);
        // list.add(0);
        for(int i = 0;  i < 3; i++){
            if(a.get(i) > b.get(i)){
                list.add(0, (list.get(0)+1));
            }
            else if(a.get(i) < b.get(i)){
                list.add(1, (list.get(1)+1));
            }	
        }	
        return list;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

//        ArrayList<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//            .map(Integer::parseInt)
//            .collect(toList());
//
//        ArrayList<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//            .map(Integer::parseInt)
//            .collect(toList());

//        ArrayList<Integer> result = compareTriplets(a, b);

//        bufferedWriter.write(
//            result.stream()
//                .map(Object::toString)
//                .collect(joining(" "))
//            + "\n"
//        );
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}
