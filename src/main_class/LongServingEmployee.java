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
public class LongServingEmployee extends Employee {// this class made inheritance from class employee
     private long Salary;
 private int NumbOfYears=15;
    public LongServingEmployee()//default constructor
    {
        
    }
    public LongServingEmployee(int no,String n,String ad,String bd,long sa,int nof)//constructor with values
    {
        super(no,n,ad,bd);//we call constructor in class Employee
        Salary=sa;
        NumbOfYears=nof;
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
       NumbOfYears =n;
    }
     @Override
    public int calcLeave()//made override from super class : Employee for this method
    {
        if(NumbOfYears>15)
            return (NumbOfYears+((NumbOfYears-15)/2)-leave);
        else
            return NumbOfYears-leave;
    }
    

    
    @Override 
        public void report()//made override from super class : Employee for this method
    {
        System.out.println("\nLong serving employee : ");
        super.report();//call attribute in super class
        System.out.println(" , leave : "+calcLeave());//add leave to report
    }
   
}
