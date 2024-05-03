import java.io.*;
import java.time.LocalDate;
import java.util.*;
public class Main {
    private static final String CAR_FILE = "Car.txt";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //CompanyRenter.menu();
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
                    createCar();
                    break;
                case 2:
                    createRenter();
                    break;
                case 3:

                    break;
                case 4:
                    changeCarInfo();
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

    public static Renter createRenter() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose renter type:");
        System.out.println("1. Private Renter");
        System.out.println("2. Company Renter");
        System.out.print("Enter your choice: ");
        int choice = scan.nextInt();
        scan.nextLine();

        Renter renter = null;
        if (choice == 1) {
            renter = createPrivateRenter();
        } else if (choice == 2) {
            renter = createCompanyRenter();
        } else {
            System.out.println("Invalid choice");
        }
        return renter;
    }

    public static PrivateRenter createPrivateRenter() {
        Scanner scan = new Scanner(System.in);
        List<String> customerInfo = new ArrayList<>();

        System.out.println("Enter renter name:");
        String name = scan.nextLine();
        customerInfo.add(name);

        System.out.println("Enter address:");
        String address = scan.nextLine();
        customerInfo.add(address);

        System.out.println("Enter post number:");
        String postNumber = scan.next();
        scan.nextLine();
        customerInfo.add(postNumber); //virker ikke fordi arraylist er String

        System.out.println("Enter city:");
        String city = scan.nextLine();
        customerInfo.add(city);

        System.out.println("Enter phone number:");
        String phoneNumber = scan.next();
        scan.nextLine();
        customerInfo.add(phoneNumber); //igen det en int og ikke String

        System.out.println("Enter email:");
        String email = scan.nextLine();
        customerInfo.add(email);

        System.out.println("Enter driver's license number:");
        String driverLicenceNumber = scan.nextLine();
        customerInfo.add(driverLicenceNumber);

        System.out.println("Enter driver since date:");
        String driverSinceDate = scan.next();
        customerInfo.add(driverSinceDate); //double ikke en String
        return new PrivateRenter(name, address, postNumber, city, phoneNumber, email, driverLicenceNumber, driverSinceDate);
    }

    public static CompanyRenter createCompanyRenter() {
        Scanner scan = new Scanner(System.in);
        List<String> companyInfo = new ArrayList<>();

        System.out.println("Enter renter name:");
        String name = scan.nextLine();
        companyInfo.add(name);

        System.out.println("Enter address:");
        String address = scan.nextLine();
        companyInfo.add(address);

        System.out.println("Enter post number:");
        String postNumber = scan.next();
        scan.nextLine();
        companyInfo.add(postNumber);

        System.out.println("Enter city:");
        String city = scan.nextLine();
        companyInfo.add(city);

        System.out.println("Enter phone number:");
        String phoneNumber = scan.next();
        scan.nextLine();
        companyInfo.add(phoneNumber);

        System.out.println("Enter email:");
        String email = scan.nextLine();
        companyInfo.add(email);

        System.out.println("Enter company name:");
        String companyName = scan.nextLine();
        companyInfo.add(companyName);

        System.out.println("Enter company address:");
        String companyAddress = scan.nextLine();
        companyInfo.add(companyAddress);

        System.out.println("Enter company phone number:");
        String companyPhoneNumber = scan.next();
        scan.nextLine();
        companyInfo.add(companyPhoneNumber);

        System.out.println("Enter CRN:");
        String CRN = scan.next();
        companyInfo.add(CRN);
        return new CompanyRenter(name, address, postNumber, city, phoneNumber, email, companyName, companyAddress, companyPhoneNumber, CRN);
    }

    public static void createCar() {
        Scanner scan = new Scanner(System.in);
        List<String> carInfo = new ArrayList<>();

        System.out.println("Enter registration number:");
        String registrationNumber = scan.next();
        scan.nextLine();
        carInfo.add(registrationNumber);

        System.out.println("Enter brand:");
        String brand = scan.nextLine();
        carInfo.add(brand);

        System.out.println("Enter model:");
        String model = scan.nextLine();
        carInfo.add(model);

        System.out.println("Enter fuel type:");
        String fuelType = scan.nextLine();
        carInfo.add(fuelType);

        String firstRegistrationDate = LocalDate.now().toString();
        carInfo.add(firstRegistrationDate);

        System.out.println("Enter odometer reading:");
        int odometerReading = scan.nextInt();
        scan.nextLine();
        carInfo.add(Integer.toString(odometerReading));

        saveToFile(carInfo, CAR_FILE);

        System.out.println("Car information saved successfully.");
    }

    public static void saveToFile(List<String> list, String CAR_FILE) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(CAR_FILE, true))) {
            for (String line : list) {
                writer.println(line + " ");
            }
        } catch (IOException e) {
            System.err.println("Error saving data to file: ");
        }
    }

    public static void changeCarInfo() {
        Scanner scan = new Scanner(System.in);
        List<String> carInfo = new ArrayList<>();

        System.out.println("Enter registration number of the car you want to change:");
        String registrationNumber = scan.next();
        scan.nextLine();
        carInfo.add(registrationNumber);

        System.out.println("Enter new brand:");
        String newBrand = scan.nextLine();
        carInfo.add(newBrand);

        System.out.println("Enter new model:");
        String model = scan.nextLine();
        carInfo.add(model);

        System.out.println("Enter new fuel type:");
        String fuelType = scan.nextLine();
        carInfo.add(fuelType);

        String firstRegistrationDate = LocalDate.now().toString();
        carInfo.add(firstRegistrationDate);

        System.out.println("Enter new odometer reading:");
        int odometerReading = scan.nextInt();
        scan.nextLine();
        carInfo.add(Integer.toString(odometerReading));



        // skriver det nye infor ind i filne
        writeNewInfo(carInfo);
        System.out.println("Car information updated successfully.");
    }

    public static void writeNewInfo(List<String> carInfo) {
        //henter fra info fra  fil
        List<String> existingCarInfo = readFromFile(CAR_FILE);
        //søger efter regi nummer og erstatter info

        for (int i = 0; i < existingCarInfo.size(); i++) {
            String line = existingCarInfo.get(i);
            if (line.startsWith(carInfo.get(0))) {
                existingCarInfo.set(i, String.join(" ", carInfo));
                break;
            }
        }

        // skriver opdateret infor tilbage til fil
        saveToFile(existingCarInfo, CAR_FILE);
    }

    public static List<String> readFromFile(String CAR_FILE) {
        List<String> lines = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(CAR_FILE))) {
            while (scanner.hasNextLine()) {
                lines.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: ");
        }
        return lines;
    }
}






