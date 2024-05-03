import java.time.LocalDate;
import java.util.Date;

public class Sport extends Car{
    int horsePower;

    public Sport(String registrationNumber, String brand, String model, String fuelType, Date firstRegistrationDate, int odometerReading, int horsePower) {
        super(registrationNumber, brand, model, fuelType, firstRegistrationDate, odometerReading);
        this.horsePower = horsePower;
    }
    @Override
    public String toString() {
        return "Sport{" +
                "horsePower=" + horsePower +
                ", registrationNumber=" + registrationNumber +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", firstRegistrationDate=" + firstRegistrationDate +
                ", odometerReading=" + odometerReading +
                '}';
    }


}
