package scholl.managment.system;

public class App {
    public static void main(String[] args) {
        // create a school object
        School mySchool = School.getInstance("Alaa School");

        // print the school name
        mySchool.printSchool();

        // add new teachers to the school staff.
        mySchool.addTeacher(new Teacher(1,"Asen Janadi",3400));
        mySchool.addTeacher(new Teacher(2,"Ammar Janadi",3200));
        mySchool.addTeacher(new Teacher(3,"Basel Janadi",3900));

        // show all teachers
        mySchool.printAllTeachers();

        // update Ammar salary
        mySchool.updateTeacherSalary(2,4300);

        // print new Ammar data
        mySchool.printTeacher(2);

        // add and delete test Teacher
        mySchool.addTeacher(new Teacher(4,"Test Teacher",5000));
        mySchool.printAllTeachers();
        mySchool.deleteTeacher(4);
        mySchool.printAllTeachers();

    }
}
