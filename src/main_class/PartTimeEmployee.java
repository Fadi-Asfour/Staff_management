/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main_class;

/**
 *
 * @author HP
 */
public class PartTimeEmployee extends Employee{// this class made inheritance from class employee
     private int workedHours;
   final  private   int constant=100;
    public PartTimeEmployee ()//default constructor
    {
        
    }
    public PartTimeEmployee (int no,String n,String ad,String bd,int wh)//constructor with values
    {
        super(no,n,ad,bd);//we call constructor in class Employee
       workedHours=wh; 
    }
    // I made setter and getter for attributes
     public void setworkedHours(int w)
    {
        workedHours=w;
    }
       public int getworkedHours()
    {
       return workedHours;
    }
    public long  CalcPay( )
    {
        return ( constant*workedHours);
    }

    @Override
    public void report()//made override from super class : Employee for this method
    {
        System.out.println("\nPart time employee : ");
        super.report();//call attribute in super class
        System.out.println(" , worked hours in month : "+workedHours+" , pay : "+CalcPay());//add worked hours and pay to report
    }
}
