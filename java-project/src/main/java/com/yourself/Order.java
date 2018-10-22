package com.yourself;

public class Order {

    private Customer customer;
    private Store store;
    private int numberOfItems = 0;

    public Order(Customer customer, Store store) {

        this.customer = customer;
        this.store = store;

        if (customer == null) {
            throw new PizzaException("Customer object not provided when creating new order.");
        }

        if (store == null) {
            throw new PizzaException("Store object not provided when creating new order.");
        }

    }

    public Customer getCustomer() {
        return customer;
    }

    public Store getStore() {
        return store;
    }

    public void addItem(String item) {
        numberOfItems++;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

}