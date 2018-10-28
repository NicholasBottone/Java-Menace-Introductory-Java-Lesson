package com.pizzapi;

public class Customer {

    private String name;
    private String address;
    private String email;

    public Customer(String name, String address, String email) throws PizzaException {
        this.name = name;
        this.address = address;
        this.email = email;

        if (name == null || name.length() < 1) {
            throw new PizzaException("No name was provided for the customer.");
        }

        if (address == null || address.length() < 1) {
            throw new PizzaException("No address was provided for the customer.");
        }

        if (email == null || !email.contains("@") || !email.contains(".")) {
            throw new PizzaException("Invalid email address provided for customer!  Ensure your email has the @ sign and at least one dot.");
        }
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

}