package com.company.principles.solid.singleresponsibilityprinciple.solution;

public class LoanService {

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
}