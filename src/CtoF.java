import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double cel = 0;
        double fer = 0;
        String trash = "";
        boolean done = false;

        do {

            System.out.print("Enter the temperature in celsius to convert to fahrenheit: ");

            if (in.hasNextDouble()) {

                cel = in.nextDouble();
                fer = (cel * 9 / 5) + 32;
                System.out.println(cel + " in fahrenheit is " + fer);

                done = true;

            } else {
                trash = in.nextLine();
                System.out.println("Enter a numerical value, not " + trash);
            }

        } while (!done);
    }
}
