/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package financeapp;

/**
 *
 * @author Zack
 */
public class Account {
    private String name;

    Account(String name) {
        this.name = name;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
    //Setters
    public void setName(String name){
        this.name = name;
    }
    
    //Getters
    public String getName(){
        return name;
    }
    
}

