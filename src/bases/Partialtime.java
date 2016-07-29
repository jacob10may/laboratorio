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
public class Partialtime extends Profesor{
    private String category;
    private int classhours;

    public Partialtime(String category, int classhours, String school, String department, Date hiringDate, String id, String name) {
        super(school, department, hiringDate, id, name);
        this.category = category;
        this.classhours = classhours;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getClasshours() {
        return classhours;
    }

    public void setClasshours(int classhours) {
        this.classhours = classhours;
    }
    
     public float paySalary() {
        if(this.category.equals("A")){
            return 60000*this.classhours;
            
        }else if (this.category.equals("B")){
            return 800000*this.classhours;
        }else if (this.category.equals("C")){
            return 800000*this.classhours;
        }else {
            return 0;
        }
        }
}
