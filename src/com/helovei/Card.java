package com.helovei;

public class Card {
    private String cardNumber;
    private String password;
    private String accountBalance;
    private String owner;

    public String getCardNumber() {
        return cardNumber;
    }

    public String getPassword() {
        return password;
    }

    public String getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(String accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "Card{" +
                "card Number='" + cardNumber + '\'' +
                ", accountBalance='" + accountBalance + '\'' +
                '}';
    }

    public Card(String cardNumber, String password, String accountBalance, String owner) {
        this.cardNumber = cardNumber;
        this.password = password;
        this.accountBalance = accountBalance;
        this.owner = owner;
    }

    public Card() {
    }

}
