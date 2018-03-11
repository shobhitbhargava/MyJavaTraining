package com.bhargava;

import java.util.*;
/**
 * Created by shobh on 07-03-2018.
 */
public class AssignmentFirst {
    private static Scanner in = new Scanner(System.in);
    private static String firstVariable;
    public static void main(String[] args){
        System.out.println("Starting application...");
        System.out.print("Enter the value : ");
        firstVariable = in.nextLine();
        runableMethod();
    }

    private static void runableMethod(){
        System.out.print("Enter another value : ");
        String secondVariable = in.nextLine();
        if(firstVariable.length() > secondVariable.length()){
            System.out.println("Your first value is : "+firstVariable);
            System.out.println("Your second value is : "+secondVariable);
        }else{
            System.out.println("Only second variable is available : "+secondVariable);
        }
    }
}
