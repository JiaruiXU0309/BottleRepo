import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Bottle bottle1 = new Bottle();
        bottle1.print();

        System.out.println("Bottle APP V 1.0");

        bottle1.setDetails();

        bottle1.print();
    }
}