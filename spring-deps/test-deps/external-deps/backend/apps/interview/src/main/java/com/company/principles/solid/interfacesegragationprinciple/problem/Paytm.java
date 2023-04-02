package com.company.principles.solid.interfacesegragationprinciple.problem;

public class Paytm implements UPIPayments {

    public void payMoney() {

    }

    public void getScratchCard() {

    }

    @Override
    public void getCashBackAsCreditBalance() {
        // unnecessary adding this method
    }


}