/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bases;

import java.util.Date;

/**
 *
 * @author Labing
 */
public class undergrad extends student{
    private int weedHours;

    public undergrad(int weedHours, String department, Date hiringDate, String id, String name) {
        super(department, hiringDate, id, name);
        this.weedHours = weedHours;
    }

    public int getWeedHours() {
        return weedHours;
    }

    public void setWeedHours(int weedHours) {
        this.weedHours = weedHours;
    }
    
      @Override
    public float paySalary() {
        if(this.weedHours==6){
        return (685000/3);
        }else if(this.weedHours==12){
            return (685000/3);
            
            
        }else{
            return 0;
            
        }
        }
    }
   
    

