package com.modern.process;

public class LoanAccount extends Account {
    private LoanType loanType;
    private LoanStatus loanStatus;

    public LoanAccount(int customerOrder, String name, String surname, LoanType loanType, LoanStatus loanStatus) {
        super(customerOrder, name, surname);
        this.loanType = loanType;
        this.loanStatus = loanStatus;
    }

    public LoanType getLoanType() {
        return loanType;
    }

    public void setLoanType(LoanType loanType) {
        this.loanType = loanType;
    }

    public LoanStatus getLoanStatus() {
        return loanStatus;
    }

    public void setLoanStatus(LoanStatus loanStatus) {
        this.loanStatus = loanStatus;
    }
}
