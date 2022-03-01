package com.mycompany.agency;

public class Staff
{
    private StaffMember[] staffList;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the list of staff members.
    //-----------------------------------------------------------------
    public Staff()
    {
        staffList = new StaffMember[6];

        // TODO 1: Add 6 emploees to the staffList

        staffList[0] = new Intern("Bob Ross", "34 Tree Place", "537-384-1995");
        staffList[1] = new Intern("The Dude", "2 Walter Drive", "123-344-9800");
        
        staffList[2] = new StaffEmployee("Douglas Adams", "42 Alpha Centuri Lane", 
                "999-555-4242", "743-88-1818", 55.42);
        staffList[3] = new StaffEmployee("Dwayne Johnson", "99 Rock Boulevard",
                "326-324-9836", "880-26-1112", 43.27);
        
        staffList[4] = new TempEmployee("John Cooper", "378 Mini Lane", "757-392-8832", 
                "257-29-1534", 26.90);
        
        staffList[5] = new Executive("Viggo Mortenson", "3 Infinite Place", "631-348-8836",
                "563-00-1743", 75.84);
        
        ((TempEmployee)staffList[4]).addHours(40);
        ((Executive)staffList[5]).awardBonus(500.00);
    }

    //-----------------------------------------------------------------
    //  Pays all staff members.
    //-----------------------------------------------------------------
    public void payday ()
    {
        double amount;

        for (int count=0; count < staffList.length; count++)
        {
            System.out.println(staffList[count]);

            amount = staffList[count].pay();  // polymorphic

            if (amount == 0.0)
                System.out.println("Thanks!");
            else
                System.out.println("Paid: " + amount);

            System.out.println("-----------------------------------");
        }
    }
}
