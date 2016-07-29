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
public class Grad extends student{
    private int courses;

    public Grad(int courses, String department, Date hiringDate, String id, String name) {
        super(department, hiringDate, id, name);
        this.courses = courses;
    }

    public int getCourses() {
        return courses;
    }

    public void setCourses(int courses) {
        this.courses = courses;
    }
    
     public float paySalary() {
        if(this.courses==1){
            return 2500000;
            
        }else if(this.courses==2){
            
            return 3500000;
            
        }else{
            return 0;
        }
       
        }
    
}
