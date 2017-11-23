
import bank.Bank;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PRAC
 */
public class TestBank extends Bank
{
    static int max=0;
static float total=0;
    
    public static void addAccount(int acc,float Bal,ArrayList cust)
    {
        Bank customer1=new Bank(acc,Bal);
        cust.add(customer1);
        
    }
    public static float totalBalance(ArrayList cust)
    {
        Bank customer[]=new Bank[5];
        float totalBalance = 0;
        for(int i=0;i<cust.size();i++)
        {
            customer[i]=(Bank)cust.get(i);
         totalBalance+=customer[i].getBalance();   
        }
        return totalBalance;
        
    }
    public Bank findAccount(ArrayList cust,int acc)
    {
        Bank customer[]=new Bank[5];
        for(int i=0;i<cust.size();i++)
        {
            customer[i]=(Bank)cust.get(i);
               if(customer[i].getAccountNumber()==acc) {
                   return customer[i];
               }
            } 
        return null;
                
    }
    public static int Max(ArrayList cust)
    {
        int Max=0;
        Bank customer[]=new Bank[cust.size()];
        for(int i=0;i<cust.size();i++)
        {
             customer[i]=(Bank)cust.get(i);
             if (Max<customer[i].getBalance())
             {
                 Max=customer[i].getAccountNumber();
             }
        }
          return Max;
    }
    
    public int Min(ArrayList cust)
    {
        int Min=0;
        Bank customer[]=new Bank[cust.size()];
        for(int i=0;i<cust.size();i++)
        {
             customer[i]=(Bank)cust.get(i);
             if (Min<customer[i].getBalance())
             {
                 Min=customer[i].getAccountNumber();
             }
        }
          return Min;
    }
    
    public Bank minBal(ArrayList cust, int min)
    {
        Bank customer[]=new Bank[cust.size()];
        for(int i=0;i<cust.size();i++)
        {
             customer[i]=(Bank)cust.get(i);
             if(customer[i].getBalance()>min)
             {
                 return customer[i];
             }
    }
        return null;
    }
    /**
     *
     * @param args
     */
    public static void main(String[] args) 
    {
        ArrayList<Bank> customer= new <Bank> ArrayList();
        addAccount(100,15000,customer);
        addAccount(200,16000,customer);
        addAccount(500,1700,customer);
        max = Max(customer);
        total=totalBalance(customer);
        
               System.out.println("Maximum BankBalance is");
               System.out.println(max);
               System.out.println("Maximum");
               System.out.println(total);
    }
    
}
