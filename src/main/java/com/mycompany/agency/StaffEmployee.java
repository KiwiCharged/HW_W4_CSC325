package com.mycompany.agency;

// TODO 1: [DONE] Make StaffEmployee a child of StaffEmploee
public class StaffEmployee extends StaffMember {

    protected String socialSecurityNumber;
    protected double payRate;

    //-----------------------------------------------------------------
    //  TODO 2: [DONE] Sets up this staff employee with the specified
    //  information. 
    //-----------------------------------------------------------------
    public StaffEmployee(String eName, String eAddress, String ePhone,
            String socSecNumber, double rate) {
        super(eName, eAddress, ePhone);
        socialSecurityNumber = socSecNumber;
        payRate = rate;
    }

    //-----------------------------------------------------------------
    // TODO 3: [DONE] complete the implementation of toString to return information 
    //          about a staff employee as a string.
    //-----------------------------------------------------------------
    @Override
    public String toString() {
        return super.toString() + "\nSocial Security Number: " + socialSecurityNumber
                + "\nPay Rate: " + payRate;
    }

    //-----------------------------------------------------------------
    // TODO 4:  [DONE] Returns the pay rate for this staff employee.
    //-----------------------------------------------------------------
    @Override
    public double pay() {
        return this.payRate;
    }
}
