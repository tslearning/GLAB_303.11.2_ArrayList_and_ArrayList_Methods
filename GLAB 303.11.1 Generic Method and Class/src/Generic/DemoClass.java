package Generic;

public class DemoClass {
     //Create a generics method
    public<T> void genericsMethod(T data) {
        System.out.print("Generic Method: ");
        System.out.println("Data Passed: " + data);
    }
}
