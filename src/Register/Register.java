package Register;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Register extends JDialog {
    int ID;

     JLabel Name;
     JTextField nameField;

     JLabel Password;
     JPasswordField passwordField;

     JLabel Email;
     JTextField emailField;

     JLabel Title;
     Connection connect;

     JPanel Panels;
     JButton submitButton;


    private void createUIComponents() {
        Title = new JLabel("Registrasi");
        Email = new JLabel("Email");
        Password = new JLabel("Password");
        Name = new JLabel("Name");
        submitButton = new JButton("Submit");
    }


    public Register(JFrame parent) {
        super(parent);
        setTitle("Register Form");
        setVisible(true);
        setContentPane(Panels);
        setMinimumSize(new Dimension(450, 475));


        submitButton.addActionListener(e -> {
            String Name = nameField.getText();
            String Email = emailField.getText();
            String Password1 = new String(passwordField.getPassword());

            try {
                connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "root");
//            System.out.println(connect);
                String query = "INSERT INTO regis(ID, Name, Email, Password)" +
                        "VALUES(?, ?, ?, ?)";

                PreparedStatement preparedStatement = connect.prepareStatement(query);
                preparedStatement.setInt(1, ID);
                preparedStatement.setString(2, Name);
                preparedStatement.setString(3, Email);
                preparedStatement.setString(4, Password1);


                int res = preparedStatement.executeUpdate();

                if (res != 0) {
                    JOptionPane.showMessageDialog(submitButton, "success");
                } 
            } catch (Exception ex) {
                    JOptionPane.showMessageDialog(submitButton, "failed");
                }
          });
    }



    public static void main(String[] args) {
        JFrame parent = new JFrame();
        new Register(parent);
    }

}
