package com.yourself;

public class CreditCard {

    private String cardNumber;
    private String expiration;
    private String cvv;

    public CreditCard(String cardNumber, String expiration, String cvv) throws PizzaException {

        try {
            Long.parseLong(cardNumber);
        } catch (Exception e) {
            throw new PizzaException("Credit card number must be a 16 digit long number.");
        }

        if (cardNumber.length() != 16) {
            throw new PizzaException("Credit card number must be a 16 digit long number.");
        }

        if (expiration == null || expiration.length() > 5 || expiration.length() < 4) {
            throw new PizzaException("Credit card expiration must be in MMYY format.");
        }

        try {
            Integer.parseInt(cvv);
        } catch (Exception e) {
            throw new PizzaException("Credit card cvv must be a 3 digit long number.");
        }

        if (cvv.length() != 3) {
            throw new PizzaException("Credit card cvv must be a 3 digit long number.");
        }

        this.cardNumber = cardNumber;
        this.expiration = expiration;
        this.cvv = cvv;

    }

    public String getLastDigits() {
        return cardNumber.substring(cardNumber.length()-4);
    }

    public String getExpiration() {
        return expiration;
    }

    public String getCvv() {
        return cvv;
    }

}