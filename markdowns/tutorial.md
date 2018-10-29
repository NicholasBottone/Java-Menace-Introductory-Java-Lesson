## Step One: Who is the customer?
Our first step will be to tell the pizza place who the customer is.  When we tell the pizza place who the customer is, we should probably include some important information like the name, street address, and an email address.

To store this customer data in the computer, use something called a class.  A **class** gives us *a template that we can use to define objects*.  An **object** is *an instance of a class with defined variables*.  For us, those variables will include name and address.  Once we plug these values into the template, we’ve created an object.

````java
new Customer("Greg", "123 Sesame Street", "thegongoliers@gmail.com");
````

We want to hold onto this object for later, so we have to give it a nickname.  By giving it a name, we assign the specific customer object (and all the data stored within it) to a variable.

You can name your variable anything you wish, as long as it doesn't have spaces.  It is common practice for the first letter of your variable name to begin with a lowercase letter, and for the first letter of every subsequent word to begin with a capital.  It is courteous for variable names to accurately but briefly descriptive the object they hold.  I will call my variable `greg`.  Another acceptable variable name is `customer`.

````java
Customer greg = new Customer("Greg", "123 Sesame Street", "thegongoliers@gmail.com");
````

## Step Two: Where is the pizza place?
Now that we have the `Customer` object setup, the second step will be to find the nearest pizza place.  To do this, we are going to use a method.  A **method** is like *a special trick that a class can do* (similar to how dogs can do special tricks).  We will be using a method to find the nearest store to the customer's address.

The method we need for this step is embedded in inside of a class called `StoreLocator`.  Think of `StoreLocator` like a folder that holds methods inside it related to finding a pizza store.

````java
StoreLocator.findClosestStoreToCustomer();
````

The dot in between `StoreLocator` and `findClosestStoreToCustomer()` is how we ask an object, "Hey, could you do this thing for me?"  For example, we could call `greg.getName()` to ask the `greg` object what its name was.  In this example, it would return `"Greg"`.

Likewise for this instance, we are calling out, "Hey `StoreLocator`!  Can you tell me what the closest store is?"  For this instance, however, the `StoreLocator` class does not know our location, because we have not yet provided it.  The `findClosestStoreToCustomer()` method has a **parameter**.  Often times methods need *additional input to do their calculations*.  Without the parameter, the method will not have enough information to do what it needs to do.  This specific method needs a `Customer` object for its calculations, since it needs to find the closest store to a customer.

````java
StoreLocator.findClosestStoreToCustomer(greg);
````

Now that we have the nearest store information, we need to assign it to a variable so we can keep it for later.  Remember that you may name your variable as you wish.  The variable name I have chosen is `gregStore`.

````java
Store gregStore = StoreLocator.findClosestStoreToCustomer(greg);
````

## Step Three: What is the order?
The next step will be to create our order.  I want a large cheese pizza and small soda.  To build the order, we will need to use another class called `Order`.

We will begin by creating a new `Order` object by providing two parameters: the `Customer` object and the `Store` object.  Be sure to assign the `Order` object to a variable.

````java
Order gregOrder = new Order(greg, gregStore);
````

The `Order` object has a method called `addItem()` that can add items to the order.  I will use it to add a large cheese pizza and small soda, but you can add any items that you want.

````java
gregOrder.addItem("LARGE CHEESE PIZZA");
gregOrder.addItem("SMALL SODA");
````

## Step Four: How do we provide payment?
Last but not least, we must provide a credit card number to the pizza place so they can process the payment.  We will be creating a new `CreditCard` object from the `CreditCard` class in a process very similar to how we created the `Customer` object.  The three parameters this time are the 16-digit card number, the MM/YY expiration date, and the 3-digit CVV number.  Don't forget to assign the object to a variable.

````java
CreditCard gregCard = new CreditCard("4539166576384037", "05/20", "397");
````

*Psst...* don't use a real credit card.  Just be sure the number you provide is 16 digits long.

## Submitting the order
The order is complete, now we must submit it to the pizza place!  The `Store` object has a method called `placeOrder()`.  It takes two arguments: the order and the card.

````java
gregStore.placeOrder(gregOrder, gregCard);
````

And that's all there is to it!  Continue on to the next page so you can use the code we just went over to fill out your own order.
