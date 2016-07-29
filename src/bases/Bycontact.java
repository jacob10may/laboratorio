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
public class Bycontact extends Employee {
    private int month;
    private float value;

    @Override
    public float paySalary() {
        return this.value/this.month;
    }

    public Bycontact(int month, float value, Date hiringDate, String id, String name) {
        super(hiringDate, id, name);
        this.month = month;
        this.value = value;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
    
}
