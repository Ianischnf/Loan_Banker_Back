package com.example.LoanRequest.entity;

import com.example.LoanRequest.enumerations.Roles;
import jakarta.persistence.*;

@Entity
@Table(name = "client")

public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column( name = "clientId")
    private Long clientId;


    @Column( name = "firstname")
    private String firstName;

    @Column( name = "lastname")
    private String lastName;

    @Column( name = "email")
    private String email;

    @Column( name = "password")
    private String password;

    @Enumerated(EnumType.STRING)
    private Roles roles = Roles.CLIENT;


    public Client(){}

    public Client(String FirstName, String LastName, String Email, String Password, Roles roles){

        this.firstName = FirstName;
        this.lastName = LastName;
        this.email = Email;
        this.password = Password;
        this.roles =  roles;

    }

    public Client(Long ClientId, String FirstName, String LastName, String Email, String Password, Roles roles){

        this.clientId = ClientId;
        this.firstName = FirstName;
        this.lastName = LastName;
        this.email = Email;
        this.password = Password;
        this.roles =  roles;

    }


    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstname) {
        this.firstName = firstname;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastname) {
        this.lastName = lastname;
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
