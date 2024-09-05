package ly.pt;


import ly.pt.config.FactoryConfiguration;
import ly.pt.entity.Address;
import ly.pt.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Address address = new Address();
        address.setAddressId(1);
        address.setHousingNumber("47/a1");
        address.setStreet("Mastiya Road");
        address.setCity("Wadduwa");

        Student student = new Student();
        student.setStudentId(1);
        student.setName("Gihan");
        student.setAddress(address);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.save(address);
        session.save(student);
        transaction.commit();
        session.close();


    }
}