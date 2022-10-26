package scholl.managment.system;

/**
 *
 * This Class track students fess, name , grade , id & fees paid
 *
 */
public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * To Create a new Student by initializing.
     * Fees for every student is $30,000.
     * Fees Paid initially 0.
     * @param id    id for the student: unique.
     * @param name  name for the student.
     * @param grade grade of the student.
     */
    public Student(int id, String name, int grade) {
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    /**
     * Used ti update the student's grade.
     * 
     * @param grade new grade of the student.
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * Add the fees to the fees paid;
     * 
     * @param fees fees that will be added to fees paid.
     */
    public void updateFeesPaid(int fees) {
        this.feesPaid += fees;
    }

    /**
     * to get the id of the student.
     * 
     * @return the id of the student.
     */
    public int getId() {
        return id;
    }

    /**
     * to get the name of the student.
     * @return the name of the student.
     */
    public String getName() {
        return name;
    }

    /**
     * to get the grade of the student.
     * @return the grade of the student.
     */
    public int getGrade() {
        return grade;
    }

    /**
     * to get the fees that the student has paid.
     * 
     * @return the fees that the student has paid.
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     * to get the total fees.
     * 
     * @return the total fess.
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    @Override
    public String toString() {
        return this.id + " - name: " + this.name + " - grade: " + this.grade;
    }
}
