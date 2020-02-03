package com.staticvariables.example1;

public class Main {
    public static void main(String[] argv) {

        //static variable example
        Application app1 = new Application();
        Application app2 = new Application();
        Application app3 = new Application();

        app1.addToStaticCount();
        app2.addToStaticCount();
        app3.addToStaticCount();

        System.out.println(app1.staticCountMe);
        System.out.println(app2.staticCountMe);
        System.out.println(app3.staticCountMe);
        //System.out.println(Application.staticCountMe);


        //non static variable example
        Application app4 = new Application();
        Application app5 = new Application();
        Application app6 = new Application();

        app4.addToCount();
        app5.addToCount();
        app6.addToCount();

        System.out.println("...");
        System.out.println(app4.countMe);
        System.out.println(app5.countMe);
        System.out.println(app6.countMe);
    }
}


