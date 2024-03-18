package org.example;

public class Account
{
    Person person;
    int accountNumber;
    int visaCard;

    public Account()
    {
    }

    public Account(Person person, int accountNumber, int visaCard) {
        this.person = person;
        this.accountNumber = accountNumber;
        this.visaCard = visaCard;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getVisaCard() {
        return visaCard;
    }

    public void setVisaCard(int visaCard) {
        this.visaCard = visaCard;
    }
}
