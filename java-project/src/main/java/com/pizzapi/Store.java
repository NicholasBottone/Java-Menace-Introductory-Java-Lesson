package com.pizzapi;

public class Store {

    private String storeName;

    public Store(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreName() {
        return storeName;
    }

    public void placeOrder(Order order, CreditCard creditCard) throws PizzaException {

        if (order == null) {
            throw new PizzaException("Order object not provided upon placing order!");
        }

        if (order.getNumberOfItems() < 2) {
            throw new PizzaException("There aren't enough items in your order.  Add at least 2 items to your order.");
        }

        if (creditCard == null) {
            throw new PizzaException("CreditCard object not provided upon placing order!");
        }

        System.out.println("TECHIO> message --channel \"OUTPUT\" Successfully placed order for " + order.getCustomer().getName() + " with card ending in " + creditCard.getLastDigits() + ".");
        System.out.println("TECHIO> message --channel \"OUTPUT\" " + order.getNumberOfItems() + " item(s) will be delieved to " + order.getCustomer().getAddress() + " soon.");

    }

}