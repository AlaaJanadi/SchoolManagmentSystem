package scholl.managment.system;

import java.util.ArrayList;
import java.util.List;

/**
 * Many teachers, many students
 * Implements teacher and student using ArrayList.
 */
public class School {

    private static School school;
    private String name;
    private List<Teacher> teachers;
    private List<Student> students;
    private double totalMoneyEarned;
    private double totalMoneySpent;

    /**
     * private constructor that will set the name of the school.
     * private to prevent making objects out said this class.
     *
     * @param name the name of the school
     */
    private School(String name) {
        this.name = name;
        this.teachers = new ArrayList<>();
        this.students = new ArrayList<>();
        this.totalMoneyEarned = 0;
        this.totalMoneySpent = 0;
    }

    /**
     * to create an instance of the school (only one object can be created).
     *
     * @param name the name to be set to school name.
     * @return school object.
     */
    public static School getInstance(String name) {

        if (school == null) {
            school = new School(name);
        }
        return school;
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
     * to print a list of all teachers
     */

    /**
     * to get all teachers in the school staff.
     * @return a list of teachers.
     */
    public List<Teacher> getTeachers(){
        return teachers;
    }
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
     * to get the name of the school.
     * @return the name of the school.
     */
    public String getName() {
        return name;
    }

    public void printSchool(){
        System.out.println("****** || " + this.name + " || ******");
    }
}
