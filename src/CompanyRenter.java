public class CompanyRenter extends Renter{
    String companyName;
    String companyAddress;
    String companyPhoneNumber;
    String  CRN;

    public CompanyRenter(String name, String address, String postNumber, String city, String PhoneNumber, String email, String companyName, String companyAddress, String companyPhoneNumber, String CRN) {
        super(name, address, postNumber, city, PhoneNumber, email);
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.companyPhoneNumber = companyPhoneNumber;
        this.CRN = CRN;
    }

    @Override
    public String toString() {
        return "CompanyRenter{" +
                "companyName='" + companyName + '\'' +
                ", companyAddress='" + companyAddress + '\'' +
                ", companyPhoneNumber=" + companyPhoneNumber +
                ", CRN=" + CRN +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", postNumber=" + postNumber +
                ", city='" + city + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }
}

