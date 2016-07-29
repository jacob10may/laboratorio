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
public class Profesor extends Employee{
    protected String school;
    protected String department;

    public Profesor(String school, String department, Date hiringDate, String id, String name) {
        super(hiringDate, id, name);
        this.school = school;
        this.department = department;
    }

    @Override
    public float paySalary() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
    
    
}
