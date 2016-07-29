/*
 *clase que describe el funcionamiento de los empleados
 */
package bases;

import java.util.Date;


public abstract class Employee extends Person {

    
    protected Date hiringDate;

    public Employee(Date hiringDate, String id, String name) {
        super(id, name);
        this.hiringDate = hiringDate;
    }

    public Date getHiringDate() {
        return hiringDate;
    }

    public void setHiringDate(Date hiringDate) {
        this.hiringDate = hiringDate;
    }
    
    public abstract float paySalary();
    
    
}
