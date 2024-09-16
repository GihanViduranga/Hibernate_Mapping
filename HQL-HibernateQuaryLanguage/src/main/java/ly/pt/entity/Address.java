package ly.pt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Address {
    @Id
    private int addressId;
    private String housingNumber;
    private String street;
    private String city;
    @ManyToOne //owner's side
    @JoinColumn(name = "Id")
    private Student student;

    public Address() {
    }

    public Address(int addressId, String housingNumber, String street, String city, Student student) {
        this.addressId = addressId;
        this.housingNumber = housingNumber;
        this.street = street;
        this.city = city;
        this.student = student;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getHousingNumber() {
        return housingNumber;
    }

    public void setHousingNumber(String housingNumber) {
        this.housingNumber = housingNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", housingNumber='" + housingNumber + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", student=" + student +
                '}';
    }
}
