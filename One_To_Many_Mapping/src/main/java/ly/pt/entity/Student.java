package ly.pt.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Student {
    @Id
    private int studentId;
    private String name;
    @OneToMany (mappedBy = "student")//inverse side
    private List<Address> address;


    public Student() {
    }

    public Student(int studentId, String name, List<Address> address) {
        this.studentId = studentId;
        this.name = name;
        this.address = address;
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

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }
}
