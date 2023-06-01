/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */
public class Debt {
    private double balance = 0;
    private double interestRate = 0;
    
    public Debt(double initialBalance, double initialInterestRate) {
        this.balance = initialBalance;
        this.interestRate = initialInterestRate;
    }
    
    public void printBalance() {
        System.out.println(this.balance);
    }
    
    public void waitOneYear() {
        this.balance = this.balance * this.interestRate;
    }
}
