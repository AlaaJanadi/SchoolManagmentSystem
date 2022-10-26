package scholl.managment.system;

import java.util.ArrayList;
import java.util.List;
import java.util.prefs.*;

/**
 * Many teachers, many students
 * Implements teacher and student using ArrayList.
 */
public class School {

    private static School school;
    private String name;

    private String password;
    private List<Teacher> teachers;
    private List<Student> students;
    private double totalMoneyEarned;
    private double totalMoneySpent;

    /**
     * private constructor that will set the name of the school.
     * private to prevent making objects out said this class.
     * @param name the name of the school.
     * @param password the password.
     */
    private School(String name, String password) {
        this.name = name;
        this.password = password;
        this.teachers = new ArrayList<>();
        this.students = new ArrayList<>();
        this.totalMoneyEarned = 0;
        this.totalMoneySpent = 0;
    }

    /**
     * to create an instance of the school (only one object can be created).
     *
     * @param name the name to be set to school name.
     * @param password the password to be set to school.
     * @return school object.
     */
    public static School getInstance(String name ,String password) {

        if (school == null) {
            school = new School(name,password);
        }
        return school;
    }
    /**
     * to get the name of the school.
     * @return the name of the school.
     */
    public String getName() {
        return name;
    }

    /**
     * prints the school name.
     */
    public void printSchool(){
        System.out.println("****** || " + this.name + " || ******");
    }

    /**
     * set the password.
     * @param password the password for the school.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * to add new teacher to school staff.
     *
     * @param teacher teacher object to be added.
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     * to get a teacher with specific id.
     *
     * @param id the id of the teacher.
     * @return a teacher object.
     */
    public Teacher getTeacher(int id) {
        for (Teacher teacher : teachers){
            if (teacher.getId() == id){
                return teacher;
            }
        }
        return null;
    }

    /**
     * to delete a teacher from the school staff.
     *
     * @param id the id of the teacher.
     */
    public void deleteTeacher(int id) {
        Teacher teacher = getTeacher(id);
        teachers.remove(teacher);
    }

    /**
     * to update a salary of a teacher with given id.
     * @param id the id of the teacher.
     * @param newSalary the new salary of the teacher.
     */
    public void updateTeacherSalary(int id, double newSalary){
        Teacher teacher = getTeacher(id);
        teacher.setSalary(newSalary);
    }

    /**
     * to get all teachers in the school staff.
     * @return a list of teachers.
     */
    public List<Teacher> getTeachers(){
        return teachers;
    }
    /**
     * to print a list of all teachers
     */
    public void printAllTeachers(){
        System.out.println("****** the teachers list ******");
        for(Teacher teacher : teachers){
            System.out.println(teacher);
        }
        System.out.println("****** end of the teachers list ******");

    }

    /**
     * to print a teacher information.
     * @param id the id of the teacher.
     */
    public void printTeacher(int id){
        Teacher teacher = getTeacher(id);
        System.out.println(teacher);
    }

    /**
     * adds a student.
     * @param student student object to be added.
     */
    public void addStudent(Student student){
        students.add(student);
    }

    /**
     * gets a student with specifics id.
     * @param id the id of the student.
     * @return student object.
     */
    public Student getStudent(int id){
        for (Student student : students){
            if (student.getId() == id){
                return student;
            }
        }
        return null;
    }

    /**
     * updates the student grade.
     * @param id the id of the student.
     * @param newGrade the new grade of the student.
     */
    public void updateStudentGrade(int id,int newGrade){
        Student student = getStudent(id);
        student.setGrade(newGrade);
    }

    /**
     * updates the fees that the student has paid.
     * @param id the id of the student.
     * @param fees the fees to be added.
     */
    public void updateStudentFeesPaid(int id, int fees){
        Student student = getStudent(id);
        student.updateFeesPaid(fees);
    }

    public void deleteStudent(int id){
        Student student = getStudent(id);
        students.remove(student);
    }

    /**
     * gets all students.
     * @return list of students.
     */
    public List<Student> getStudents(){
        return  students;
    }
}
