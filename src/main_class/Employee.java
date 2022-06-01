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
public  abstract class  Employee {//i made class abstract cause we do not need to make object from it
protected int Num;
    protected String Name;
    protected String Adress;
    protected String BirthDate;
    protected int leave=0;
    

   // I add attributes for super class employee 

    public Employee() //default constructor
    {
        
    }
    public Employee(int no,String n,String ad,String bd ) //constructor with values
    {
        Num=no;
        Name=n;
        Adress=ad;
        BirthDate=bd;
    }
    
    /*
    I made setter and getter for all attributes
    */
    public void setNum(int no)
    {
        Num=no;
    }
    
    public int getNum()
    {
        return Num;
    }
    public void setName(String n)
    {
        Name=n;
    }
    public String getName()
    {
        return Name;
    }
    public void setAdress(String adress)
    {
        this.Adress=adress;
    }
    public String getAdress()
    {
        return Adress;
    }
     public void setBirthDate(String bd)
    {
        BirthDate=bd;
    }
    public String getBirthDate()
    {
        return BirthDate;
    }
    public int calcLeave()//I made this attribute to make override from it in other classes
    {
        return 0;
    } 
    public void addleave(int l)//I made this attribute to add leave for employees in other classes
    {
        leave+=l;
    }
    public void report()//I made this attribute to make override from it in other classes and sometimes to use it
    {
        System.out.print("Serial number  : "+Num+"  , Name : "+Name+" , Adress : "+Adress+" , Birth date : "+BirthDate);
    }
}
