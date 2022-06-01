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
public class Section {
     private int SecIdentifier;
    private String SecName;
    private Employee Admin; // I made object of Employee and cause class Employee is abstract I made complement of object in constructor with kind of employee

  private int i=0;// I made it to know state of employee if he is rmoved or terminated his service or is in good state
   
  public Section()//default constructor
    {
        
    }

  
  // I made three kind of constructor with values cause there are three kind of employees 
        public Section(int si,String sn,int no,String n,String ad,String bd,long sa,int nof)//constructor for FullTimeEmployee 
    {
        SecIdentifier=si;
        SecName=sn;
       Admin=new FullTimeEmployee(no,n,ad,bd,sa,nof);//we call constructor in class FullTimeEmployee
    }
        public Section(int si,String sn,int no,String n,String ad,long sa,int nof,String bd)//constructor for LongServingEmployee
    {
        SecIdentifier=si;
        SecName=sn;
       Admin=new LongServingEmployee(no,n,ad,bd,sa,nof);//we call constructor in class LongServingEmployee
    }
        public Section(int si,String sn,int no,String n,String ad,String bd,int wh)//constructor for PartTimeEmployee
    {
        SecIdentifier=si;
        SecName=sn;
       Admin=new PartTimeEmployee(no,n,ad,bd,wh);//we call constructor in class PartTimeEmployee
    }
        // I made setter and getter for attributes
      public void setSecIdentifier(int s)
    {
        SecIdentifier=s;
    }
       public int getSecIdentifier()
    {
        return SecIdentifier;
    }
        public void setsecname(String sn)
    {
       SecName=sn;
    }
         public String getsecname()
    {
       return SecName;
}
         public int get_id_of_section_admin()
         {
             return Admin.getNum();
         }


         public void changeproperitiesofAdmin()//attribute call it when Idelete employee  
         {
             Admin.setNum(0);
             Admin.setName("there is not any name ");
             Admin.setAdress("there is not any Adress");
             Admin.setBirthDate("0/0/0");
         }
         public int getstateofAdmin()// I made it to know state of employee if he is rmoved or terminated his service or is in good state 
         {
             return i;
         }
         public void changetodeleteadmin()
         {
             i=1;
         }
         public void changetoterminitedadmin()
         {
             i=2;
         }
         public void addLeaveToAdmin(int l)//I made this attribute to add leave for adminstrator
         {
             Admin.addleave(l);
         }
         public int getleaveOfAdimn()//I made this attribute to know leave of adminstrator
         {
            return Admin.calcLeave();
         }
   public void report()
   {
       System.out.print("Section identifier : "+SecIdentifier+" , section name : "+SecName+"\nDetails of adminstrator of section : ");
     if(i==0)//if adminstrator in good state
       Admin.report();
     else if(i==1)//if adminstrator is deleted
     {
         System.out.print("\nYou deleted this admin, "+"Serial number  : "+Admin.getNum()+"  , Name : "+Admin.getName()+" , Adress : "+Admin.getAdress()+" , Birth date : "+Admin.getBirthDate());

     }
     else//if adminstratoris terminated his service
     {
         System.out.print("\nAdmin with serial number : "+Admin.getNum()+" is terminated his service");
     }
               
   }
}
