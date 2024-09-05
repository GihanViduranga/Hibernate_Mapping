package ly.pt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Address {
    @Id
    private int addressId;
    private String housingNumber;
    private String street;
    private String city;

    public Address() {
    }


}
