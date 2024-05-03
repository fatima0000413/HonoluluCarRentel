import java.time.LocalDate;
import java.util.*;
public class Car {
    String registrationNumber;
    String brand;
    String model;
    String fuelType;
    Date firstRegistrationDate;
   int odometerReading;

    public Car(String registrationNumber, String brand, String model, String fuelType, Date firstRegistrationDate, int odometerReading) {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
        this.firstRegistrationDate = firstRegistrationDate;
        this.odometerReading = odometerReading;

    }



    @Override
    public String toString() {
        return "Car{" +
                "registrationNumber=" + registrationNumber +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", firstRegistrationDate=" + firstRegistrationDate +
                ", odometerReading=" + odometerReading +
                '}';
    }


}
