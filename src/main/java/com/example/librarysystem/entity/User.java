package com.example.librarysystem.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String username;
    private  String password;
    private  String email;

    // relations
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contact_information_id", referencedColumnName = "id")
    private ContactInformation contactInformation;

    public Long getId() { return id;}
    public void setId(Long id) { this.id = id;}

    public String getUsername(){return username;}
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Address getAddress() { return address; }
    public void setAddress(Address address) { this.address = address; }

    public ContactInformation getContactInformation() { return contactInformation; }
    public void setContractInformation(ContactInformation contactInformation) { this.contactInformation = contactInformation; }
}
