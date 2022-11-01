package main.java.com.example;
import java.util.ArrayList;

/**
 * This is java doc.
 * @author Hussein and Amr
 *
 */
public class  generateSubsets {

    public void rec(String[] arr ,int i, String subset,ArrayList<String> subsets){
            if(i == arr.length)
                subsets.add(subset);
            else{
                rec(arr,i+1,subset,subsets);  //get the element
                rec(arr,i+1,subset+arr[i]+" ",subsets);  //leave the element
            }
    }

    public ArrayList<String> generateRecursively(String[] arr){
        ArrayList<String> subsets = new ArrayList<String >();
        String subset = new String();
        rec(arr,0,subset,subsets);
        return subsets;
    }



    public ArrayList<String> generateIteratively(String[] arr) {

        ArrayList<String> subsets = new ArrayList<String>();

        for(int i=0;i < (1 << arr.length) ;i++){

            String s = new String();
            //ArrayList<String> set = new ArrayList<String>();

            for(int j=0;j<arr.length;j++){
                if( (i & (1 << j )) != 0 ) {
                    s += String.valueOf(arr[j] + " ");
                    //set.add(arr[j]);
                }
            }

            subsets.add(s);
        }

        return subsets;
    }



}
