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
public class Administrative extends Employee{
    private String category;
    private float salary;

    

    public Administrative(String category, float salary, Date hiringDate, String id, String name) {
        super(hiringDate, id, name);
        this.category = category;
        this.salary = salary;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    @Override
     public float paySalary() {
        return this.salary;
        
}
}