package com.example.LoanRequest.entity;


import com.example.LoanRequest.enumerations.Roles;
import jakarta.persistence.*;

@Entity
@Table(name = "banker")
public class Banker {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    @Column(name = "bankerId")
    private Long bankerId;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Enumerated(EnumType.STRING)
    private Roles roles = Roles.BANKER;

    public Banker(){}

    public Banker(String FirstName, String LastName, String Email, String Password, Roles roles){
        this.firstName = FirstName;
        this.lastName = LastName;
        this.email = Email;
        this.password = Password;
        this.roles = roles;
    }

    public Banker(Long BankerId, String FirstName, String LastName, String Email, String Password, Roles roles){
        this.bankerId = BankerId;
        this.firstName = FirstName;
        this.lastName = LastName;
        this.email = Email;
        this.password = Password;
        this.roles = roles;
    }

    public Long getBankerId() {
        return bankerId;
    }

    public void setBankerId(Long bankerId) {
        this.bankerId = bankerId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }
}
