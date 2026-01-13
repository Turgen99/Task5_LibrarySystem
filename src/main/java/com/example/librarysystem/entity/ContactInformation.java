package com.example.librarysystem.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "contract_info")
public class ContactInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String phoneNumber;
    private String alternateEmail;


    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getAlternateEmail() { return  alternateEmail;}
    public void setAlternateEmail(String alternateEmail) { this.alternateEmail = alternateEmail; }
}
