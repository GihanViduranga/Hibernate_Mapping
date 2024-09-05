package ly.pt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import java.util.List;

@Entity
public class Address {
    @Id
    private int addressId;
    private String housingNumber;
    private String street;
    private String city;
    @ManyToMany (mappedBy = "address")
    private List<Student> students;

    public Address() {
    }

    public Address(int addressId, String housingNumber, String street, String city, List<Student> students) {
        this.addressId = addressId;
        this.housingNumber = housingNumber;
        this.street = street;
        this.city = city;
        this.students = students;
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

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
