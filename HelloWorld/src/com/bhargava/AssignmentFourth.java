package com.bhargava;
import java.util.*;

/**
 * Created by shobh on 07-03-2018.
 */
public class AssignmentFourth {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter the floating point number : ");
        float decimal = in.nextFloat();
        in.nextLine();
        System.out.println("Your entered number is : " + decimal);

        int integerValue = (int)decimal;
        System.out.println("Your type casted integer value is : "+integerValue);
    }
}
