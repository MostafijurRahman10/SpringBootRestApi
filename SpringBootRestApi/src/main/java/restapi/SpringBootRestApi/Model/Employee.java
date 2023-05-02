package restapi.SpringBootRestApi.Model;


import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
@Table(name="employee")
public class Employee {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private long id ;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "lirst_name")
    private  String lastName;

    @Column(name = "email_id")
    private  String emailId;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
