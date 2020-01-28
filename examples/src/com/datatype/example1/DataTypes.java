package com.datatype.example1;

/**
 * command line example1
 * @author burtsnyder
 */
public class DataTypes {
    public static void main(String[] argv) {

        //primitive data types
        byte byteVar = -128;
        double doubleVar = 2.30d;
        float floatVar = 1.40f;
        int intVar = 4700;
        long longVar = 100000L;
        short shortVar = 26;
        char charVar = 'a';
        boolean boolVar = true; //true or false

        System.out.println("byte: " + byteVar);
        System.out.println("int: " + intVar);
        System.out.println("double: " + doubleVar);
        System.out.println("float: " + floatVar);
        System.out.println("long: " + longVar);
        System.out.println("short: " + shortVar);
        System.out.println("char: " + charVar);
        System.out.println("boolean: " + boolVar);

        //some non primitives
        String stringExample = "Hi, I'm a string.";
        System.out.println(stringExample);

        String stringExample2;
        stringExample2 = ("b:" + byteVar + " i:" + intVar);
        System.out.println(stringExample2);

        int[] aArray;
    }
}
