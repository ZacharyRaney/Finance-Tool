/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package financeapp;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Zack
 */
public class Transaction {
    String date;
    String type;
    String category;
    String comments;
    double ammount;
    double balance;

    Transaction(String date, String type, String category, String comments, double ammount, double balance) {
        this.date=date;
        this.type = type;
        this.category = category;
        this.comments=comments;
        this.ammount = ammount;
        this.balance = balance;
    }
    
     public String getType(){
        return type;
    }
      public Double getAmmount(){
        return ammount;
    }
       public String getDate(){
        return date;
    }
        public String getCategory(){
        return category;
    }
    
}

