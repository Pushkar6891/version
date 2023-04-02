package com.company.principles.solid.interfacesegragationprinciple.solution;

public class GooglePay implements UPIPayments, CashBackManager {

    public void payMoney() {

    }

    public void getScratchCard() {

    }

    public void getCashBackAsCreditBalance() {
      //this features is there in gpay
    }
}