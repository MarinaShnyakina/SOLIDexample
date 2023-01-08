package ru.synergy.solidexample.models;

public class Order {

    String customerName = "Marina";
    String customeEmail = "schnyakina@yandex.ru";
    private String id;

    public boolean isValid() { return false; }

    public String getCustomerName() { return customerName; }

    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public String getCustomeEmail() { return  customeEmail; }

    public void setCustomeEmail(String customeEmail) { this.customeEmail = customeEmail; }

    public Item[] getItems() { return new Item[0]; }

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }
}




