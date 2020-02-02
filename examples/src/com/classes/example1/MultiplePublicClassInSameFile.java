package com.classes.example1;

/**
 * class basics example1
 *
 * @author burtsnyder
 */
public class MultiplePublicClassInSameFile {
    MultiplePublicClassInSameFile() {
        System.out.println("MultiplePublicClassInSameFile");
    }
}

/*

If Class NewClass is public it should
be declared in a file named NewClass.java.
Two public top level classes are not allowed
in the same file.

public class NewClass{

}

*/
