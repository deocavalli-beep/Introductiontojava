
import java.util.Scanner;

public class HolidayBudgetMain {
    public static void main(String[] args) {

        Scanner inputData = new Scanner(System.in);

        System.out.println("WELCOME TO MY HOLIDAY SHOPPING PLANS");

        System.out.println("Please enter your name");
        String name = inputData.nextLine();

        System.out.println("Enter your holiday budget for shopping plans: $");
        double budgetEntry = inputData.nextDouble();
        inputData.nextLine();

        double total = 0;
        int giftCount = 0;
        String choice = "yes";


        while (choice.equalsIgnoreCase("yes")) {

            System.out.println("\nEnter the gift name:");
            String giftName = inputData.nextLine();

            System.out.println("Enter the gift price: $");
            double giftPrice = inputData.nextDouble();
            inputData.nextLine();


            if (giftPrice > 0) {

                total = total + giftPrice;
                giftCount++;

                System.out.println(giftName + " added successfully!");

                if (total > budgetEntry) {
                    System.out.println("Warning! You have exceeded your budget.");
                } else {
                    System.out.println("You are still within your budget.");
                }

            } else {
                System.out.println("Invalid gift price!");
            }

            System.out.println("\nDo you want to add another gift? (yes/no)");
            choice = inputData.nextLine();
        }

        double remaining = budgetEntry - total;

        System.out.println("\n==============================");
        System.out.println("MY HOLIDAY SHOPPING REPORT");
        System.out.println("==============================");

        System.out.println("Shopper Name: " + name.toUpperCase());
        System.out.println("Total Gifts: " + giftCount);

        System.out.printf("Holiday Budget: $%.2f%n", budgetEntry);
        System.out.printf("Total Spending: $%.2f%n", total);
        System.out.printf("Money Remaining: $%.2f%n", remaining);

        if (total <= budgetEntry) {
            System.out.println("Congratulations! You stayed within your budget.");
        } else {
            System.out.println("You have exceeded your holiday budget.");
        }


        System.out.println("\nHOLIDAY SHOPPING STARS");

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\nHappy Holidays, " + name + "!");

        inputData.close();
    }
}
