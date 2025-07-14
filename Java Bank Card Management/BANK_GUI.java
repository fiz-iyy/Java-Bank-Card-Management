 /**
 * BANK_GUI consist of an GUI Bank Form, having Debit Card Frame and Credit Card Frame with JText Fileds, JLabels, JButtons, JCombo Boxes and JPannels added inside JFrame 
 * for both the Debit and Credit cards respectivelly. All the JButtons also handles the exceptions and functions correctly according to thier names.
 *
 * (Faisal Ansari_N2)
 * (12 April,2023)
 */
import javax.swing.*;
import java.awt.*;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList; 

public class BANK_GUI implements ActionListener 
{
   private JFrame BFrame, CCFrame, DCFrame;  //Creating JFrame for Bank Card, Credit Card and Debit Card 
   private JPanel Bpanel, CCpanel, DCpanel; //Creating JLable for Bank Card, Credit Card and Debit Card
   private JLabel Blabel1, Blabel2, label_User; //Creating JLable Bank Card, Credit Card and Debit Card 
   private JButton CreditCard, DebitCard; //creating JButton for Credit Card and Debit Card 
   
   //creating JLabel  for all the Labels used in credit card method
   private JLabel label_CardId_c,label_BalanceAmount_c,label_BankAccount_c,label_IssuerBank_c,label_ClientName_c,
           label_CVCNumber_c,label_IntrestRate_c,label_ExpirationDate_c,label_CreditLimit_c,label_GracePeriod_c;
   
   //creating JLabel  for all the Labels used in debit card method
   private JLabel label_CardId_d,label_BalanceAmount_d,label_BankAccount_d,label_IssuerBank_d,label_ClientName_d,
           label_PinNumber_d,label_WithdrawlAmount_d,label_DateOfWithdrawl_d;
           
   //creating JTextField for all the Text Fields used in credit card method       
   private JTextField field_CardId_c,field_BalanceAmount_c,field_BankAccount_c,field_IssuerBank_c,field_ClientName_c,
           field_CVCNumber_c,field_IntrestRate_c,field_CreditLimit_c,field_GracePeriod_c;
   
   //creating JTextField for all the Text Fields used in debit card method        
   private JTextField field_CardId_d,field_BalanceAmount_d,field_BankAccount_d,field_IssuerBank_d,field_ClientName_d,
           field_PinNumber_d,field_WithdrawlAmount_d; 
            
   //creating JButton for all the buttons used in credit card method        
   private JButton AddCreditCard_c,CancelCreditCard_c,SetCreditLimit_c,GoBack_c,Display_c,Clear_c;
   
   //creating JButton for all the buttons used in debit card method
   private JButton AddDebitCard_d,GoBack_d,Withdraw_d,Display_d,Clear_d;
   
   //creating JComboBox for all combo boxes used in credit card method       
   private JComboBox box_day_c,box_month_c,box_year_c;
   
   //creating JComboBox for all combo boxes used in debit card method
   private JComboBox box_day_d,box_month_d,box_year_d;
   
   //
   ArrayList<Bank_Card> Arr_List=new ArrayList<Bank_Card>(); //The Array list for the Bank Card class type
  
    /**
    * This Method create a constructor for Bank Gui and creats its JFrame and JPannel with two JButtons Debit Card and Credit Card
    */
   public BANK_GUI()
  {
    //CODE SECTION FOR JFRAME OF BANK CARD CLASS// 
     BFrame= new JFrame(); //Creating Jframe object for Bank card  
     BFrame.setTitle("Bank Card");  //Set JFrame tittle as "Himalyan Bank Limited"
     BFrame.setBounds(400, 300, 500, 300); //Measurements of X-axis, Y-axis, Width and Height respectively of the JFrame
     BFrame.setResizable(false); //Set JFrame Resizable value to "false"
     BFrame.setLayout(null); //Set JFrame Layout value to "Null"
      
    //CODE SECTION FOR JPANNEL OF BANK CARD CLASS//
     Bpanel = new JPanel(); //Creating JPanel Object for Bank Card  
     Bpanel.setBounds(0, 0, 530, 300); //Measurements of X-axis, Y-axis, Width and Height respectively of the JPanel
     Bpanel.setBackground(Color.YELLOW); //set background Color to yellow of the panel
     Bpanel.setLayout(null); //Set JPanel Layout value to "Null" 
     
    //CODE SECTION FOR JLABEL "HIMALYAN BANK LIMITED" OF BANK CARD CLASS//
     Blabel1=new JLabel("Himalyan Bank Limited"); //Creating JLabel Object for Bank Card   
     Blabel1.setBounds(100,15,290,35); //Measurements of X-axis, Y-axis, Width and Height respectively 
     Blabel1.setFont(new Font("Arial",Font.BOLD,25)); //Change Font and Size of JLabel "CREDIT CARD"
     Bpanel.add(Blabel1); //Adding JLabel to the Panel 
    
    //CODE SECTION FOR JLABEL "CHOOSE YOUR CARD PREFERENCE" OF BANK CARD CLASS//
     Blabel2=new JLabel("please Choose you'r preferred card"); //Creating JLabel Object for Bank Card   
     Blabel2.setBounds(85,60,350,35); //Measurements of X-axis, Y-axis, Width and Height respectively 
     Blabel2.setFont(new Font("Arial",Font.TRUETYPE_FONT,20)); //Change Font and Size of JLabel "CREDIT CARD"
     Bpanel.add(Blabel2); //Adding JLabel to the Panel 
     
    //CODE SECTION FOR JBUTTON "DEBIT CARD" OF BANK CARD CLASS//
     DebitCard=new JButton("Debit Card"); //Creating JButton object for "Debit Card Button"
     DebitCard.setBounds(200,125,120,32); //Measurements of X-axis, Y-axis, Width and Height respectively 
     DebitCard.setFont(new Font("Arial",Font.ITALIC,15)); //Change Font and Size of JButtton "Debit Card
     DebitCard.addActionListener(this); //Adding Action Listener to the JButton
     Bpanel.add(DebitCard); //Adding JButton to the panel
     
    //CODE SECTION FOR JBUTTON "CREDIT CARD" OF BANK CARD CLASS//
     CreditCard=new JButton("Credit Card"); //Creating JButton object for "Credit Card Button"
     CreditCard.setBounds(200,170,120,32); //Measurements of X-axis, Y-axis, Width and Height respectively 
     CreditCard.setFont(new Font("Arial",Font.ITALIC,15)); //Change Font and Size of JButtton "Credit Card"
     CreditCard.addActionListener(this); //Adding Action Listener to the JButton
     Bpanel.add(CreditCard); //Adding JButton to the panel
     
     BFrame.add(Bpanel);  //Adding JPanel to the JFrame
     BFrame.setVisible(true); //Set JFrame Visible value to "true" 
  }
  
   /**
    *  This Method create a method for Bank Gui and creatas credit card JFrame and JPannel with JButtons, JTextFields, JLabels and JComboBoxes 
    */
  public  void  Credit_Card()
  { 
    //CODE SECTION FOR JFRAME OF CREDIT CARD CLASS//   
     CCFrame = new JFrame(); //Creating JFrame Object for Credit Card  
     CCFrame.setTitle("Credit Card");  //Set JFrame tittle as "Credit Card"
     CCFrame.setBounds(300, 150, 800, 500); //Measurements of X-axis, Y-axis, Width and Height respectively of the JFrame
     CCFrame.setResizable(false); //Set JFrame Resizable value to "false"
     CCFrame.setLayout(null); //Set JFrame Layout value to "Null"
     
    //CODE SECTION FOR JPANEL OF CREDIT CARD CLASS//
     CCpanel = new JPanel(); //Creating JPanel Object for Credit Card  
     CCpanel.setBounds(0, 0, 800, 500); //Measurements of X-axis, Y-axis, Width and Height respectively of the JPanel
     CCpanel.setBackground(Color.GREEN); //set background Color to Green of the panel
     CCpanel.setLayout(null); //Set JPanel Layout value to "Null"
    
    //CODE SECTION FOR JLABEL "CREDIT CARD" OF CREDIT CARD CLASS//
     label_User=new JLabel("CREDIT CARD"); //Creating JLabel Object for CREDIT CARD  
     label_User.setBounds(320,35,180,35); //Measurements of X-axis, Y-axis, Width and Height respectively 
     label_User.setFont(new Font("Arial",Font.BOLD,25)); //Change Font and Size of JLabel "CREDIT CARD"
     CCpanel.add(label_User); //Adding JLabel to the Panel
     
    //CODE SECTION FOR JLABEL "CARD ID" OF CREDIT CARD CLASS//
     label_CardId_c=new JLabel("Card Id"); //Creating JLabel Object for "Card ID"
     label_CardId_c.setBounds(55,115,50,20); //Measurements of X-axis, Y-axis, Width and Height respectively 
     label_CardId_c.setFont(new Font("Arial",Font.BOLD,14)); //Change Font and Size of JLabel "Card Id"
     CCpanel.add(label_CardId_c); //Adding JLabel to the Panel
     
    //CODE SECTION FOR JTEXT FIELD "CARD ID" OF CREDIT CARD CLASS//
     field_CardId_c=new JTextField(); //Creating JTextField object for "Card Id"
     field_CardId_c.setBounds(185,115,130,24); //Measurements of X-axis, Y-axis, Width and Height respectively 
     CCpanel.add(field_CardId_c); //Adding JField to the Panel
     
    //CODE SECTION FOR JLABEL "BALANCE AMOUNT" OF CREDIT CARD CLASS//
     label_BalanceAmount_c=new JLabel("Balance Amount"); //Creating JLabel object for "Balance Amount" 
     label_BalanceAmount_c.setBounds(55,140,115,20); //Measurements of X-axis, Y-axis, Width and Height respectively 
     label_BalanceAmount_c.setFont(new Font("Arial",Font.BOLD,14)); //Change Font and Size of JLabel "Balance Amount"
     CCpanel.add(label_BalanceAmount_c); //Adding JLabel to the Panel
     
    //CODE SECTION FOR JTEXT FIELD "BALANCE AMOUNT" OF CREDIT CARD CLASS//
     field_BalanceAmount_c=new JTextField(); //Creating JTextField object for "Balance Amount"  
     field_BalanceAmount_c.setBounds(185,140,130,24); //Measurements of X-axis, Y-axis, Width and Height respectively 
     CCpanel.add(field_BalanceAmount_c); //Adding JField to the Panel
     
    //CODE SECTION FOR JLABEL "BANK ACCOUNT" OF CREDIT CARD CLASS//
     label_BankAccount_c=new JLabel("Bank Account"); //Creating JLablel object for "Bank Account"
     label_BankAccount_c.setBounds(55,165,100,20); //Measurements of X-axis, Y-axis, Width and Height respectively 
     label_BankAccount_c.setFont(new Font("Arial",Font.BOLD,14)); //Change Font and Size of JLabel "Bank Account"
     CCpanel.add(label_BankAccount_c); //Adding JLabel to the Panel
     
    //CODE SECTION FOR JTEXT FIELD "BANK ACCOUNT" OF CREDIT CARD CLASS// 
     field_BankAccount_c=new JTextField(); //Creating JTextField object for "Bank Account"  
     field_BankAccount_c.setBounds(185,165,130,24); //Measurements of X-axis, Y-axis, Width and Height respectively 
     CCpanel.add(field_BankAccount_c); //Adding JField to the Panel
     
    //CODE SECTION FOR JLABEL "EXPIRATION DATE" OF CREDIT CARD CLASS// 
     label_ExpirationDate_c=new JLabel("Expiration Date");  //Creating JLabel object for "Expiration Date"
     label_ExpirationDate_c.setBounds(55,195,110,20); //Measurements of X-axis, Y-axis, Width and Height respectively 
     label_ExpirationDate_c.setFont(new Font("Arial",Font.BOLD,14)); //Change Font and Size of JLabel "Expiration Date"
     CCpanel.add(label_ExpirationDate_c); //Adding JLabel to the Panel
     
    //CODE SECTION FOR JCOMBO BOX "DAY" OF CREDIT CARD CLASS//  
     box_day_c=new JComboBox(); //Creating JComboBox object for "Day"
     for (int i=1; i<=31; i++)  //using for loop to generate numbers from 1 to 31
       {box_day_c.addItem(i);}
     box_day_c.setBounds(180,195,65,25); //Measurements of X-axis, Y-axis, Width and Height respectively 
     CCpanel.add(box_day_c); //Adding JComboBox to the panel

    //CODE SECTION FOR JCOMBO BOX "MONTH" OF CREDIT CARD CLASS// 
     String[] month={"January","February","March","April","May","June","July","August","September","October","November","December"};
     box_month_c=new JComboBox(month); //Creating JComboBox object for "Month"
     box_month_c.setBounds(260,195,75,25); //Measurements of X-axis, Y-axis, Width and Height respectively 
     CCpanel.add(box_month_c); //Adding JComboBox to the panel

    //CODE SECTION FOR JCOMBO BOX "YEAR" OF CREDIT CARD CLASS// 
     box_year_c=new JComboBox(); //Creating JComboBox object for "Year"
     for (int i=1950; i<=2023; i++)  //using for loop to generate numbers from 1950 to 2023
       {box_year_c.addItem(i);}
     box_year_c.setBounds(350,195,75,25); //Measurements of X-axis, Y-axis, Width and Height respectively 
     CCpanel.add(box_year_c); //Adding JComboBox to the panel
      
    //CODE SECTION FOR JLABEL "ISSUER BANK" OF CREDIT CARD CLASS//
     label_IssuerBank_c=new JLabel("Issuer Bank"); //Creating JLabel object for "Issuer Bank" 
     label_IssuerBank_c.setBounds(500,115,90,20); //Measurements of X-axis, Y-axis, Width and Height respectively 
     label_IssuerBank_c.setFont(new Font("Arial",Font.BOLD,14)); //Change Font and Size of JLabel "Issuer Bank"
     CCpanel.add(label_IssuerBank_c); //Adding JLabel to the Panel
     
    //CODE SECTION FOR JTEXT FIELD "ISSUER BANK" OF CREDIT CARD CLASS//
     field_IssuerBank_c=new JTextField(); //Creating JTextField object for "Issuer Bank" 
     field_IssuerBank_c.setBounds(600,115,130,24); //Measurements of X-axis, Y-axis, Width and Height respectively 
     CCpanel.add(field_IssuerBank_c); //Adding JField to the Panel
     
    //CODE SECTION FOR JLABEL "CLIENT NAME" OF CREDIT CARD CLASS// 
     label_ClientName_c=new JLabel("Client Name");  //Creating JLabel object for "Client Name"
     label_ClientName_c.setBounds(500,140,90,20); //Measurements of X-axis, Y-axis, Width and Height respectively
     label_ClientName_c.setFont(new Font("Arial",Font.BOLD,14)); //Change Font and Size of JLabel "Client Name"
     CCpanel.add(label_ClientName_c); //Adding JLabel to the Panel
     
    //CODE SECTION FOR JTEXT AREA "CLIENT NAME" OF CREDIT CARD CLASS//
     field_ClientName_c=new JTextField(); //Creating JTextField object for "Client Name"  
     field_ClientName_c.setBounds(600,140,130,24); //Measurements of X-axis, Y-axis, Width and Height respectively 
     CCpanel.add(field_ClientName_c); //Adding JField to the Panel
     
    //CODE SECTION FOR JLABEL "CVC NUMBER" OF CREDIT CARD CLASS// 
     label_CVCNumber_c=new JLabel("CVC Number"); //Creating JLabel object for "CVC Number" 
     label_CVCNumber_c.setBounds(500,165,90,20); //Measurements of X-axis, Y-axis, Width and Height respectively 
     label_CVCNumber_c.setFont(new Font("Arial",Font.BOLD,14)); //Change Font and Size of JLabel "CVC Number"
     CCpanel.add(label_CVCNumber_c); //Adding JLabel to the Panel
     
    //CODE SECTION FOR JTEXT FIELD "CVC NUMBER" OF CREDIT CARD CLASS// 
     field_CVCNumber_c=new JTextField(); //Creating JTextField object for "CVC Number"  
     field_CVCNumber_c.setBounds(600,165,130,24); //Measurements of X-axis, Y-axis, Width and Height respectively 
     CCpanel.add(field_CVCNumber_c); //Adding JField to the Panel
     
    //CODE SECTION FOR JLABEL "INTREST RATE" OF CREDIT CARD CLASS// 
     label_IntrestRate_c=new JLabel("Intrest Rate");  //Creating JLabel object for "Intrest Rate"
     label_IntrestRate_c.setBounds(500,190,90,20); //Measurements of X-axis, Y-axis, Width and Height respectively 
     label_IntrestRate_c.setFont(new Font("Arial",Font.BOLD,14)); //Change Font and Size of JLabel "Intrest Rate"
     CCpanel.add(label_IntrestRate_c); //Adding JLabel to the Panel
                 
    //CODE SECTION FOR JTEXT FIELD "INTREST RATE" OF CREDIT CARD CLASS//  
     field_IntrestRate_c=new JTextField(); //Creating JTextField object for "Intrest Rate" 
     field_IntrestRate_c.setBounds(600,190,130,24); //Measurements of X-axis, Y-axis, Width and Height respectively 
     CCpanel.add(field_IntrestRate_c); //Adding JField to the Panel
     
  
    //CODE SECTION FOR JBUTTON "ADD CREDIT CARD" OF CREDIT CARD CLASS// 
     AddCreditCard_c=new JButton("Add Credit Card"); //Creating JButton object for "Add Credit Card Button"
     AddCreditCard_c.setBounds(335,250,140,30); //Measurements of X-axis, Y-axis, Width and Height respectively 
     AddCreditCard_c.setFont(new Font("Arial",Font.ITALIC,15)); //Change Font and Size of JButtton "Add Credit Card"
     AddCreditCard_c.addActionListener(this); //Adding Action Listener to the JButton
     CCpanel.add(AddCreditCard_c); //Adding JButton to the panel
     
    //CODE SECTION FOR JBUTTON "CANCEL CREDIT CARD" OF CREDIT CARD CLASS// 
     CancelCreditCard_c=new JButton("Cancel Credit Card");  //Creating JButton object for "Cancel Credit Card Button"
     CancelCreditCard_c.setBounds(550,250,160,30); //Measurements of X-axis, Y-axis, Width and Height respectively 
     CancelCreditCard_c.setFont(new Font("Arial",Font.ITALIC,15)); //Change Font and Size of JButtton "Cancel Credit Card"
     CancelCreditCard_c.addActionListener(this); //Adding Action Listener to the JButton
     CCpanel.add(CancelCreditCard_c); //Adding JButton to the panel
     
    //CODE SECTION FOR JBUTTON "GO BACK" OF CREDIT CARD CLASS// 
     GoBack_c=new JButton("Go Back"); //Creating JButton object for "Go Back Button" 
     GoBack_c.setBounds(465,305,95,30); //Measurements of X-axis, Y-axis, Width and Height respectively 
     GoBack_c.setFont(new Font("Arial",Font.ITALIC,15)); //Change Font and Size of JButtton "Change To DebitCard"
     GoBack_c.addActionListener(this); //Adding Action Listener to the JButton
     CCpanel.add(GoBack_c); //Adding JButton to the panel
     
    //CODE SECTION FOR JLABEL "CREDIT LIMIT" OF CREDIT CARD CLASS//  
     label_CreditLimit_c=new JLabel("Credit Limit");  //Creating JLabel object for "Credit Limit"
     label_CreditLimit_c.setBounds(55,340,90,20); //Measurements of X-axis, Y-axis, Width and Height respectively 
     label_CreditLimit_c.setFont(new Font("Arial",Font.BOLD,14)); //Change Font and Size of JLabel "Credit Limit"
     CCpanel.add(label_CreditLimit_c); //Adding JLabel to the Panel
     
    //CODE SECTION FOR JTEXT FIELD "CREDIT LIMIT" OF CREDIT CARD CLASS//
     field_CreditLimit_c=new JTextField();  //Creating JTextField object for "Credit Limit"
     field_CreditLimit_c.setBounds(160,340,130,24); //Measurements of X-axis, Y-axis, Width and Height respectively 
     CCpanel.add(field_CreditLimit_c); //Adding JField to the Panel
     
    //CODE SECTION FOR JLABEL "GRACE PERIOD" OF CREDIT CARD CLASS// 
     label_GracePeriod_c=new JLabel("Grace Period");  //Creating JLabel object for "Grace Period"
     label_GracePeriod_c.setBounds(55,375,100,20); //Measurements of X-axis, Y-axis, Width and Height respectively
     label_GracePeriod_c.setFont(new Font("Arial",Font.BOLD,14)); //Change Font and Size of JLabel "Grace Period"
     CCpanel.add(label_GracePeriod_c); //Adding JLabel to the Panel
     
    //CODE SECTION FOR JTEXT FIELD "GRACE PERIOD" OF CREDIT CARD CLASS// 
     field_GracePeriod_c=new JTextField();  //Creating JTextField object for "Grace Period"
     field_GracePeriod_c.setBounds(160,375,130,24); //Measurements of X-axis, Y-axis, Width and Height respectively 
     CCpanel.add(field_GracePeriod_c); //Adding JField to the Panel
     
    //CODE SECTION FOR JBUTTON "SET CREDIT LIMIT" OF CREDIT CARD CLASS// 
     SetCreditLimit_c=new JButton("Set Credit Limit"); //Creating JButton object for "Set Credit Limit Button" 
     SetCreditLimit_c.setBounds(315,355,135,30); //Measurements of X-axis, Y-axis, Width and Height respectively
     SetCreditLimit_c.setFont(new Font("Arial",Font.ITALIC,15)); //Change Font and Size of JButtton "Set Credit Limit"
     SetCreditLimit_c.addActionListener(this); //Adding Action Listener to the JButton
     CCpanel.add(SetCreditLimit_c); //Adding JButton to the panel
     
    //CODE SECTION FOR JBUTTON "DISPLAY" OF CREDIT CARD CLASS// 
     Display_c=new JButton("Display");  //Creating JButton object for "Display Button"
     Display_c.setBounds(540,380,90,30); //Measurements of X-axis, Y-axis, Width and Height respectively
     Display_c.setFont(new Font("Arial",Font.ITALIC,15)); //Change Font and Size of JButtton "Display"
     Display_c.addActionListener(this); //Adding Action Listener to the JButton
     CCpanel.add(Display_c); //Adding JButton to the panel
    
    //CODE SECTION FOR JBUTTON "CLEAR" OF CREDIT CARD CLASS//  
     Clear_c=new JButton("Clear");  //Creating JButton object for "Clear Button"
     Clear_c.setBounds(650,380,85,30); //Measurements of X-axis, Y-axis, Width and Height respectively 
     Clear_c.setFont(new Font("Arial",Font.ITALIC,15)); //Change Font and Size of JButtton "Clear"
     Clear_c.addActionListener(this); //Adding Action Listener to the JButton
     CCpanel.add(Clear_c); //Adding JButton to the panel
     
     CCFrame.add(CCpanel);  //Adding JPanel to the JFrame
     CCFrame.setVisible(true); //Set JFrame Visible value to "true" 
  }
  
   /**
    *  This Method create a method for Bank Gui and creatsa debitit card JFrame and JPannel with JButtons, JTextFields, JLabels and JComboBoxes 
    */
   public  void Debit_Card()
  { 
    //CODE SECTION FOR JFRAME OF DEBIT CARD CLASS//   
     DCFrame = new JFrame(); //Creating JFrame object for Debit Card"
     DCFrame.setTitle("Debit Card"); //set JFrame title as "Debit Card"
     DCFrame.setBounds(300, 150, 800, 510); //Measurements of X-axis, Y-axis, Width and Height respectively 
     DCFrame.setResizable(false); //Set JFrame Resizable value to "false"
     DCFrame.setLayout(null); //set JFrame Layout value to "Null"
    
    //CODE SECTION FOR JPANEL OF DEBIT CARD CLASS//
     DCpanel = new JPanel(); //Creating JPanel object for Debit Card"
     DCpanel.setBounds(0, 0, 800, 510); //Measurements of X-axis, Y-axis, Width and Height respectively 
     DCpanel.setBackground(Color.cyan); //Set JPanel Background color to cyan
     DCpanel.setLayout(null); //set JPanel Layout value to "Null"
     
    //CODE SECTION FOR JLABEL "DEBIT CARD" OF DEBIT CARD CLASS// 
     label_User=new JLabel("DEBIT CARD"); //Creating JLabel object for "DEBIT CARD"
     label_User.setBounds(320,35,180,35); //Measurements of X-axis, Y-axis, Width and Height respectively 
     label_User.setFont(new Font("Arial",Font.BOLD,25)); //Set Font and size of the JLabel
     DCpanel.add(label_User); //Adding JLabel to the Panel
     
    //CODE SECTION FOR JLABEL "CARD ID" OF DEBIT CARD CLASS//  
     label_CardId_d=new JLabel("Card Id"); //Creating JLabel object for "Card Id" 
     label_CardId_d.setBounds(55,115,50,20); //Measurements of X-axis, Y-axis, Width and Height respectively 
     label_CardId_d.setFont(new Font("Arial",Font.BOLD,14)); //Change Font and Size of JLabel "Card Id"
     DCpanel.add(label_CardId_d); //Adding JLabel to the Panel
     
    //CODE SECTION FOR JTEXT FIELD "CARD ID" OF DEBIT CARD CLASS//
     field_CardId_d=new JTextField(); //Creating JTextField object for "Card Id" 
     field_CardId_d.setBounds(185,115,130,24); //Measurements of X-axis, Y-axis, Width and Height respectively 
     DCpanel.add(field_CardId_d); //Adding JField to the Panel
     
    //CODE SECTION FOR JLABEL "BALANCE AMOUNT" OF DEBIT CARD CLASS// 
     label_BalanceAmount_d=new JLabel("Balance Amount"); //Creating JLabel object for "Balance Amount" 
     label_BalanceAmount_d.setBounds(55,140,115,20); //Measurements of X-axis, Y-axis, Width and Height respectively 
     label_BalanceAmount_d.setFont(new Font("Arial",Font.BOLD,14)); //Change Font and Size of JLabel "Balance Amount"
     DCpanel.add(label_BalanceAmount_d); //Adding JLabel to the Panel
     
    //CODE SECTION FOR JTEXT FIELD "BALANCE AMOUNT" OF DEBIT CARD CLASS/ 
     field_BalanceAmount_d=new JTextField();  //Creating JTextField object for "Balance Amount" 
     field_BalanceAmount_d.setBounds(185,140,130,24); //Measurements of X-axis, Y-axis, Width and Height respectively 
     DCpanel.add(field_BalanceAmount_d); //Adding JField to the Panel
     
    //CODE SECTION FOR JLABEL "BANK ACCOUNT" OF DEBIT CARD CLASS// 
     label_BankAccount_d=new JLabel("Bank Account"); //Creating JLabel object for "Bank Account" 
     label_BankAccount_d.setBounds(55,165,100,20); //Measurements of X-axis, Y-axis, Width and Height respectively 
     label_BankAccount_d.setFont(new Font("Arial",Font.BOLD,14)); //Change Font and Size of JLabel "Bank Account"
     DCpanel.add(label_BankAccount_d); //Adding JLabel to the Panel
     
    //CODE SECTION FOR JTEXT FIELD "BANK ACCOUNT" OF DEBIT CARD CLASS//
     field_BankAccount_d=new JTextField(); //Creating JTextField object for "Bank Account" 
     field_BankAccount_d.setBounds(185,165,130,24); //Measurements of X-axis, Y-axis, Width and Height respectively 
     DCpanel.add(field_BankAccount_d); //Adding JField to the Panel
     
    //CODE SECTION FOR JLABEL "ISSUER BANK" OF DEBIT CARD CLASS/
     label_IssuerBank_d=new JLabel("Issuer Bank"); //Creating JLabel object for "Issuer Bank" 
     label_IssuerBank_d.setBounds(500,115,90,20); //Measurements of X-axis, Y-axis, Width and Height respectively 
     label_IssuerBank_d.setFont(new Font("Arial",Font.BOLD,14)); //Change Font and Size of JLabel "Issuer Bank"
     DCpanel.add(label_IssuerBank_d); //Adding JLabel to the Panel
     
    //CODE SECTION FOR JTEXT FIELD "ISSUER BANK" OF DEBIT CARD CLASS/
     field_IssuerBank_d=new JTextField(); //Creating JTextField object for "Issuer Bank" 
     field_IssuerBank_d.setBounds(600,115,130,24); //Measurements of X-axis, Y-axis, Width and Height respectively 
     DCpanel.add(field_IssuerBank_d); //Adding JField to the Panel
     
    //CODE SECTION FOR JLABEL "CLIENT NAME" OF DEBIT CARD CLASS//
     label_ClientName_d=new JLabel("Client Name"); //Creating JLabel object for "Client Name" 
     label_ClientName_d.setBounds(500,140,90,20); //Measurements of X-axis, Y-axis, Width and Height respectively
     label_ClientName_d.setFont(new Font("Arial",Font.BOLD,14)); //Change Font and Size of JLabel "Client Name"
     DCpanel.add(label_ClientName_d); //Adding JLabel to the Panel
     
    //CODE SECTION FOR JTEXT FIELD "CLIENT NAME" OF DEBIT CARD CLASS//
     field_ClientName_d=new JTextField(); //Creating JTextField object for "Client Name" 
     field_ClientName_d.setBounds(600,140,130,24); //Measurements of X-axis, Y-axis, Width and Height respectively 
     DCpanel.add(field_ClientName_d); //Adding JField to the Panel
     
    //CODE SECTION FOR JLABEL "PIN NUMBER" OF DEBIT CARD CLASS// 
     label_PinNumber_d=new JLabel("Pin Number"); //Creating JLabel object for "Pin Number"  
     label_PinNumber_d.setBounds(500,165,90,20); //Measurements of X-axis, Y-axis, Width and Height respectively 
     label_PinNumber_d.setFont(new Font("Arial",Font.BOLD,14)); //Change Font and Size of JLabel "Pin Number"
     DCpanel.add(label_PinNumber_d); //Adding JLabel to the Panel
     
    //CODE SECTION FOR JTEXT FIELD "PIN NUMBER" OF DEBIT CARD CLASS// 
     field_PinNumber_d=new JTextField(); //Creating JTextField object for "Pin Number" 
     field_PinNumber_d.setBounds(600,165,130,24); //Measurements of X-axis, Y-axis, Width and Height respectively 
     DCpanel.add(field_PinNumber_d); //Adding JField to the Panel
     
    //CODE SECTION FOR JBUTTON "ADD DEBIT CARD" OF DEBIT CARD CLASS// 
     AddDebitCard_d=new JButton("Add Debit Card"); //Creating JButton object for "Add Debit Card Button" 
     AddDebitCard_d.setBounds(335,240,135,30); //Measurements of X-axis, Y-axis, Width and Height respectively 
     AddDebitCard_d.setFont(new Font("Arial",Font.ITALIC,15)); //Change Font and Size of JButtton "Add Debit Card"
     AddDebitCard_d.addActionListener(this); //Adding Action Listener to the JButton
     DCpanel.add(AddDebitCard_d); //Adding JButton to the panel
     
    ///CODE SECTION FOR JBUTTON "GO BACK" OF DEBIT CARD CLASS//
     GoBack_d=new JButton("Go Back"); //Creating JButton object for "Go Back Button" 
     GoBack_d.setBounds(530,275,95,30); //Measurements of X-axis, Y-axis, Width and Height respectively 
     GoBack_d.setFont(new Font("Arial",Font.ITALIC,15)); //Change Font and Size of JButtton "Change To Credit Card"
     GoBack_d.addActionListener(this); //Adding Action Listener to the JButton
     DCpanel.add(GoBack_d); //Adding JButton to the panel
     
    //CODE SECTION FOR JLABEL "WITHDRAWL AMOUNT" OF DEBIT CARD CLASS// 
     label_WithdrawlAmount_d=new JLabel("Withdrawl Amount"); //Creating JLabel object for "Withdrawl Amount" 
     label_WithdrawlAmount_d.setBounds(55,300,130,20); //Measurements of X-axis, Y-axis, Width and Height respectively 
     label_WithdrawlAmount_d.setFont(new Font("Arial",Font.BOLD,14)); //Change Font and Size of JLabel "Withdrawl Amount"
     DCpanel.add(label_WithdrawlAmount_d); //Adding JLabel to the Panel
     
    //CODE SECTION FOR JTEXT FIELD "WITHDRAWL AMOUNT" OF DEBIT CARD CLASS// 
     field_WithdrawlAmount_d=new JTextField(); //Creating JTextField object for "Withdrawl Amount"  
     field_WithdrawlAmount_d.setBounds(195,300,130,24); //Measurements of X-axis, Y-axis, Width and Height respectively 
     DCpanel.add(field_WithdrawlAmount_d); //Adding JField to the Panel
    
    //CODE SECTION FOR JLABEL "DATE of WITHDRAWL" OF DEBIT CARD CLASS//
     label_DateOfWithdrawl_d=new JLabel("Date Of Withdrawl");  //Ceating JLabel object for "Date of Withdrawl " 
     label_DateOfWithdrawl_d.setBounds(55,340,125,20); //Measurements of X-axis, Y-axis, Width and Height respectively 
     label_DateOfWithdrawl_d.setFont(new Font("Arial",Font.BOLD,14)); //Change Font and Size of JLabel "Date Of Withdrawl"
     DCpanel.add(label_DateOfWithdrawl_d); //Adding JLabel to the Panel
     
    //CODE SECTION FOR JCOMBO BOX "DAY" OF DEBIT CARD CLASS//
     box_day_d=new JComboBox(); //Creating JComboBox object for "Day"
     for (int i=1; i<=31; i++) //using for loop to generate numbers from 1 to 31
       {box_day_d.addItem(i);}
     box_day_d.setBounds(195,340,65,25); //Measurements of X-axis, Y-axis, Width and Height respectively 
     DCpanel.add(box_day_d); //Adding JComboBox to the panel

    //CODE SECTION FOR JCOMBO BOX "MONTH" OF DEBIT CARD CLASS//
     String[] month={"January","February","March","April","May","June","July","August","September","October","November","December"};
     box_month_d=new JComboBox(month); //Creating JComboBox object for "Month"
     box_month_d.setBounds(270,340,75,25); //Measurements of X-axis, Y-axis, Width and Height respectively 
     DCpanel.add(box_month_d); //Adding JComboBox to the panel

    //CODE SECTION FOR JCOMBO BOX "YEAR" OF DEBIT CARD CLASS//
     box_year_d=new JComboBox(); //Creating JComboBox object for "Year"
     for (int i=1950; i<=2023; i++) //using for loop to generate numbers from 1950 to 2023
       {box_year_d.addItem(i);}
     box_year_d.setBounds(355,340,75,25); //Measurements of X-axis, Y-axis, Width and Height respectively 
     DCpanel.add(box_year_d); //Adding JComboBox to the panel
     
    ///CODE SECTION FOR JBUTTON "WITHDRAW" OF DEBIT CARD CLASS//
     Withdraw_d=new JButton("Withdraw");  //Creating JButton object for "Withdraw Button"
     Withdraw_d.setBounds(230,395,95,30); //Measurements of X-axis, Y-axis, Width and Height respectively 
     Withdraw_d.setFont(new Font("Arial",Font.ITALIC,15)); //Change Font and Size of JButtton "Withdraw"
     Withdraw_d.addActionListener(this); //Adding Action Listener to the JButton
     DCpanel.add(Withdraw_d); //Adding JButton to the panel
     
    ///CODE SECTION FOR JBUTTON "DISPLAY" OF DEBIT CARD CLASS//
     Display_d=new JButton("Display");  //Creating JButton object for "Display Button"
     Display_d.setBounds(565,395,90,30); //Measurements of X-axis, Y-axis, Width and Height respectively 
     Display_d.setFont(new Font("Arial",Font.ITALIC,15)); //Change Font and Size of JButtton "Display"
     Display_d.addActionListener(this); //Adding Action Listener to the JButton
     DCpanel.add(Display_d); //Adding JButton to the panel
     
    ///CODE SECTION FOR JBUTTON "CLEAR" OF DEBIT CARD CLASS//
     Clear_d=new JButton("Clear");  //Creating JButton object for "Clear Button"
     Clear_d.setBounds(670,395,85,30); //Measurements of X-axis, Y-axis, Width and Height respectively 
     Clear_d.setFont(new Font("Arial",Font.ITALIC,15)); //Change Font and Size of JButtton "Clear"
     Clear_d.addActionListener(this); //Adding Action Listener to the JButton
     DCpanel.add(Clear_d); //Adding JButton to the panel
     
     DCFrame.add(DCpanel);  //Adding JPanel to the JFrame
     DCFrame.setVisible(true); //Set JFrame Visible value to "true"
  }
   
    /**
    * This Method handles the button clicks and exceptions
    */
   public void actionPerformed(ActionEvent e)
   { 
        if (e.getSource()==DebitCard)
         {
           Debit_Card(); //Debit Card method is called and Frame of Debit Card GUI Form is visible
           BFrame.dispose(); // Main Frame of Bank GUi is set to invisible from the screen
         }
        
        else if (e.getSource()==CreditCard)
         {
           Credit_Card(); //Credit Card method is called and Frame of Credit Card GUI Form is visible
           BFrame.dispose(); // Main Frame of Bank GUi is set to invisible from the screen 
         }
        else if (e.getSource() == AddDebitCard_d)
        {
          try{  
            int CI = Integer.valueOf(field_CardId_d.getText()); //Value of JTextField is converted and stored in a local variable
            double  BL=Double.valueOf(field_BalanceAmount_d.getText()); //Value of JTextField is converted and stored in a local variable
            String BA=field_BankAccount_d.getText(); //Value of JTextField is stored in a local variable
            String IB=field_IssuerBank_d.getText(); //Value of JTextField is stored in a local variable
            String CN=field_ClientName_d.getText(); //Value of JTextField is stored in a local variable
            int PN=Integer.valueOf(field_PinNumber_d.getText()); //Value of JTextField is converted and stored in a local variable
            boolean condition=true; //a boolean variable is assigned as true
           
            for(Bank_Card DC:Arr_List) 
            {
             if (DC instanceof Debit_Card)
             {
                Debit_Card Debit_object=(Debit_Card) DC; //Down Casting of Debit_Card object
                 
                if(DC.getCard_Id()==CI) //validating Card Id through iterating in  Array List objects
                  {
                     condition=false; //setting boolean condtion to false
                     break; //Terminate
                   }
             }
            } 
           
            if(condition==true)
            {
              Debit_Card Debit_object = new Debit_Card(CI,BA,BL,IB,CN,PN ); 
              Arr_List.add(Debit_object); // object of Debit Card is added to the Array list
             JOptionPane.showMessageDialog(DCpanel,"Card Id "+CI+" is Successfully Added to the Debit Card"); //Suitable message is displayed on dailoge box 
            }
            else if(condition==false)
            {
               JOptionPane.showMessageDialog(DCpanel,"Debit Card with Card ID "+CI+" already exists");  //Suitable message is displayed on dailoge box 
            }
         } catch(NumberFormatException ex) //Number Format Exception Handling
          {
              JOptionPane.showMessageDialog(DCpanel,"Invalid inputs detected, please enter the details."); //Suitable message is displayed on dailoge box 
          }catch (NullPointerException ex) //Null Pointer Exception Handling
           {
            JOptionPane.showMessageDialog(DCpanel, "Please fill up all the requirements."); //Suitable message is displayed on dailoge box 
          }
        }
       
        else if (e.getSource() ==Withdraw_d)
        { 
         try{   
           int CI = Integer.valueOf(field_CardId_d.getText());  //Value of JTextField is converted and stored in a local variable
           double BL=Double.valueOf(field_BalanceAmount_d.getText()); //Value of JTextField is converted and stored in a local variable
           String BA=field_BankAccount_d.getText(); //Value of JTextField is stored in a local variable
           String IB=field_IssuerBank_d.getText(); //Value of JTextField is stored in a local variable
           String CN=field_ClientName_d.getText(); //Value of JTextField is stored in a local variable
           String D=String.valueOf(box_day_d.getSelectedItem()); //Value of JTextField is converted and stored in a local variable
           String M=String.valueOf(box_month_d.getSelectedItem()); //Value of JTextField is converted and stored in a local variable
           String Y=String.valueOf(box_year_d.getSelectedItem()); //Value of JTextField is converted and stored in a local variable 
           int WA=Integer.valueOf(field_WithdrawlAmount_d.getText()); //Value of JTextField is converted and stored in a local variable
           String DW=D + M+ Y; //Value of JTextField after converting and adding together is stored in a local variable
           int PN=Integer.valueOf(field_PinNumber_d.getText()); //Value of JTextField is converted and stored in a local variable
           
           for(Bank_Card DC:Arr_List)
           {
             if (DC instanceof Debit_Card)
             {
                Debit_Card Debit_object=(Debit_Card) DC; //Down Casting of Debit_Card object
                
                if(DC.getCard_Id()==CI) //validating Card Id through iterating in  Array List objects
                  
                {
                      if (PN==Debit_object.getpin_number()) //validating pin number from array list object and debit card class
                      {
                          if(WA<=Debit_object.getBalance_Amount())
                             {    
                               Debit_object.withdraw(WA,DW,PN);
                               JOptionPane.showMessageDialog(DCpanel,"Card Id is: "+CI+"\n"+ "Withdrawl Amount is: "+WA+"\n"+"Date of withdrawl is: "+DW+"\n"+"Pin Number is: "+PN+"\n");
                               field_BalanceAmount_d.setText(Double.toString(Debit_object.getBalance_Amount()));    
                             }
                          else
                            {
                              JOptionPane.showMessageDialog(DCpanel,"Card Id "+CI+"Have Insufficient Balance"); //Suitable message is displayed on dailoge box 
                           }
                        } 
                       else 
                         { 
                             JOptionPane.showMessageDialog(DCpanel,"Dear user, You have entered the Invalid Pin"); //Suitable message is displayed on dailoge box 
                         }
                }   
                else 
                {
                    JOptionPane.showMessageDialog(DCpanel,"Dear user, You have entered Invalid Card Id"); //Suitable message is displayed on dailoge box 
                }  
              }
           }
        }catch(NumberFormatException ex) //Number Format Exception Handling
          { 
            JOptionPane.showMessageDialog(DCpanel,"Invalid input detected, please enter again"); //Suitable message is displayed on dailoge box 
          } catch(NullPointerException ex) //Null Pointer Exception Handling
           {
            JOptionPane.showMessageDialog(DCpanel, "Please fill up all the requirements."); //Suitable message is displayed on dailoge box 
           }
        }
        else if (e.getSource()==AddCreditCard_c)
        { 
          try{   
            int CI = Integer.valueOf(field_CardId_c.getText()); //Value of JTextField is converted and stored in a local variable
            double  BL=Double.valueOf(field_BalanceAmount_c.getText()); //Value of JTextField is converted and stored in a local variable
            String BA=field_BankAccount_c.getText(); //Value of JTextField is stored in a local variable
            String IB=field_IssuerBank_c.getText(); //Value of JTextField is stored in a local variable
            String CN=field_ClientName_c.getText(); //Value of JTextField is stored in a local variable
            int CVC=Integer.valueOf(field_CVCNumber_c.getText()); //Value of JTextField is converted and stored in a local variable
            double IR=Double.valueOf(field_IntrestRate_c.getText()); //Value of JTextField is converted and stored in a local variable
            String D=String.valueOf(box_day_c.getSelectedItem()); //Value of JTextField is converted and stored in a local variable
            String M=String.valueOf(box_month_c.getSelectedItem()); //Value of JTextField is converted and stored in a local variable
            String Y=String.valueOf(box_year_c.getSelectedItem());//Value of JTextField is converted and stored in a local variable
            String ED=(D+""+M+""+Y); //Value of JTextField after converting and adding together is stored in a local variable
            boolean condition=true; //boolean variable is assigned as true
           
             for(Bank_Card CC:Arr_List)
             {
               if (CC instanceof Credit_Card)
              {
                Credit_Card Credit_object=(Credit_Card) CC; //Down Casting of Credit_Card object
                
                 if(CC.getCard_Id()==CI) //validating Card Id through iterating in  Array List objects
                  {
                      condition=false; // set boolean condition to false
                       break; //Terminate
                  }
              }
             } 
           
             if(condition==true)
             { 
               Credit_Card Credit_object = new Credit_Card(CI,BA,BL,IB,CN,CVC,IR,ED ); 
               Arr_List.add(Credit_object); //object of Credir Card is added to the Array List
              JOptionPane.showMessageDialog(CCpanel,"Card Id "+CI+" is Successfully Added to the Credit Card"); //Suitable message is displayed on dailoge box 
             }
             else if(condition==false)
             {
               JOptionPane.showMessageDialog(CCpanel,"Credit Card with Card ID  "+CI+" already exists"); //Suitable message is displayed on dailoge box 
             }
            }catch(NumberFormatException ex) //Number Format Exception Handling
             {
               JOptionPane.showMessageDialog(CCpanel,"Invalid input detected, please enter again"); //Suitable message is displayed on dailoge box 
             }catch (NullPointerException ex) //Null Pointer Exception Handling
              {
                JOptionPane.showMessageDialog(CCpanel, "Please fill up all the requirements."); //Suitable message is displayed on dailoge box 
              }
          }
        
        else if (e.getSource()==SetCreditLimit_c)
        {
         try{   
            int CI = Integer.valueOf(field_CardId_c.getText()); //Value of JTextField is converted and stored in a local variable
            double  BL=Double.valueOf(field_BalanceAmount_c.getText()); //Value of JTextField is converted and stored in a local variable
            String BA=field_BankAccount_c.getText(); //Value of JTextField is stored in a local variable
            String IB=field_IssuerBank_c.getText(); //Value of JTextField is stored in a local variable
            String CN=field_ClientName_c.getText(); //Value of JTextField is stored in a local variable
            int CVC=Integer.valueOf(field_CVCNumber_c.getText()); //Value of JTextField is converted and stored in a local variable
            double IR=Double.valueOf(field_IntrestRate_c.getText()); //Value of JTextField is converted and stored in a local variable
            String D=String.valueOf(box_day_c.getSelectedItem()); //Value of JTextField is converted and stored in a local variable
            String M=String.valueOf(box_month_c.getSelectedItem()); //Value of JTextField is converted and stored in a local variable
            String Y=String.valueOf(box_year_c.getSelectedItem()); //Value of JTextField is converted and stored in a local variable
            String ED=D+M+Y; //Value of JTextField after converting and adding together is stored in a local variable
            double CL=Double.valueOf(field_CreditLimit_c.getText()); //Value of JTextField is converted and stored in a local variable
            int GP=Integer.valueOf(field_GracePeriod_c.getText()); //Value of JTextField is converted and stored in a local variable
            
            for(Bank_Card CC:Arr_List)
           {
               if (CC instanceof Credit_Card)
             {
                Credit_Card Credit_object=(Credit_Card) CC; //Down Casting of Credit_Card object
                
                if(CC.getCard_Id()==CI) //validating Card Id through iterating in  Array List objects
                  
                { 
                     if (CL<= 2.5 * Credit_object.getBalance_Amount()) 
                     { 
                       JOptionPane.showMessageDialog(CCpanel,"Card Id is: "+CI+"\n"+ "New Credit Limit is: "+CL+"\n"+"New Grace Period is: "+GP+" Months"); //Suitable message is displayed on dailoge box 
                       Credit_object.setCreditLimit(CL,GP);
                     } 
                     else 
                     {
                      JOptionPane.showMessageDialog(CCpanel,"Sorry!, Your Credit Cannot be issued"); //Suitable message is displayed on dailoge box 
                     }      
                }
                   
                else 
                {
                    JOptionPane.showMessageDialog(CCpanel,"Dear user, You have entered Invalid Card Id"); //Suitable message is displayed on dailoge box 
                } 
              }
           }
          }catch( NullPointerException ex) //Null Pointer Exception Handling
           { 
             JOptionPane.showMessageDialog(CCpanel,"Invalid input detected, please enter again"); //Suitable message is displayed on dailoge box 
           }catch(NumberFormatException ex) //Number Format Exception Handling
            {
              JOptionPane.showMessageDialog(CCpanel,"Please fill up all the requirements."); //Suitable message is displayed on dailoge box 
            }
         }  
        else if (e.getSource()==CancelCreditCard_c)
        { 
          try{ 
             int CI = Integer.valueOf(field_CardId_c.getText()); //Value of JTextField is converted and stored in a local variable
             double  BL=Double.valueOf(field_BalanceAmount_c.getText()); //Value of JTextField is converted and stored in a local variable
             String BA=field_BankAccount_c.getText(); //Value of JTextField is stored in a local variable
             String IB=field_IssuerBank_c.getText(); //Value of JTextField is stored in a local variable
             String CN=field_ClientName_c.getText(); //Value of JTextField is stored in a local variable
             int CVC=Integer.valueOf(field_CVCNumber_c.getText()); //Value of JTextField is converted and stored in a local variable
             double IR=Double.valueOf(field_IntrestRate_c.getText()); //Value of JTextField is converted and stored in a local variable
             String D=String.valueOf(box_day_c.getSelectedItem()); //Value of JTextField is converted and stored in a local variable
             String M=String.valueOf(box_month_c.getSelectedItem()); //Value of JTextField is converted and stored in a local variable
             String Y=String.valueOf(box_year_c.getSelectedItem()); //Value of JTextField is converted and stored in a local variable
             String ED=D+M+Y; //Value of JTextField after converting and adding together is stored in a local variable
             double CL=Double.valueOf(field_CreditLimit_c.getText()); //Value of JTextField is converted and stored in a local variable
             int GP=Integer.valueOf(field_GracePeriod_c.getText()); //Value of JTextField is converted and stored in a local variable
            for(Bank_Card CC:Arr_List)
            { 
             if (CC instanceof Credit_Card)
             {
                Credit_Card Credit_object=(Credit_Card) CC; //Down Casting of Credit_Card object
                if(CC.getCard_Id()==CI) //validating Card Id through iterating in  Array List objects
                { 
                   Credit_object.cancelCreditCard(); //Credit Card object is used to call Cancel Credit Card method from Credit Card Class
                   field_CVCNumber_c.setText("0"); //JText field value of CVC Number of Credit Card is set to zero
                   field_CreditLimit_c.setText("0"); //JText field value of CVC Number of Credit Card is set to zero
                   field_GracePeriod_c.setText("0"); //JText field value of CVC Number of Credit Card is set to zero
                   JOptionPane.showMessageDialog(CCpanel,"Dear User, Your Credit Card with Id "+CI+" has been sucessfully cancelled"); //Suitable message is displayed on dailoge box 
                   Arr_List.remove(CC); // Object is removed from the array list
                }  
                else 
                {
                    JOptionPane.showMessageDialog(CCpanel,"You have entered invalid Card Id"); //Suitable message is displayed on dailoge box 
                } 
              }
             }
            }catch(NumberFormatException ex) //Number Format Exception Handling
             {
               JOptionPane.showMessageDialog(CCpanel,"Invalid input detected, please enter again"); //Suitable message is displayed on dailoge box 
             }catch(NullPointerException ex) //Null Pointer Exception Handling
              {
               JOptionPane.showMessageDialog(CCpanel, "Please fill up all the requirements."); //Suitable message is displayed on dailoge box 
              }
          }  
        else if (e.getSource()==Display_d)
        {  
            
              for (Bank_Card DC:Arr_List)
             {
                 if( DC instanceof Debit_Card)
                 {  
                    Debit_Card DO=(Debit_Card) DC; //Down Casting of Debtit_Card object
                    String CI = Integer.toString(DC.getCard_Id());  //Value from Debit_Card class is called, converted and stored in a local variable
                    String CN = DC.getClient_Name(); //Value from Debit Card class is called and stored in a local variable
                    String BA = DC.getBank_Account(); //Value from Debit Card class is called and stored in a local variable
                    String IB = DC.getIssuer_Bank(); //Value from Debit Card class is called and stored in a local variable
                    String BL = Double.toString(DC.getBalance_Amount());  //Value from Debit_Card class is called, converted and stored in a local variable
                    String WA = Integer.toString(DO.getwithdrawal_amount());  //Value from Debit_Card class is called, converted and stored in a local variable
                    String DW = DO.getdateOFwithdrawal();  //Value from Debit_Card class is called, converted and stored in a local variable
                    String PN = Integer.toString(DO.getpin_number()); //Value from Debit_Card class is called, converted and stored in a local variable
                    String DV = "Card Id is: "+CI+"\n"+ "Client Name is: "+CN+"\n"+"Bank Account is: "+BA+"\n"+"Issuer Bank is: "+IB+"\n"+"Balance Amount is: "+BL+"\n"+"Withdrawl Amount is: "+WA+"\n"+"Date of withdrawl is: "+DW+"\n"+"Pin Number is: "+PN+"\n";
                    JOptionPane.showMessageDialog(DCpanel,DV); //Suitable message is displayed on dailoge box 
                    DO.display(); // display method of Debit_Card class is called
                 }
             }
        }
        else if (e.getSource()==Display_c)
        {
            for (Bank_Card CC:Arr_List)
             { if( CC instanceof Credit_Card)
                 {  
                    Credit_Card CO=(Credit_Card) CC;  //Down Casting of Credit_Card object
                    String CI = Integer.toString(CC.getCard_Id());  //Value from Credit_Card class is called, converted and stored in a local variable
                    String CN = CC.getClient_Name(); //Value from Credit_Card class is called and stored in a local variable
                    String BA = CC.getBank_Account(); //Value from Credit_Card class is called and stored in a local variable
                    String IB = CC.getIssuer_Bank(); //Value from Credit_Card class is called and stored in a local variable
                    String BL = Double.toString(CC.getBalance_Amount());  //Value from Credit_Card class is called, converted and stored in a local variable
                    String GP = Integer.toString(CO.getgrace_period());  //Value from Credit_Card class is called, converted and stored in a local variable
                    String ED = CO.getexpiration_date(); //Value from Credit_Card  class is called and stored in a local variable
                    String IR = Double.toString(CO.getintrest_rate());  //Value from Credit_Card class is called, converted and stored in a local variable
                    String DV = "Card Id is: "+CI+"\n"+ "Client Name is: "+CN+"\n"+"Bank Account is: "+BA+"\n"+"Issuer Bank is: "+IB+"\n"+"Balance Amount is: "+BL+"\n"+"Intrest Rate is: "+IR+"%"+"\n"+"Grace Period is: "+GP+" Months"+"\n"+"Card Expiration Date is: "+ED;
                    JOptionPane.showMessageDialog(DCpanel,DV); //Suitable message is displayed on dailoge box 
                    CO.display(); //display method from Credit_Card Class is called
                 }
                              
             }
        }  
        else if (e.getSource() == Clear_d)
         { 
           JOptionPane.showMessageDialog(DCpanel,"Debit Card cleared Sucessfully"); //Suitable message is displayed on dailoge box 
           field_CardId_d.setText(""); //JText Field  value of Card Id of Debit Card is set to Empty
           field_BalanceAmount_d.setText(""); //JText Field value of Balance Amount of Debit Card is set to Empty
           field_BankAccount_d.setText(""); //JText Field  value of Bank Account of Debit Card is set to Empty
           field_IssuerBank_d.setText(""); //JText Field  value of Issuer Bank of Debit Card is set to Empty
           field_ClientName_d.setText(""); //JText Field  value of Client Name of Debit Card is set to Empty
           field_PinNumber_d.setText(""); //JText Field  value of Pin Number of Debit Card is set to Empty
           field_WithdrawlAmount_d.setText(""); //JText Field  value of Withdrawl Amount of Debit Card is set to Empty
         }
        else if (e.getSource() == Clear_c)
         { 
           JOptionPane.showMessageDialog(CCpanel,"Credit Card cleared Sucessfully"); //Suitable message is displayed on dailoge box 
           field_CardId_c.setText(""); //JText Field  value of Card Id of Credit Card is set to Empty
           field_BalanceAmount_c.setText(""); //JText Field value of Balance Amount of Credit Card is set to Empty
           field_BankAccount_c.setText(""); //JText Field  value of Bank Account of Credit Card is set to Empty
           field_IssuerBank_c.setText(""); //JText Field  value of Issuer Bank of Credit Card is set to Empty
           field_ClientName_c.setText(""); //JText Field  value of Client Name of Credit Card is set to Empty
           field_CVCNumber_c.setText(""); //JText Field  value of CVC Number of Credit Card is set to Empty
           field_IntrestRate_c.setText(""); //JText Field  value of Interest Rate of Credit Card is set to Empty
           field_CreditLimit_c.setText(""); //JText Field  value of Credit Limit of Credit Card is set to Empty
           field_GracePeriod_c.setText("");  //JText Field  value of Grace Period is set to Empty
         }
        else if (e.getSource() ==GoBack_d)
          {   
            BFrame.setVisible(true); //JFrame of BANK GUI is set to visible
            DCFrame.setVisible(false);  //JFrame of Debit Card is set to invisible
          }
        else if (e.getSource() ==GoBack_c)
          { BFrame.setVisible(true); // JFrame of BANK GUI is set to visible
            CCFrame.setVisible(false); // JFrame of Credit Card is set to invisible
          }
  }
   
  public static void main(String [] args)
   {
       BANK_GUI Start_GUI = new BANK_GUI();
   }
}


        


