
/**
 * Write a description of     class Credit_Card here.
 *
 * @author (Faisal Ansari)
 * @version (a version number or a date)
 */
public class Credit_Card extends Bank_Card
{  private int CVC_NUMBER;
   private double CREDIT_LIMIT;
   private double INTEREST_RATE;
   private String EXPIRATION_DATE;
   private int GRACE_PERIOD;
   private boolean isGRANTED;
   
   
   //constructor of Credit Card class along with its parameter and data type and to call the constructor of parent class Bank_Card
  public Credit_Card(int card_id,String bank_account,double balance_amount,String issuer_bank,
                   String client_name,int cvc_number,double intrest_rate,String expiration_date)
    {
      super (card_id,bank_account,balance_amount,issuer_bank);  
      super.setCLIENT_NAME(client_name);
      this.CVC_NUMBER=cvc_number;
      this.EXPIRATION_DATE=expiration_date;
      this.INTEREST_RATE=intrest_rate;
      this.isGRANTED=false;
    }
    
    
      //accessor method of instance variableCVC NUMBER
     public int getcvc_number()
     {
       return this.CVC_NUMBER;
     }
     
       //accessor method of instance variable CREDIT_LIMIT
     public double getcredit_limit()
     {
       return this.CREDIT_LIMIT;
     }
    
     
       //accessor method of instance variable INTEREST_RATE
     public double getintrest_rate()
     {
       return this.INTEREST_RATE;
     }
     
     
       //accessor method of instance variable EXPIRATION_DATE
     public String getexpiration_date()
     {
       return this.EXPIRATION_DATE;
     }
     
     
      //accessor method of instance variable GRACE_PERIOD
     public int getgrace_period()
     {
       return this.GRACE_PERIOD;
     }
     
     
     //accessor method of instance variable IS GRANTED
      public boolean getis_granted()
     {
        return this.isGRANTED;
     }
        
     
     //mutator method along with its parameter and data type
  public void setCreditLimit(double CreditLimit, int GracePeriod) 
   {
        if (CreditLimit <= 2.5 * super.getBalance_Amount()) 
          { 
            this.CREDIT_LIMIT = CreditLimit;
            this.GRACE_PERIOD = GracePeriod;
            this.isGRANTED = true;
          } 
          else 
          {
             System.out.println("Credit cannot be issued.");
          }
    }
     
    
    //a method to set the value of instance variable CVC_NUMBER. CREDIT_LIMIT, GRACE_PERIOD to zero and isGRANTED to false when called
  public void cancelCreditCard() 
    {
        if (this.isGRANTED) 
        {
            this.CVC_NUMBER = 0;
            this.CREDIT_LIMIT = 0;
            this.GRACE_PERIOD = 0;
            this.isGRANTED = false;
        }
     }
    
    
    //display method for Credit card class and to call the display method of parent class Bank_Card
    public void display()
  {
       super.display();
        
       if (this.isGRANTED==false) 
          {
            System.out.println("CVC Number is: " + this.CVC_NUMBER);
            System.out.println("Interest Rate is: " + this.INTEREST_RATE);
            System.out.println("Expiration Date is: " + this.EXPIRATION_DATE);
            System.out.println("The status of     isGranted is: " + this.isGRANTED);
          }
          else
          {
            System.out.println("Credit Limit: " + this.CREDIT_LIMIT);
            System.out.println("Grace Period: " + this.GRACE_PERIOD);
          }
  }  
}
 

  

  




     
