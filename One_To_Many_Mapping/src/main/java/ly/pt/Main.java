package ly.pt;

import ly.pt.config.FactoryConfiguration;
import ly.pt.entity.Address;
import ly.pt.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Address address1 = new Address();
        address1.setAddressId(2);
        address1.setHousingNumber("47/a1");
        address1.setStreet("Galle Road");
        address1.setCity("Colombo");

        Address address2 = new Address();
        address2.setAddressId(3);
        address2.setHousingNumber("12/b2");
        address2.setStreet("Kandy Road");
        address2.setCity("Kandy");

        List<Address> addressArrayList = new ArrayList<>();
        addressArrayList.add(address1);
        addressArrayList.add(address2);

        Student student = new Student();
        student.setStudentId(2);
        student.setName("Ishani");
        student.setAddress(addressArrayList);
        address1.setStudent(student);
        address2.setStudent(student);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.persist(address1);
        session.persist(address2);
        session.persist(student);

        transaction.commit();
        session.close();
    }
}