package com.learning.elite.cafe;


class Bank {

    //Memeber Variables
    int balance;

    //Member Functions
    public int withDrawFunds(int amount ){
        if(balance > 0) {
            balance = balance - amount;
            return amount;
        } else {

            System.out.println("Not enough funds in the account!");
            return 0;
        }
    }

    public boolean depositFunds(int amount){
        if(amount > 0){
            balance = balance + amount;
            return true;
        }

        System.out.println("Invalid amount!");
        return false;
    }

}


class ICICI extends Bank{



}

class HDFC extends Bank {

}


class SBI extends Bank {

}


public class InheritenceConcept {

    public static void main(String[] args) {
        ICICI icici = new ICICI();
        icici.withDrawFunds(100);


        HDFC hdfc = new HDFC();
        hdfc.withDrawFunds(1000);


        SBI sbi = new SBI();
        sbi.withDrawFunds(1000);
    }
}
