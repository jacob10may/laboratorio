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
public class Fulltime extends Profesor{
    private float salary;

    public Fulltime(float salary, String school, String department, Date hiringDate, String id, String name) {
        super(school, department, hiringDate, id, name);
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
     public float paySalary() {
        
        return this.salary;
        
        
}
}