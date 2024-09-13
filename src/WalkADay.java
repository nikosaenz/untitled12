//demo
import java.util.Scanner;

public class WalkADay {
    public static void main(String[] args) {
        final int FEET_PER_MILE = 5280;
        final int INCHES_PER_FEET = 12;
        final int INCHES_PER_MILE = FEET_PER_MILE * INCHES_PER_FEET;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter stride length in inches: ");
        int strideLength = input.nextInt();

        System.out.print("Enter number of steps per minute: ");
        int stepsPerMinute = input.nextInt();

        System.out.print("Enter number of minutes walked per day: ");
        int minutesPerDay = input.nextInt();

        int totalSteps = stepsPerMinute * minutesPerDay;
        int totalInches = totalSteps * strideLength;

        int miles = totalInches / INCHES_PER_MILE;
        int remainingInches = totalInches % INCHES_PER_MILE;
        int feet = remainingInches / INCHES_PER_FEET;
        remainingInches = remainingInches % INCHES_PER_FEET;

        System.out.printf("Distance walked: %d miles, %d feet, %d inches\n", miles, feet, remainingInches);
    }
}
