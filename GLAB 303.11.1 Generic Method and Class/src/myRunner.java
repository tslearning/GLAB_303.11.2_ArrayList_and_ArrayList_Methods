import Generic.GMultipleDatatype;


public class myRunner {
    public static void main(String[] args) {
        //initialize the class with Integer data
//        DemoClass dObj = new DemoClass();
//        dObj.genericsMethod(25); //passing int as an argument
//        dObj.genericsMethod("Per Scholas"); // passing String as an argument
//        dObj.genericsMethod(2563.5); // Passing a float as an argument
//        dObj.genericsMethod('H'); //Passing a Char

        System.out.println("-----------------------------------------");
        //Invoking Multiple Datatype
        //Initialize generic class
        //with String and Integer
        GMultipleDatatype<String, Integer> mObj = new GMultipleDatatype("Per Scholas", 11025);
        System.out.println(mObj.getValueOne());
        System.out.println(mObj.getValueTwo());

        // initialize generic class
        // with String and String data

        GMultipleDatatype<String, String> mObj2 = new GMultipleDatatype("Per Scholas", "Non profit");
        System.out.println(mObj2.getValueOne());
        System.out.println(mObj2.getValueTwo());
    }
}
