
/**
 * Write a description of class Debit_Card here.
 *
 * @author (Faisal Ansari)
 * @version (a version number or a date)
 */
public class Debit_Card extends Bank_Card
{
    private int Pin_Number;
    private int Withdrawal_Amount;
    private String Date_of_Withdrawal;
    private boolean Has_Withdrawal; 
     
    
    //constructor for debit card class along with its parameters and data type and to call the constructor from parent class Bank_Card
    public Debit_Card(int card_id,String bank_account,double balance_amount,String issuer_bank,String client_name,
    int pin_number)
    {
     super (card_id,bank_account,balance_amount,issuer_bank);  
     super.setCLIENT_NAME(client_name);
     this.Pin_Number=pin_number;
     this.Has_Withdrawal=false;
    }
  
    
      //accessor method of instance variable PIN NUMBER
      public int getpin_number()
      {
       return this.Pin_Number;
      }
     
     
     //accessor method of instance variable WITHDRAWAL AMOUNT
      public int getwithdrawal_amount()
      {
       return this.Withdrawal_Amount;
      }
     
     
     //accessor method of instance variable DATE OF WITHDRAWAL
      public String getdateOFwithdrawal()
      {
       return this.Date_of_Withdrawal;
      }
     
     
     //accessor method of instance variable HAS WITHDRAWAL
      public boolean gethasWithdrawal()
      {
       return this.Has_Withdrawal;
      }
    
     
     
     //mutator method for instance varaibale Withdrawal_Amount along with its parameter and data type
      public void setWithdrawal_Amount(int withdrawal_amount)
      {
       this.Withdrawal_Amount=withdrawal_amount;
      }
     
     
     //mutator method for instance varaibale Date_of_Withdrawal along with its parameter and data type
      public void setDate_of_Withdrawal(String dateOfWithdrawal)
      {
       this.Date_of_Withdrawal=dateOfWithdrawal;  
      }
     
     
    //withdrwa method with parameter along data type to deduct withdrawal amoun from client account and to calculate current available balance
    public void withdraw(int WithdrawalAmount, String dateOfwithdrawal, int pinNumber)
     
     { if(this.Pin_Number!=pinNumber)
         
          {System.out.println("You have entered incorrect pin! ");}
        
      else if( WithdrawalAmount > super.getBalance_Amount())
        
          {System.out.println("You have insufficient balance");}
        
      else if(this.Pin_Number==pinNumber && WithdrawalAmount <= super.getBalance_Amount())
        {
          setWithdrawal_Amount(WithdrawalAmount);
          super.setBALANCE_AMOUNT(super.getBalance_Amount() - this.Withdrawal_Amount);
          setDate_of_Withdrawal(dateOfwithdrawal);
          this.Has_Withdrawal=true;
        }
          
      else
      
        {System.out.println("Something went wrong, Please try again!!!");} 
     }
     
     
    //display method for Debit card class and to call the display method of parent class Bank_Card
    public void display()
    { 
     super.display();

     if(this.Has_Withdrawal==false)
      
         {System.out.println("Dear customer your current balance is "  + super.getBalance_Amount());}
      
      else
      
       {
          System.out.println("Pin Number is " + this.Pin_Number);
          System.out.println("Withdrawal Amount is " + this.Withdrawal_Amount);
          System.out.println("Date of Withdrawal is " + this.Date_of_Withdrawal);
       } 
    }
}
