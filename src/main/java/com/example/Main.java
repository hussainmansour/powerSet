package main.java.com.example;
import java.util.ArrayList;

public class Main {


    public static void displayIter(ArrayList<ArrayList<String>> subsets) {

        for (int i = 0; i < subsets.size(); i++) {
            System.out.print("[ ");
            for (int j = 0; j < subsets.get(i).size(); j++) {
                if(j != subsets.get(i).size() - 1) {
                    System.out.print(subsets.get(i).get(j) + ", ");
                }
                else {
                    System.out.print(subsets.get(i).get(j));
                }
            }
            System.out.println(" ]");
        }

    }


    public static void displayRec( ArrayList<String>subsets) {
        for (int i = 0; i < subsets.size(); i++) {

            String[] s = subsets.get(i).split(" ");
            System.out.print("[ ");
            for (int j = 0; j < s.length; j++) {
                if(j != s.length - 1) {
                    System.out.print( s[j] + ", ");
                }
                else {
                    System.out.print(s[j]);
                }
            }
            System.out.println(" ]");
        }

    }

    public static void main(String[] args) {

        generateSubsets subsets = new generateSubsets();
        String[] arr = Menu.menu();
        ArrayList<ArrayList<String>> subsetsIter = subsets.generateIteratively(arr);
        ArrayList<String> subsetsRec  = subsets.generateRecursively(arr);


        System.out.println("The subsets by Iterative method");
        displayIter(subsetsIter);
        System.out.println();
        System.out.println("The subsets by Recursive method:");
        displayRec(subsetsRec);



    }
}
