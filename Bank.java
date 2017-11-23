/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author PRAC
 */
public class Bank {

    int accountNumber;
    float Balance;
    public Bank(int acc,float bal)
    {
        accountNumber=acc;
        Balance=bal;
    }

    public Bank() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    float Deposit(float x)
    {
        Balance=Balance+x;
        return Balance;
    }
    float withdraw(float x)
    {
        Balance=Balance-x;
        return Balance;
    }
    public int getAccountNumber()
    {
        return accountNumber;
    }
    public float getBalance()
    {
        return Balance;
    }
    float taxdeduction()
    {
        return Balance;
    }

    
};
    
