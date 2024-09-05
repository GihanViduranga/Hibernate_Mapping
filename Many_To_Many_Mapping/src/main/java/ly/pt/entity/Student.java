package ly.pt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Student {
    @Id
    private int studentId;
    private String name;
    private Address address;



    public Student() {
    }


}
