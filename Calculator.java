import java.util.concurrent.LinkedTransferQueue;

public class Calculator {
    int a=10; // instance or not-static variable - declared outside method and inside the class - WITHOUT static keyword
    static int b=20; // static/class variable - declared outside method and inside the class - WITH static keyboard

    // No return type - No parameters INSTANCE Method
    public void m1 (){
        System.out.println(a); // instance variable 'a' cam come direct in instance method area
        System.out.println(b);
    }

public static void addition  (){
       //System.out.println(a); // Non-static field 'a' can not be referenced from static context
        int c =100; // local variable - declared inside the method
        System.out.print("Addition of "+c+" and "+b+" =");
        System.out.println(c+b);
}
// No return type - WITH parameters STATIC Method
public static void subtraction (int a, int b){
        System.out.print("Subtraction of "+a+" and "+b+" =");
        System.out.println(a-b);
    }
// No return type - WITH parameters STATIC Method
    public static void division () {
        int a=2;
        int b=2;
        System.out.print("Division of "+a+" and "+b+" =");
        System.out.println(a/b);
    }
    // No return type - WITH parameters STATIC Method
    public static void multiplication () {
        int a=30;
        int b=50;
        System.out.print("Multiplication of "+a+" and "+b+" =");
        System.out.println(a*b);
    }
    //main method
    public static void main(String[] args) {

        String company = "TFL"; //local variable - declare inside the method
        System.out.println(company);
        subtraction(20,10); // static method - 'subtraction ()' can come direct in static main method area
        addition(); // static method 'addition()' can come direct in static main method area
        division(); // static method 'division()' can come direct in static main method area
        multiplication(); // static method 'multiplication' can come direct in static main method area
        System.out.println(b); //static/class variable 'b' can come direct in static main method area
       }
}
