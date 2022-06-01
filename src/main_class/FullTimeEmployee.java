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
public class FullTimeEmployee extends Employee{// this class made inheritance from class employee
    private long Salary;
    private int NumOfYears;
    public FullTimeEmployee()//default constructor
    {
        
    }

    public FullTimeEmployee(int no,String n,String ad,String bd,long sa,int nof)//constructor with values
    {
        super(no,n,ad,bd);//we call constructor in class Employee
        Salary=sa;
        NumOfYears=nof;
    }
    // I made setter and getter for attributes
    public void SetSalary(long s)
    {
        Salary=s;
    }
    public long getSalary()
    {
        return Salary;
    }
    public void setNumberOfWorkingYears(int n)
    {
       NumOfYears =n;
    }
    public void updateyears()// to add year for worked years 
    {
        NumOfYears+=1;
    }
    @Override
    public int calcLeave()//made override from super class : Employee for this method
    {
        if(NumOfYears<10)
            return (15+NumOfYears)-leave;
        else
        {
            return (25+NumOfYears)-leave;
        }
    }

    @Override
    public void report()//made override from super class : Employee for this method
    {
        System.out.println("\nFull time employee : ");
        super.report();  //call attribute in super class
        System.out.println(" , leave : "+calcLeave());//add leave to report
    }
}
