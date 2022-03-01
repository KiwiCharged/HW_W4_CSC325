package com.mycompany.agency;

// TODO 1: [DONE] Make TempEmployee a child of StaffEmploee
public class TempEmployee extends StaffEmployee {

    private int hoursWorked;

    //-----------------------------------------------------------------
    //  Constructor: Sets up this hourly employee using the specified
    //  information.
    //-----------------------------------------------------------------
    public TempEmployee(String eName, String eAddress, String ePhone,
            String socSecNumber, double rate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        hoursWorked = 0;
    }

    //-----------------------------------------------------------------
    // TODO 2: [DONE] Adds the specified number of hours to this employee's
    //  accumulated hours.
    //-----------------------------------------------------------------
    public void addHours(int moreHours) {
        hoursWorked = hoursWorked + moreHours;
    }
	
	
    //-----------------------------------------------------------------
    // TODO 3: [DONE] Computes and returns the pay for this hourly employee.
    //-----------------------------------------------------------------
    @Override
    public double pay()
    {
        return this.payRate * hoursWorked;
    }

    //-----------------------------------------------------------------
    // TODO 4: [DONE] Returns information about this hourly employee as a string.
    //-----------------------------------------------------------------
    @Override
    public String toString()
    {
       return super.toString() + "\nHours Worked: " + hoursWorked;
    }
}
