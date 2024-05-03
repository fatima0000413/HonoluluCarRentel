import java.time.LocalDate;
import java.util.Date;

public class Luxury extends Car {
    boolean automaticGear;
    boolean airCondition;
    boolean cruiseControl;
    boolean leatherSeats;

    public Luxury(String registrationNumber, String brand, String model, String fuelType, Date firstRegistrationDate, int odometerReading, boolean automaticGear, boolean airCondition, boolean cruiseControl, boolean leatherSeats) {
        super(registrationNumber, brand, model, fuelType, firstRegistrationDate, odometerReading);
        this.automaticGear = automaticGear;
        this.airCondition = airCondition;
        this.cruiseControl = cruiseControl;
        this.leatherSeats = leatherSeats;

    }

    @Override
    public String toString() {
        return "Luxury{" +
                "automaticGear=" + automaticGear +
                ", airCondition=" + airCondition +
                ", cruiseControl=" + cruiseControl +
                ", leatherSeats=" + leatherSeats +
                ", registrationNumber=" + registrationNumber +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", firstRegistrationDate=" + firstRegistrationDate +
                ", odometerReading=" + odometerReading +
                '}';
    }
}

