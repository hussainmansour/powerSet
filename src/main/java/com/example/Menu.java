package main.java.com.example;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Menu {

    public static String[] menu(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the elements of the set: ");
        String[] set = scan.nextLine().split(" ");
        return set;
    }
}
