package GCashPackage;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class gCashShareALoad {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, User> hashMap = new HashMap<>();

        hashMap.put("09175861661", new User("BOB", 100.0f));
        hashMap.put("09175861662", new User("MARLEY", 100.0f));
        hashMap.put("09175861663", new User("SETH", 100.0f));
        hashMap.put("09175861664", new User("RYAN", 100.0f));
        hashMap.put("09175861665", new User("FRITZ", 100.0f));

        System.out.println("**Hi Welcome to Gcash! Please Register your account**");
        System.out.print("Input your Number: ");
        String userInput = scanner.nextLine();

        if (hashMap.containsKey(userInput)) {
            System.out.println("Number already exists. Exiting the program.");
            return;
        }

        System.out.print("Input Name: ");
        String userValue = scanner.nextLine();

        if (userValue == null || userValue.isEmpty()) {
            System.out.println("Name must not be empty!");
            return;
        }

        float userFloatValue = 100.0f;
        System.out.println("Default balance is added to your account!: " + userFloatValue);
        hashMap.put(userInput, new User(userValue, userFloatValue));

        System.out.println("**Share a load**");
        System.out.print("Sender mobile number: ");
        String senderNumber = scanner.nextLine();

        if (!hashMap.containsKey(senderNumber)) {
            System.out.println("Recipient " + senderNumber + " not found!");
            return;
        }

        System.out.print("Recipient mobile number: ");
        String recipientNumber = scanner.nextLine();

        if (recipientNumber.equals(senderNumber)) {
            System.out.println("Sender and recipient shouldn't be the same!");
            return;
        }

        float senderBalance = hashMap.get(senderNumber).getBalance();
        float recipientBalance = hashMap.get(recipientNumber).getBalance();
        System.out.println("Sender balance: " + senderBalance);
        System.out.println("Recipient balance: " + recipientBalance);

        while (true) {
            System.out.print("Enter amount (enter a valid number): ");
            float amountEntered = scanner.nextFloat();

            if (amountEntered > senderBalance) {
                System.out.println("Low Balance. Please try again.");
            } else {
                float difference = senderBalance - amountEntered;
                senderBalance-=difference;
                recipientBalance+=difference;
                System.out.println("Difference: " + difference);
                System.out.println("Sender Balance: " + senderBalance);
                System.out.println("Receiver Balance: " + recipientBalance);
                break;
            }
        }
    }
}