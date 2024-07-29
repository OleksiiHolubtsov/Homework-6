package app;

public class Main {

    static int sum;
    static int num;
    public static void main(String[] args) {

        sum = 0;

        for (num = 1; num <= 6; num++) {
            sum += num;
            System.out.println("Num is " + num + ", sum is " + sum);
        }

        System.out.println("------------------------" );
        System.out.println("Sum of numbers is " + sum);
    }
}



