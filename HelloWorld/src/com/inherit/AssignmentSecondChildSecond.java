package com.inherit;
import com.bhargava.*;

/**
 * Created by shobh on 07-03-2018.
 */

public class AssignmentSecondChildSecond extends AssignmentSecond{
    public void printableMethod(){
        System.out.println("This is the child overloaded method to print assignment second.");
    }
    public static AssignmentSecond A1 = new AssignmentSecond();
    public static AssignmentSecondChild A2 = new AssignmentSecondChild();
    public static void main(String[] args){
        A1.printableMethod();
        A2.printableMethod();
        System.out.println("This is the child class.");

    }
}
