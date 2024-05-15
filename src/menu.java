import java.io.IOException;
import java.util.Scanner;

public class menu {
    public static void hovedMenu(Scanner scan) throws IOException {

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Create Car");
            System.out.println("2. Create Customer");
            System.out.println("3. Create Rental");
            System.out.println("4. Change Car Information");
            System.out.println("5. Change Customer Information");
            System.out.println("6. Show Cars");
            System.out.println("7. Show Customers");
            System.out.println("8. Show Rentals");
            System.out.println("9. Exit");

            System.out.print("Enter your choice: ");
            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    Main.createCar();
                    break;
                case 2:
                    Main.createRenter();
                    break;
                case 3:

                    break;
                case 4:
                    Main.changeCarInfo();
                    break;
                case 5:
                    //ShowCars();

                    break;
                case 6:
                    //ShowRenter():

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        }
    }
}
