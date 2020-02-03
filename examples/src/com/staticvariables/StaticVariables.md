# Variables
## Static Variable Example

[Application.java] | [Main.java]


#### What's happening in Application.java:
You are incrementing(adding to) a static variable staticCountMe:
```
public static int staticCountMe = 0;

public void addToStaticCount() {
    staticCountMe = staticCountMe + 1;
    //you could also write staticCountMe++
}

```
...because in Main.java:

```
Application app1 = new Application();

app1.addToStaticCount();
```
...which is being called 3 times.

Each time 1 is added to the staticCountMe variable via the addToStaticCount() method. A new instance of Application is being created "app1, app2, etc.." but
each instance is using the same static variable.

```
One way to look at it is like this:

Static Example:
(app1)(app2)(app3)<------>staticCountMe

Non Static Variable:
(app1<--->countMe)(app2<--->countMe)(app3<--->countMe)

```

<sup><sup>Copyright &#169; 2020 Burt Snyder</sup></sup>


[Application.java]:https://github.com/bws9000/beginning-java/blob/master/examples/src/com/staticvariables/example1/Application.java
[Main.java]:https://github.com/bws9000/beginning-java/blob/master/examples/src/com/staticvariables/example1/Main.java