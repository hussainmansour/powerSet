package test.java.com.example;

import com.google.common.util.concurrent.Striped;
import main.java.com.example.generateSubsets;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class generateSubsetsTest {

   public static String[] toStringArray(ArrayList<ArrayList<String>> arr) {
        String[]str=new String[arr.size()-1];
        int i=0,k=0;
        while( i < arr.size() ){
            if(arr.get(i).size() == 0) {
                i++;
                continue;
            }
            String s = "";
            for(int j=0;j<arr.get(i).size();j++){

                if(j==arr.get(i).size()-1)
                    s += (arr.get(i).get(j));
                else
                    s += (arr.get(i).get(j) + " ");

            }
            str[k]=s;
            k++;
            i++;
        }
        return str;
    }

    @Test
    void generateRecursively() {

    }

    @Test
    void generateIteratively() {

        generateSubsets subset = new generateSubsets();
        ArrayList<ArrayList<String>> arr = subset.generateIteratively(new String[]{"1", "2"});
        String[] str;
        str = toStringArray(arr);
        Arrays.sort(str);
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
        Assertions.assertArrayEquals(str, new String[]{"1","1 2","2"});

    }
}
