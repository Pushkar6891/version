package com.company.principles.solid.singleresponsibilityprinciple.solution;

public class NotificationService {
    /**
     * Notification related info
     *
     * @param medium
     */
    public void sendOTP(String medium) {
        if ("email".equals(medium)) {
            //write email related logic
            //use JavaMailSenderAPI
        }
        if ("mobile".equals(medium)) {
            //write logic using twillio API
        }
    }
}