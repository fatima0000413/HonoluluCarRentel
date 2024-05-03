public class PrivateRenter extends Renter{
    String driverLicenceNumber;
    String driverSinceDate;
    public PrivateRenter(String name, String address, String postNumber, String city, String phoneNumber, String email, String driverLicenceNumber, String driverSinceDate) {
        super(name, address, postNumber, city, phoneNumber, email);
        this.driverLicenceNumber = driverLicenceNumber;
        this.driverSinceDate = driverSinceDate;
    }

    @Override
    public String toString() {
        return "PrivateRenter{" +
                "driverLicenceNumber='" + driverLicenceNumber + '\'' +
                ", driverSinceDate=" + driverSinceDate +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", postNumber=" + postNumber +
                ", city='" + city + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }
}

