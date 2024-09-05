package ly.pt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Student {
    @Id
    private int studentId;
    private String name;
    @OneToOne
    private Address Address;

    public Student() {
    }

    public Student(int studentId, String name, ly.pt.entity.Address address) {
        this.studentId = studentId;
        this.name = name;
        Address = address;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ly.pt.entity.Address getAddress() {
        return Address;
    }

    public void setAddress(ly.pt.entity.Address address) {
        Address = address;
    }
}
