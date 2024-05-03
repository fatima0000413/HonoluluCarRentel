public class Renter {
    String name;
    String address;
    String postNumber;
    String city;
    String phoneNumber;
    String email;

    public Renter(String name, String address, String postNumber, String city, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.postNumber = postNumber;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Renter{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", postNumber=" + postNumber +
                ", city='" + city + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }
}

