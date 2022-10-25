package Chapter01;

public class Loopy {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Before the Loop");
        while (x < 4) {
            System.out.println("In the loop");
            System.out.println("Value of the x is " + x);
            x = x + 1;
        }
        System.out.println("This is after the loop");
    }
}
/*
OUTPUT:
Before the Loop
In the loop
Value of the x is 1
In the loop
Value of the x is 2
In the loop
Value of the x is 3
This is after the loop
 */