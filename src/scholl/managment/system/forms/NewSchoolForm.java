package scholl.managment.system.forms;

import scholl.managment.system.School;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewSchoolForm {
    JFrame newSchoolForm = new JFrame("Create new school");
    JLabel schoolNameLbl = new JLabel("School name: ");
    JTextField schoolNameTxt = new JTextField("Demo School");
    JLabel schoolPasswordLbl = new JLabel("School password: ");
    JPasswordField schoolPasswordTxt = new JPasswordField();

    JButton createNewSchoolBtn   = new JButton("Create and login");



    public NewSchoolForm(){

        newSchoolForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        schoolNameLbl.setBounds(70,100,150,40);
        schoolPasswordLbl.setBounds(70,150,150,40);

        schoolNameTxt.setBounds(180,107,150,30);
        schoolPasswordTxt.setBounds(180,157,150,30);

        createNewSchoolBtn.setBounds(70,190,260,30);

        createNewSchoolBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createLogin();
            }
        });


        newSchoolForm.add(schoolNameLbl);
        newSchoolForm.add(schoolPasswordLbl);
        newSchoolForm.add(schoolNameTxt);
        newSchoolForm.add(schoolPasswordTxt);
        newSchoolForm.add(createNewSchoolBtn);

        newSchoolForm.setSize(400,400);
        newSchoolForm.setLayout(null);
        newSchoolForm.setVisible(true);
    }

    public void createLogin(){
        if (schoolNameTxt.getText().equals("")){
            JOptionPane.showMessageDialog(newSchoolForm,"School name can not be empty!","Wrong",JOptionPane.WARNING_MESSAGE);
            schoolNameTxt.grabFocus();
            return;
        }

        if (schoolPasswordTxt.getPassword().length < 6){
            JOptionPane.showMessageDialog(newSchoolForm,"School password can not be less than 6 characters!","Wrong",JOptionPane.WARNING_MESSAGE);
            schoolPasswordTxt.grabFocus();
            return;
        }

        School school = School.getInstance(schoolNameTxt.getText(), String.valueOf(schoolPasswordTxt.getPassword()));

        System.out.println(school.getName());

    }
}
