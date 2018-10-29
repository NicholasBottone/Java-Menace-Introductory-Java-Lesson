package com.yourself;

import com.pizzapi.*;

/**
 * This is the final solution code for Pizza.java that will cause PizaTest.java to return successful.
 */
public class PizzaSolutionCode {

    public static void orderPizza() throws PizzaException {

        Customer greg = new Customer("Greg", "123 Sesame Street", "thegongoliers@gmail.com");

        Store gregStore = StoreLocator.findClosestStoreToCustomer(greg);

        Order gregOrder = new Order(greg, gregStore);
        gregOrder.addItem("LARGE CHEESE PIZZA");
        gregOrder.addItem("SMALL SODA");

        CreditCard gregCard = new CreditCard("4539166576384037", "0520", "397");

        gregStore.placeOrder(gregOrder, gregCard);

    }

}
