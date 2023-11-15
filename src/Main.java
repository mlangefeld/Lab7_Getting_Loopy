import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = 0;
        int num2 = 0;
        int length = 5;
        int height = 5;

        System.out.print("1).  ");
        for (num = 0; num <= 30;){
            System.out.print(num + ", ");
            num = num + 1;
        }
        System.out.println();
        System.out.println();
        System.out.print("2).  ");
        for (num = 30; num >= 0;){
            System.out.print(num + ", ");
            num = num - 1;
        }
        System.out.println();
        System.out.println();
        System.out.print("3).  ");
        for (num = 0; num <= 18;){
            System.out.print(num+", ");
            num = num + 3;
        }
        System.out.println();
        System.out.println();
        System.out.print("4).  ");
        for (num = 10; num >=0;){
            System.out.print(num+", ");
            num = num - 2;
        }
        System.out.println();
        System.out.println();
        System.out.print("5).  ");
        System.out.println();
        for (num = 1; num <= 5; num++) {
            for (num2 = 1; num2 <= num; num2++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.print("6).  ");
        System.out.println();
        for (num = 5; num >= 1; num--) {
            for (num2 = 1; num2 <= num; num2++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.print("7).  ");
        System.out.println();

        for (num = 0; num < length; num++ ){
            for (num2 = 0; num2 < height; num2++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

