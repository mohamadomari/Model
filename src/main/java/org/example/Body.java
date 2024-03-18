package org.example;

public class Body {
    String customerName;
    Double amount;
    Account account;

    public Body() {
    }
    public Body(String customerName, Double amount, Account account) {
        this.customerName = customerName;
        this.amount = amount;
        this.account = account;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
