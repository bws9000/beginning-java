package com.staticvariables.example1;

/**
 * static variables
 *
 * @author burtsnyder
 */
public class Application {

    /*
    Anything marked static is owned by this class alone.
    For example, the main method.
    */

    public static int staticCountMe = 0;
    public int countMe = 0;

    public void addToStaticCount() {
        staticCountMe = staticCountMe + 1;
        //you could also write staticCountMe++
    }

    public void addToCount() {
        this.countMe = this.countMe + 1;
        //you could also write this.countMe++
    }

    public static void main(String[] args) {
        /*
        Never called because our entry point is in Main.java
        */
        System.out.println("Never called here.");
    }


}
