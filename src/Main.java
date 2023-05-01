import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(sum(15));
        System.out.println(sum(10));
        System.out.println(sum(11));


    }

    public static int sum(int value) {

        int result = 0;

        while (value > 0) {
            int x = value % value;
            value = value / 10;
        }
        return result;
    }

}