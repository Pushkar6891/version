package com.company.principles.solid.openclosedprinciple.solution;

public interface NotificationService {

    public void sendOTP(String medium);
    public void sendTransactionReport(String medium);

}