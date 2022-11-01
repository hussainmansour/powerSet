package main.java.com.example;
import java.util.ArrayList;

public class Main {

    public static void display( ArrayList<String> subsets) {
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
        ArrayList<String> subsetsIter = subsets.generateIteratively(arr);
        ArrayList<String> subsetsRec = subsets.generateRecursively(arr);

        System.out.println("The subsets by Iterative method");
        display(subsetsIter);
        System.out.println();
        System.out.println("The subsets by Recursive method:");
        display(subsetsRec);

    }
}
