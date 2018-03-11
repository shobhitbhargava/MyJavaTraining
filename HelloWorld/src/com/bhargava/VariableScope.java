package com.bhargava;

/**
 * Created by shobh on 06-03-2018.
 */
public class VariableScope {
    String programmer = "Shobhit Bhargava";
    public static void main(String args[]){
        System.out.println("Execution begin.....");
        VariableScope variableScope = new VariableScope();
        variableScope.displayProgrammer();

    }
    public void displayProgrammer(){
        String programmer = "Srivatssan Srinivasan";
        System.out.println("Output 1 --- This program is created by "+this.programmer);
        System.out.println("Output 2 --- This program is created by "+programmer);
    }
}
