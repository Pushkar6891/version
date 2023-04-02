package com.company.principles.solid.singleresponsibilityprinciple.problem;

public class BankService {

    /**
     * Banking Operations : deposit
     *
     * @param amount
     * @param accountNo
     * @return
     */
    public long deposit(long amount, String accountNo) {
        //deposit amount
        return 0;
    }

    /**
     * Banking Operations : withdraw
     *
     * @param amount
     * @param accountNo
     * @return
     */
    public long withdraw(long amount, String accountNo) {
        //withdraw amount
        return 0;
    }

    /**
     * Load Related info
     *
     * @param loanType
     */
    public void getLoanInterestInfo(String loanType) {
        if ("homeLoan".equals(loanType)) {
            //do some job
        }
        if ("personalLoan".equals(loanType)) {
            //do some job
        }
        if ("carLoan".equals(loanType)) {
            //do some job
        }
    }

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

    /**
     * Printing passbook details
     *
     */
    public void printPassbook() {
        //update transaction info in passbook
    }
}
