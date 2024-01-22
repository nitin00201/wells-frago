package com.wellsfargo.counselor.entity;


import jakarta.persistence.*;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne
    @JoinColumn(name = "client_id", unique = true)
    private Client client;

    public Portfolio() {
        // Default constructor for JPA
    }

    public Portfolio(String name, Client client) {
        this.name = name;
        this.client = client;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
