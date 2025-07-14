
/**
 * Write a description of class Bank_Card here.
 *
 * @author (Faisal Ansari)
 * @version (a version number or a date)
 */
public class Bank_Card
{  
    private int CARD_ID;
    private String CLIENT_NAME;
    private String BANK_ACCOUNT;
    private double BALANCE_AMOUNT;
    private String ISSUER_BANK;
    
    
    //Constructor for Bank Card class along with its parameters and data type
   public Bank_Card(int card_id, String bank_account,double balance_amount, String issuer_bank)
   {
    this.CLIENT_NAME=" ";
    this.BALANCE_AMOUNT=balance_amount;
    this.CARD_ID=card_id; 
    this.BANK_ACCOUNT=bank_account;
    this.ISSUER_BANK=issuer_bank;
   }
   
   
    //Accessor method of instance variable CARD_ID
     public int getCard_Id()
     {
       return this.CARD_ID;
     }
   
   
    //Accessor method of instance variable CLIENT_NAME
     public String getClient_Name()
     {
       return this.CLIENT_NAME;
     }
   
   
    //Accessor method of instance variable BANK_ACCOUNT
     public String getBank_Account()
     {
       return this.BANK_ACCOUNT;
     }
   
   
    //Accessor method of instance variable BALANCE_AMOUNT
     public double getBalance_Amount()
     {
       return this.BALANCE_AMOUNT;
     }
   
   
    //Accessor method of instance variable ISSUER_BANK
     public String getIssuer_Bank()
     {
       return this.ISSUER_BANK;
     }
   
   
   
    //mutator method of instance variable CLIENT_NAME along with its parameter and data type
     public void setCLIENT_NAME(String Name)
     {
       this.CLIENT_NAME=Name;                                               
     }
   
   
    //mutator method of instance variable BALANCE_AMOUNT along with its parameter and data type
     public void setBALANCE_AMOUNT(double Balance)
     {
      this.BALANCE_AMOUNT=Balance;                                               
     }
   
   
   
   //display method for bank_card
   public void display()
   {
     System.out.println("The Card Id is "+this.CARD_ID);
     System.out.println("The Bank Account is "+this.BANK_ACCOUNT);
     System.out.println("The Balance Amount is "+this.BALANCE_AMOUNT);
     System.out.println("The Issuer Bank is "+this.ISSUER_BANK);
     
     //conditon to check whether the client name is assigned or not//
      if(this.CLIENT_NAME==" ")
      {System.out.println("The Client Name is not assigned");}
      else 
      {System.out.println("The Client Name is "+this.CLIENT_NAME);}
      
   }
}

