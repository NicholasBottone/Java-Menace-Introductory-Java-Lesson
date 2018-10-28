package com.yourself;

/**
 * This is the final solution code for Pizza.java that will cause PizaTest.java to return successful.
 */
public class PizzaSolutionCode {

    public static void orderPizza() throws PizzaException {

        Customer greg = new Customer("Greg", "123 Sesame Street", "thegongoliers@fgschools.com");

        Store nearestStore = StoreLocator.findClosestStoreToCustomer(greg);

        Order order = new Order(greg, nearestStore);
        order.addItem("LARGE CHEESE PIZZA");
        order.addItem("SMALL SODA");

        CreditCard creditCard = new CreditCard("4539166576384037", "0520", "397");

        nearestStore.placeOrder(order, creditCard);

    }

}