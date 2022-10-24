package scholl.managment.system;

/**
 *
 * This Class track teacher id, name & salary;
 *
 * */
public class Teacher {

    private int id;
    private String name;
    private double salary;

    /**
     * Creates a new Teacher.
     * @param id id for the teacher.
     * @param name name of the teacher.
     * @param salary salary of the teacher.
     */
    public Teacher(int id,String name,double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /**
     * to get the teacher id.
     * @return the id of the teacher
     */
    public int getId() {
        return id;
    }

    /**
     * to get the teacher name.
     * @return the name of the teacher.
     */
    public String getName() {
        return name;
    }

    /**
     * to get the teacher salary.
     * @return the salary of the teacher.
     */
    public double getSalary() {
        return salary;
    }

    /**
     * to set a new salary for the reacher.
     * @param newSalary the new salary that the teacher will have.
     */
    public void setSalary(double newSalary){
        this.salary = newSalary;
    }

    @Override
    public String toString(){
        return this.id +" - name: " + this.name + " - salary: " + this.salary;
    }
}
