# Constructors
## Used in the creation of an object

Constructors are used when an object is created from an instance of a class.
The constructor name is the same name as the class. You are allowed to use
multiple constructors that have different parameters, this is referred to as constructor
overloading similar to method overloading.

#### Application Object with Constructor
* no-argument constructor
* parameterized constructor
```
class Application {
    
    //empty constructors
    Application() {
    }
    
    void Application(){
    }
    
    //this is a constructor that accepts a string argument
    Application(String param){
    }

}
```

#### * Arguments and Parameters
A *parameter* is defined in between the (parentheses) of a method or constructor.
```
public myMethod(String param1, int param2){}
```
An *argument* is the value the parameter holds
```
param1 = "value";
param2 = 0;
```

<sup><sup>Copyright &#169; 2020 Burt Snyder</sup></sup>