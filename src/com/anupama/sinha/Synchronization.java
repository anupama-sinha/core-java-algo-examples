package com.anupama.sinha;
// TODO Coding in Progress
class AccountBalance extends Thread{
    Integer balance = 0;

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public void increaseBalance(){
        this.balance = this.balance + 100;
        System.out.println(this.getName() + "Balance :: " + balance);
    }

    public void decreaseBalance(){
        this.balance = this.balance - 100;
        System.out.println(this.getName() + "Balance :: " + balance);
    }
}

public class Synchronization {
    public static void main(String[] args) {
        Thread t1 = new Thread();
        Thread t2 = new Thread();

        AccountBalance ac1 = new AccountBalance();
        AccountBalance ac2= new AccountBalance();
        ac2.setPriority(10);
        ac1.increaseBalance();
        ac2.decreaseBalance();


    }
}
