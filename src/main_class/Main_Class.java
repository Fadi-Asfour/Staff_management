/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main_class;


import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Main_Class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        System.out.println("\nWelcome to my program");//header massege
       
        int n=0,j,jj=0,tt=0,k,sjj=0,kk=0;//variables
        Employee [] e = new Employee[10000]; //array of employee
        Section []s=new Section[10000];//array of section
        int []ter=new int[10000];//array of termineted employees
        int []noe=new int [10000];//array of ID of section
        int []numoe=new int[1000];//array of number of  employees in section
        int nn=0;
        int ex=0;
        int cn=0;
        while(true){//used this loop that if user enter wrong answer ,the loop will redo and else loop will end
        System.out.println("\nEnter : "+"\n1 to add employee "+"\n2 to remove employee" +"\n3 to terminate an employee's service"+"\n4 to add leave for employee"+ "\n5 to print detials for all employees"+ "\n6 to print leave of an employee" +"\n7 to print details of employees in section" +"\n8 to print all section and print all employees in them"+"\n9 to exit");
      char x=scan.next().charAt(0);
        switch(x)//I used loop and switch because we should do more than one process
        {
            case '1':
                    {
                        int seci=0;//variable for section identifier
                    
                        if(n==0){
                System.out.println("\nYou should enter section of employee cause every employee should belong to section");
            System.out.println("\nEnter section identifier" );
            seci=scan.nextInt();

System.out.println("Enter section name" );
            String secn=scan.next();
            
            System.out.println("\nYou should enter kind of adminstrator for section \nEnter : (1 for full time employee ,2 for long serving employee ,3 for part time employee)");
           
           int test=0;
           while(test==0){//used this loop that if user enter wrong answer ,the loop will redo and else loop will end
               char f=scan.next().charAt(0);
           switch (f) //I make 3 state for 3 kinds of adminstrator 
                   {
               case '1':
               {
                   
               
            System.out.println("Enter serial number of section's adminstrator" );
            
            int snosa=-1986437210;//I gave it primary value cause program made error if we do not do that
            int zz=0,hh=0,ll=0;
                    while(zz==0){//loops for searching if i used it before for employee or admin
            snosa=scan.nextInt();
            

             
             


            for(k=0;k<n;k++)//searching in array of employee if found here
            {
                if(e[k].getNum()==snosa)
                {
                  System.out.println("This serial number you entered before so you should enter other serial number\nEnter serial number of section's adminstrator\n");
 
  ll=1;
  break;
                }
            }
            if(ll==1)//if i used it before it do not coplete loop and redo it 
                {
                    ll=0;
                    continue;
                }
            for(k=0;k<n;k++)//searching in array of section if found in ID of admin
            {
              if(s[k].get_id_of_section_admin()==snosa)
                {
                  System.out.println("This serial number you entered before so you should enter other serial number\nEnter serial number of section's adminstrator\n");
 
  hh=1;
  break;
                }  
            }
            if(hh==0&&ll==0)//if he do not found it completly end loop
            {
               //it is  break from loop
                zz=1;
            }
            else{    //else he redo loop again
                hh=0;
                ll=0;
                
            }
                 
        }
             System.out.println("Enter name of section's adminstrator" );
             String nosa=scan.next();
             System.out.println("Enter adress of section's adminstrator");
            String adosa=scan.next();
            System.out.println("Enter birth date of section's adminstrator");
            String bdosa=scan.next();
            System.out.println("Enter salary of section's adminstrator");
            long sl=scan.nextLong();
            System.out.println("Enter number of working years of section's adminstrator");
            int nowy=scan.nextInt();
            s[n]=new Section(seci,secn,snosa,nosa,adosa,bdosa,sl,nowy);// call constructor in class Section and store this parameters in it 
            test=1;//this variable will break from loop 
            break;//end of case
}
               case '2'://this case is like case 1 but it diference by kind of employee cause for 
               {
                   System.out.println("Enter serial number of section's adminstrator" );
            
            int snosa=-1986437210;//I gave it primary value cause program made error if we do not do that
            int zz=0,hh=0,ll=0;
                    while(zz==0){
            snosa=scan.nextInt();
            

             
             
            for(k=0;k<n;k++)
            {
                if(e[k].getNum()==snosa)
                {
                  System.out.println("This serial number you entered before so you should enter other serial number\nEnter serial number of section's adminstrator\n");

  ll=1;
  break;
                }
            }
            if(ll==1)
                {
                    ll=0;
                    continue;
                }
             for(k=0;k<n;k++)
            {
              if(s[k].get_id_of_section_admin()==snosa)
                {
                  System.out.println("This serial number you entered before so you should enter other serial number\nEnter serial number of section's adminstrator\n");

  hh=1;
  break;
                }  
            }
            if(hh==0&&ll==0)
            {
              
                zz=1;
            }
            else{
                hh=0;
                ll=0;
                
            }
                 
        }
             System.out.println("Enter name of section's adminstrator" );
             String nosa=scan.next();
             System.out.println("Enter adress of section's adminstrator");
            String adosa=scan.next();
            System.out.println("Enter birth date of section's adminstrator");
            String bdosa=scan.next();
            System.out.println("Enter salary of section's adminstrator");
            long sl=scan.nextLong();
            System.out.println("Enter number of working years of section's adminstrator");
            int nowy=scan.nextInt();
             s[n]=new Section(seci,secn,snosa,nosa,adosa,sl,nowy,bdosa);// call constructor in class Section and store this parameter in it 
           test=1;
             break;
               }
               case '3'://this case is like case 1 and case 2 but it diference by kind of employee cause for PartTimeEmployee
               {
                   System.out.println("Enter serial number of section's adminstrator" );
            
            int snosa=-1986437210;
            int zz=0,hh=0,ll=0;
                    while(zz==0){
            snosa=scan.nextInt();
           

            
            
            for(k=0;k<n;k++)
            {
                if(e[k].getNum()==snosa)
                {
                  System.out.println("This serial number you entered before so you should enter other serial number\nEnter serial number of section's adminstrator\n");

  ll=1;
  break;
                }
            }
            if(ll==1)
                {
                    ll=0;
                    continue;
                }
             for(k=0;k<n;k++)
            {
              if(s[k].get_id_of_section_admin()==snosa)
                {
                  System.out.println("This serial number you entered before so you should enter other serial number\nEnter serial number of section's adminstrator\n");

  hh=1;
  break;
                }  
            }
            if(hh==0&&ll==0)
            {
               // it is like break from loop
                zz=1;
            }
            else{
                hh=0;
                ll=0;
                
            }
                 
        }
             System.out.println("Enter name of section's adminstrator" );
             String nosa=scan.next();
             System.out.println("Enter adress of section's adminstrator");
            String adosa=scan.next();
            System.out.println("Enter birth date of section's adminstrator");
            String bdosa=scan.next();
                       System.out.println("Enter number of worked hours of section's adminstrator");
            int nowh=scan.nextInt();
             s[n]=new Section(seci,secn,snosa,nosa,adosa,bdosa,nowh);// call constructor in class Section and store this parameter in it 
            test=1;
             break;
               }
               default:
               {
                 System.out.println("Invalid input \nTry again"); //else program print this massege if user enter wrong and redo loop
                 break;
               }
           }
           }
           
            }
            else// when we add employee in second we can put them in new section or insection we entered it before  
            {
              System.out.println("Enter 1 if you want to add new section  \nEnter 2 if you want to use section you entered it before  ");
              int ssec=scan.nextInt();
              if(ssec==1)//to add new section 
              {
                 // it is same as what we do before for adding new section
       
            System.out.println("Enter section identifier" );
            seci=scan.nextInt();

System.out.println("Enter section name" );
            String secn=scan.next();
            
            System.out.println("\nYou should enter kind of adminstrator for section \nEnter : (1 for full time employee ,2 for long serving employee ,3 for part time employee)");
          
           int test=0;
           while(test==0){
                char f=scan.next().charAt(0);
           switch (f)
                   {
               case '1':
               {
                   
               
            System.out.println("Enter serial number of section's adminstrator" );
            
            int snosa=-1986437210;
            int zz=0,hh=0,ll=0;
                    while(zz==0){
            snosa=scan.nextInt();
           

            
            
            for(k=0;k<n;k++)
            {
                if(e[k].getNum()==snosa)
                {
                  System.out.println("This serial number you entered before so you should enter other serial number\nEnter serial number of section's adminstrator\n");

  ll=1;
  break;
                }
            }
            if(ll==1)
                {
                    ll=0;
                    continue;
                }
             for(k=0;k<n;k++)
            {
              if(s[k].get_id_of_section_admin()==snosa)
                {
                  System.out.println("This serial number you entered before so you should enter other serial number\nEnter serial number of section's adminstrator\n");

  hh=1;
  break;
                }  
            }
            if(hh==0&&ll==0)
            {
               // is like break from loop
                zz=1;
            }
            else{
                hh=0;
                ll=0;
                
            }
                 
        }
             System.out.println("Enter name of section's adminstrator" );
             String nosa=scan.next();
             System.out.println("Enter adress of section's adminstrator");
            String adosa=scan.next();
            System.out.println("Enter birth date of section's adminstrator");
            String bdosa=scan.next();
            System.out.println("Enter salary of section's adminstrator");
            long sl=scan.nextLong();
            System.out.println("Enter number of working years of section's adminstrator");
            int nowy=scan.nextInt();
             s[n]=new Section(seci,secn,snosa,nosa,adosa,bdosa,sl,nowy);//make object by calling constructor in class Section and store this parameter in it 
         test=1;
             break;    
}
               case '2':
               {
                   System.out.println("Enter serial number of section's adminstrator" );
            
            int snosa=-1986437210;//I gave it primary value cause program made error if we do not do that
            int zz=0,hh=0,ll=0;
                    while(zz==0){
            snosa=scan.nextInt();
             
            

            
            for(k=0;k<n;k++)
            {
                if(e[k].getNum()==snosa)
                {
                  System.out.println("This serial number you entered before so you should enter other serial number\nEnter serial number of section's adminstrator\n");

  ll=1;
  break;
                }
            }
            if(ll==1)
                {
                    ll=0;
                    continue;
                }
             for(k=0;k<n;k++)
            {
              if(s[k].get_id_of_section_admin()==snosa)
                {
                  System.out.println("This serial number you entered before so you should enter other serial number\nEnter serial number of section's adminstrator\n");

  hh=1;
  break;
                }  
            }
            if(hh==0&&ll==0)
            {
               // it like break
                zz=1;
            }
            else{
                hh=0;
                ll=0;
                
            }
                 
        }
             System.out.println("Enter name of section's adminstrator" );
             String nosa=scan.next();
             System.out.println("Enter adress of section's adminstrator");
            String adosa=scan.next();
            System.out.println("Enter birth date of section's adminstrator");
            String bdosa=scan.next();
            System.out.println("Enter salary of section's adminstrator");
            long sl=scan.nextLong();
            System.out.println("Enter number of working years of section's adminstrator");
            int nowy=scan.nextInt();
             s[n]=new Section(seci,secn,snosa,nosa,adosa,sl,nowy,bdosa);// call constructor in class Section and store this parameter in it 
            test=1;
             break;
               }
               case '3':
               {
                   System.out.println("Enter serial number of section's adminstrator" );
            
            int snosa=-1986437210;//primary value
            int zz=0,hh=0,ll=0;
                    while(zz==0){
            snosa=scan.nextInt();
            

            
            
            for(k=0;k<n;k++)
            {
                if(e[k].getNum()==snosa)
                {
                  System.out.println("This serial number you entered before so you should enter other serial number\nEnter serial number of section's adminstrator\n");

  ll=1;
  break;
                }
            }
            if(ll==1)
                {
                    ll=0;
                    continue;
                }
             for(k=0;k<n;k++)
            {
              if(s[k].get_id_of_section_admin()==snosa)
                {
                  System.out.println("This serial number you entered before so you should enter other serial number\nEnter serial number of section's adminstrator\n");
 
  hh=1;
  break;
                }  
            }
            if(hh==0&&ll==0)
            {
               // It is like break
                zz=1;
            }
            else{
                hh=0;
                ll=0;
                
            }
                 
        }
             System.out.println("Enter name of section's adminstrator" );
             String nosa=scan.next();
             System.out.println("Enter adress of section's adminstrator");
            String adosa=scan.next();
            System.out.println("Enter birth date of section's adminstrator");
            String bdosa=scan.next();
                       System.out.println("Enter number of worked hours of section's adminstrator");
            int nowh=scan.nextInt();
             s[n]=new Section(seci,secn,snosa,nosa,adosa,bdosa,nowh);// call constructor in class Section and store this parameter in it 
             test=1;
             break;
               }
                default:
               {
                 System.out.println("Invalid input \nTry again"); 
                 break;
               }
           }   
           }
              }
              else //And if you press 2 just enter ID of section
              {
                 System.out.println("Just enter section identifier you entered it before");
                  seci=scan.nextInt();
                
                 for(k=0;k<n;k++)
                 {
                     if(s[k].getSecIdentifier()==seci)
                     {
                         s[n]=s[k];
                     }
                 }
              }
            }
                        
                        //Now you can add employee after belong employee to section
                    
 System.out.println("Enter : (1 to add full time employee ,2 to add long serving employee ,3 to add part time employee)");
int rr=0;
 while (rr==0)
{
    char o=scan.next().charAt(0);//parameter to store kind of employee

    switch(o){//I used switch because there are many choice of employee
        
        //this case like cases in the first that we used it to add section and information about admin
        case '1':
        {
            /*
            every time : program print massege to add ID of employee and store in parameter and if it find stored before print massege to enter ID
            */
          

            
            System.out.println("Enter serial number of full time employee" );
            int no=-9653820;//I gave it primary value cause program made error if we do not do that
           int zz=0,hh=0,ll=0;
            while(zz==0){//used this loop that if user enter wrong answer the loop will redo and else loop will end
            no=scan.nextInt();
            for(k=0;k<n;k++)
            {
                if(e[k].getNum()==no)//searching in array of employee if found here print massege 
                {
                    System.out.println("This serial number you entered before so you should enter other serial number\nEnter serial number of full time employee\n");
                  
                    ll=1;
                    break;
                }
               
            }
             if(ll==1)
                {
                    ll=0;
                    continue;
                }
                 for(k=0;k<n+1;k++)
            {
              if(s[k].get_id_of_section_admin()==no)//searching in array of section that if admin has this ID  print massege
                {
                  System.out.println("This serial number you entered before so you should enter other serial number\nEnter serial number of full time employee\n");

  hh=1;
  break;
                }
              
            }
                
                 if(hh==0&&ll==0)
            {
               
                zz=1;// is like break for loop
            }
            else{
                hh=0;
                ll=0;
                
            }
            
            
            }
            //variable to store information about employee
            System.out.println("Enter name of full time employee");
            String na=scan.next();
            System.out.println("Enter adress of full time employee");
            String ad=scan.next();
            System.out.println("Enter birth date of full time employee");
            String bd=scan.next();
            System.out.println("Enter salary of full time employee");
            long sl=scan.nextLong();
            System.out.println("Enter number of working years of full time employee");
            int nowy=scan.nextInt();
             e[n]=new FullTimeEmployee(no,na,ad,bd,sl,nowy);// make object by calling constructor in class FullTimeEmployee and store this parameter in it
             
             //I make loop for saving this employee in same section that belong to them and increasing number of employee in this section 
                         for(j=0;j<nn;j++)
            {
                if(noe[j]==seci)//If we found this section before then increase number of employee in it
                {
                   break;
               }
            }
            if(j==nn)//and if we arrived to end and do not found this ID of section 
            {
                noe[nn]=seci; // add this section to end of array of section's ID
                numoe[nn]++;//increase number of employee in array of employee's ID
                nn++;
            }
            else
            {
             numoe[j]++;   //increase number of employee in array of number of employee in section 
            }
            
        
            
            n++;//icrease number of employees
            rr=1;//this variable will break from loop 
            break;//end of case

        }
                case '2'://same as case 1 but it difference that is for LongServingEmployee
        {
            
          
            
            
            System.out.println("Enter serial number of long serving employee" );
 int no=-9653820;
           int zz=0,hh=0,ll=0;
            while(zz==0){
            no=scan.nextInt();
            for(k=0;k<n;k++)
            {
                if(e[k].getNum()==no)
                {
                    System.out.println("This serial number you entered before so you should enter other serial number\nEnter serial number of long serving employee\n");
                  
                    ll=1;
                    break;
                }
            }
            if(ll==1)
                {
                    ll=0;
                    continue;
                }
                 for(k=0;k<n+1;k++)
            {
              if(s[k].get_id_of_section_admin()==no)
                {
                  System.out.println("This serial number you entered before so you should enter other serial number\nEnter serial number of long serving employee\n");

  hh=1;
  break;
                }  
            }
                 if(hh==0&&ll==0)
            {
               
                zz=1;//it is like break for loop
            }
            else{
                hh=0;
                ll=0;
                
            }
            
            
            }
            System.out.println("Enter name of long serving employee");
            String na=scan.next();
            System.out.println("Enter adress of long serving employee");
            String ad=scan.next();
            System.out.println("Enter birth date of long serving employee");
            String bd=scan.next();
            System.out.println("Enter salary of long serving employee");
            long sl=scan.nextLong();
            System.out.println("Enter number of working years of long serving employee");
            int nowy=scan.nextInt();
           
            e[n]=new LongServingEmployee(no,na,ad,bd,sl,nowy);
            
        
            
            for(j=0;j<nn;j++)
            {
                if(noe[j]==seci)
                {
                   break;
               }
            }
            if(j==nn)
            {
                noe[nn]=seci;
                numoe[nn]++;
                nn++;
            }
            else
            {
             numoe[j]++;   
            }
     

 

rr=1;
            n++;
            break;
        }
                case '3'://same as case 1 but it difference that is for LongServingEmployee
                {
                   
          
            
            System.out.println("Enter serial number of part time employee" ); 
             int no=-9653820;
           int zz=0,hh=0,ll=0;
            while(zz==0){
            no=scan.nextInt();
            for(k=0;k<n;k++)
            {
                if(e[k].getNum()==no)
                {
                    System.out.println("This serial number you entered before so you should enter other serial number\nEnter serial number of part time employee\n");

                    ll=1;
                    break;
                }
            }
            if(ll==1)
                {
                    ll=0;
                    continue;
                }
                 for(k=0;k<n+1;k++)
            {
              if(s[k].get_id_of_section_admin()==no)
                {
                  System.out.println("This serial number you entered before so you should enter other serial number\nEnter serial number of part time employee\n");

  hh=1;
  break;
                }  
            }
                 if(hh==0&&ll==0)
            {
              
                zz=1;
            }
            else{
                hh=0;
                ll=0;
                
            }
            
            
            }
            System.out.println("Enter name of part time employee");
            String na=scan.next();
            System.out.println("Enter adress of part time employee");
            String ad=scan.next();
            System.out.println("Enter birth date of part time employee");
            String bd=scan.next();
            System.out.println("Enter number of worked hours of part time employee");
            int nowh=scan.nextInt();
            
            e[n]=new PartTimeEmployee(no,na,ad,bd,nowh);
         
                 
             for(j=0;j<nn;j++)
            {
                if(noe[j]==seci)
                {
                   break;
               }
            }
            if(j==nn)
            {
                noe[nn]=seci;
                numoe[nn]++;
                nn++;
            }
            else
            {
             numoe[j]++;   
            }


            n++;
            rr=1;
            break; 
                }
                default:{
                    System.out.println("Invalid input\nTry again");//else program print this massege if user enter wrong and redo loop
                    break;
                }
        
    }
}
            }
                    
     break;
                    
                    
            case '2':
            {
                if(n==0)//if number of employee equal 0 we can not do this case and program print message explain that
                {
                    System.out.println("You should add employee but not remove employee because there is not any employee");
                    break;
                }
                System.out.println("Enter serial number of employee to delete " );//else if nuber of employee>0 program do this case
                int sn=scan.nextInt();//variable store serial number of employee
                
                for( k=0;k<tt;k++)//searching in array of terminated employees
                    {
                        if(ter[k]==sn){
                             kk=k;
                          
                            cn=1;
                         break;    
                        }
                    }
                if(k!=tt)//if  find in array of terminated employees ,just delete it
                {
                   for(k=kk;k<tt;k++)
                   {
                       if(k==tt-1)
                       {
                           ter[k]=0;
                       }
                       else
                       {
                           ter[k]=ter[k+1];
                       }
                   }
                   if(cn==1)
                   {
                       cn=0;
                       tt--;//decrease size of array of terminated employees
                   }
                }
                for(j=0;j<n;j++)
                {                         //and else we search in array of employees
                   if(e[j].getNum()==sn)//if found in it
                   {
                       jj=j;
                   cn=5;//variable to know if we found employee to delete
                     break;
                   }
                }
                if(cn==5){
                for(k=0;k<nn;k++)
                {
                    if(s[jj].getSecIdentifier()==noe[k])// array of section has same index so  if  find Id of section in array of ID of section 
                    {
                       numoe[k]--;//decrease number of employees in this section
                      
                        break;
                    }
                }
                }
                 if(cn==5){
                for(j=jj;j<n;j++)//remove employee from array of employee
                {
                    

                    if(j!=n-1)
                    {
                        e[j]=e[j+1];
                    }
                }
                 }int know=0;
               if(cn==5){
                   n--;//decrease size of array of employees
               cn=0;
               }
               
               else//and if do not find serial number of employee in array of employees
                   //searching in array of section if this employee is admin and delete him
               {
                   for(k=0;k<n;k++)
                   {
                       if(s[k].get_id_of_section_admin()==sn)//if any admin has this serial number
                       {
                           
                               s[k].changeproperitiesofAdmin();//change information of this employee to empty information cause we can not delete admin cause every section should have admin and can not delete section cause every employee belong to section 
                               s[k].changetodeleteadmin();//change state of employee to deleted employee
                       know=5;//variable to know if we found employee to delete
                           
                       }
                   }
                
               }
               if(know==0&&cn!=5)//if variable stayed at same values that points : There is not any employee with serial number
               {
                System.out.println("There is not any employee with serial number : "+sn);    
               }
                
                
                break;
            }
            case '3':
            {
                if(n==0)//if number of employee equal 0 we can not do this case and program print message explain that
                {
                    System.out.println("You should add employee but not terminate employee's service because there is not any employee");
                    break;
                }
                System.out.println("Enter serial number of employee to terminate it service " );
                int sn=scan.nextInt();
                int found=0;//variable to know if we found employee
                
                for(k=0;k<tt;k++)//searching in array of terminated employees
                {
                    if(ter[k]==sn)
                    {
                       found=1;//points that we found employee 
                       break;
                    }
                }
                for(j=0;j<n;j++)
                {
                   if(e[j].getNum()==sn)//searching in array of  employees
                   {
                       jj=j;
                   
                     break;
                   }
                }
                if(j==n){//if  do not find in array of  employees
                    for(k=0;k<n;k++)//searching in array of sections 
                    {
                        if(s[k].get_id_of_section_admin()==sn)//if found it
                        {
                            s[k].changetoterminitedadmin();//change state of employee to terminated employee
                            found =3;
                        }
                    }
                    if(found==0)//if did not find in all arrays print message
                    System.out.println("There is not any employee with this serial number");
                
                }
                else
                {
                    if(found==0)//if did not find in array of  employees but found in array of sections 
                    ter[tt]=sn;//add this serial number of employee to array of terminated employees
                tt++;
                }
                for(j=0;j<n;j++)
                {
                   if(e[j].getNum()==sn)
                   {
                       jj=j;
                   
                     break;
                   }
                }
                if(j!=n&&found==0){
                for(k=0;k<nn;k++)
                {
                    if(s[jj].getSecIdentifier()==noe[k])//searching of this employee in array of section ID and when found
                    {
                       numoe[k]--;//decrease number of employees in this section cause array of section ID and array of nuber
                      
                        break;
                    }
                }
                }
                 break;//end of case
            }
            case '4':
            {
                if(n==0)//if number of employee equal 0 we can not do this case and program print message explain that
                {
                    System.out.println("You should add employee but not add leave for employee because there is not any employee");
                    break;
                }
                System.out.println("Enter serial number of employee");
                 int sn=scan.nextInt();
                  int i;
                for(j=0;j<n;j++)
                {
                    for( k=0;k<tt;k++)
                    {
                        if(ter[k]==sn){//searching in array of terminated employees
                             System.out.println("This employee is terminated it service " );
                             cn=1;
                         break;    
                        }
                    }
                    for(i=0;i<n;i++)//searching in array of  section if admin has that serial number
                    {
                        if(s[i].get_id_of_section_admin()==sn)//if admin has that serial number
                        {
                            if(s[i].getstateofAdmin()==2)//and state of admin is terminated 
                            {
                                cn=2;
                                 System.out.println("This employee is terminated it service " );//print message
                                 break;
                            }
                            else if(s[i].getstateofAdmin()==1)//else if state of admin is deleted
                            {
                                cn=2;
                                 System.out.println("There is not any employee with this serial number" );//print message
                                 break;
                            }
                            else
                            {
                              cn=2; 
                              if(s[i].getleaveOfAdimn()==0)
                              {
                                  System.out.println("This employee can not add leave for him");
                              }
                              else{
                              System.out.println("Enter leave ");//else state of admin is good
                            int lv=scan.nextInt();
                            s[i].addLeaveToAdmin(lv);
                           if(s[i].getleaveOfAdimn()<0)
                           {
                            System.out.println("This employee can not add this leave for him");  
                            s[i].addLeaveToAdmin(-1*lv);
                           }
                              }
                               break;
                            }
                        }
                    }
                    if(cn==2)//the value of variable points that we found serial number and do not need to redo loop
                    {
                        break;
                    }
                    if(i==n&&k==tt&&sn==e[j].getNum())//if did not find in serial numbers of admin and employee has this serial number
                    {
                        if(e[j].calcLeave()==0)//if leave  equal zero print message
                        {
                            System.out.println("This employee can not add leave for him");
                        }
                        else{
                            System.out.println("Enter leave ");
                            int lv=scan.nextInt();
                       e[j].addleave(lv);
                       if(e[j].calcLeave()<0)//if leave after adding will minus print message and do not do this process
                       {
                        System.out.println("This employee can not add this leave for him");  
                        e[j].addleave(-1*lv);
                       }
                       
                        }
                       break;
                    }
                        }
                if(j==n&&cn==0)// if we reach end an did not find this serial number print message
                {
                  System.out.println("There is not any employee with this serial number");  
                }
                else
                    cn=0;//to rehave variable his primary value
               
               
               break;  
            }
            case '5':
            {
                if(n==0)//if number of employee equal 0 we can not do this case and program print message explain that
                {
                    System.out.println("You should add employee but not print detials for employees because there is not any employee");
                    break;
                }
                for(j=0;j<n;j++)
                {
                    for( k=0;k<tt;k++)//searching in array of terminated employees
                    {
                        if(ter[k]==e[j].getNum()){
                             System.out.println("\nEmployee with serial number : "+e[j].getNum()+ " is terminated it service " );
                         break;    
                        }
                    }
                    if(k==tt)//if we did not in array of terminated employees
                    { 
                        System.out.println();
                        e[j].report();
                        s[j].report();
                    System.out.println();
                }
                
            }
                 break;//end of case
            }
            case '6':
            {
            
                if(n==0)//if number of employee equal 0 we can not do this case and program print message explain that
                {
                    System.out.println("You should add employee but not print leave of an employee because there is not any employee");
                    break;
                }
                System.out.println("Enter serial number of employee to print leave of an employee " );
                int sn=scan.nextInt();
                int i;
                for(j=0;j<n;j++)
                {
                    for( k=0;k<tt;k++)//searching in array of terminated employees
                    {
                        if(ter[k]==sn){
                             System.out.println("This employee is terminated it service " );
                             cn=1;
                         break;    
                        }
                        
                    }
                    if(cn==1)// value of variable points that we found serial number and do not need to redo loop
                            break;
                    if(k==tt)//if  do not find in array of  terminated employees
                    {
                        for(i=0;i<n;i++)
                        {
                            if(s[i].get_id_of_section_admin()==sn){//if find that admin has this serial number
                            if(s[i].getstateofAdmin()==2)//if state of admin is terminated his service print message
                            {
                                 cn=2;
                                 System.out.println("This employee is terminated it service " );
                                 break;
                            }
                            else if(s[i].getstateofAdmin()==1)//if state of admin is deleted print message
                            {
                                cn=2;
                                 System.out.println("There is not any employee with this serial number" );
                                 break;
                            }
                            else
                            {
                                cn=2;
                                System.out.println("Leave of employee is : "+s[i].getleaveOfAdimn());//else print leave
                           break;
                            }
                            }
                            if(cn==2)// value of variable points that we found serial number and do not need to redo loop
                            {
                                break;
                            }
                        }
                    }
                    if(k==tt&&sn==e[j].getNum())//if  did not find in array of  terminated employees and found in array of employees print leave
                    {
                       System.out.println("Leave of employee "+e[j].getName()+" is : "+e[j].calcLeave());
                       break;
                    }
                        }
                if(j==n&&cn==0)//if did not find absolutly  print message
                {
                  System.out.println("There is not any employee with this serial number");  
                }
                else
                    cn=0;//to rehave variable his primary value
                 break;//end of case
                
            }
            case '7':
            {
               if(n==0)//if number of employee equal 0 we can not do this case and program print message explain that
                {
                    System.out.println("You should add employee but not print detials  of all emloyees in section because there is not any employee");
                    break;
                } 
               System.out.println("Enter section identifier  to print detials  of all employees in this section");
               int scid=scan.nextInt();
               for(j=0;j<n;j++)
                {
                    int kn=0;
                    
                    if(s[j].getSecIdentifier()==scid)
                    {
                        for( k=0;k<tt;k++)//searching in array of terminated employees if any employee who terminated his service
                    {
                        if(ter[k]==e[j].getNum()){
                             System.out.println("\nEmployee with serial number : "+e[j].getNum()+ " is terminated it service " );
                          kn=1;
                        }
                    }
                        if(kn==0){// value of variable points that we not found any employee who terminated his service 
                        System.out.println();
                        e[j].report();//print details of employee
                        }
                        else
                        {
                            kn=0;
                        }
                        System.out.println("Information about section : ");
                        s[j].report();//print details of section
                        
                        System.out.println();
                    }
                }
                break;//end of case
            }
        
        case '8':
        {
           if(n==0)//if number of employee equal 0 we can not do this case and program print message explain that
                {
                    System.out.println("You should add employee but not print all section and print all employees in them because there is not any employee");
                    break;
                }
           for(k=0;k<nn;k++)
           {
               for(j=0;j<n;j++)
               {
                   if(s[j].getSecIdentifier()==noe[k])//if ID in array of section same as ID in array of section's ID
                   {  
                       System.out.println();
                       s[j].report();
                   System.out.println("\nnumber of employees in "+s[j].getsecname()+" : "+numoe[k]);//print number of employee that found in array of number of employees in every section
                   break;
                   }
                   }
               }
           
         break;//end of case
        }
        case '9'://to exit program
        {
            ex=1;
            break;//end of case
        }
        default://when user enter wrong press
        {
            System.out.println("You entered wrong\nTry again");
            
         
            break;
        }
                      
        }    
            
        if(ex==1)
        {
           System.out.println("\nThank you for your using \nI hope you like my program");//message shows when end program
           break;//for finish loop
        }
 
        }
    }
}
