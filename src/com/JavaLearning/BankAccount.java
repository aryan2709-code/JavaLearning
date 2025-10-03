package com.JavaLearning;
// Encapsulation
public class BankAccount {
    private long accountNumber;
    private double balance;

    public void deposit(double amount)
    {
        if(amount > 0)
        {
            this.balance += amount;
            System.out.println("Deposited: " + amount);
        }
        else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount)
    {
        if(amount > 0 && amount <= this.balance)
        {
            this.balance -= amount;
            System.out.println("Withdrew " + amount);
        }
        else
        {
            System.out.println("Invalid amount or insufficient balance");
        }
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }


    public static void main(String[] args) {
        System.out.println("Bank Account Class");
    }
}
