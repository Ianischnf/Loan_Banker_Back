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


    @Column( name = "FirstName")
    private String FirstName;

    @Column( name = "LastName")
    private String LastName;

    @Column( name = "email")
    private String Email;

    @Column( name = "password")
    private String Password;

    @Enumerated(EnumType.STRING)
    private Roles roles = Roles.CLIENT;


    public Client(){}

    public Client(String FirstName, String LastName, String Email, String Password, Roles roles){

        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Email = Email;
        this.Password = Password;
        this.roles =  roles;

    }

    public Client(Long ClientId, String FirstName, String LastName, String Email, String Password, Roles roles){

        this.clientId = ClientId;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Email = Email;
        this.Password = Password;
        this.roles =  roles;

    }


    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }
}
