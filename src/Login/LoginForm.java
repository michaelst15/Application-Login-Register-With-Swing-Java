package Login;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class LoginForm extends JDialog {
//    private JLabel Title;
//    private JTextArea nameField;

    int ID;
    private JLabel Name;

    private JTextField nameField;

    private JLabel Password;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JPanel Panel;

    private Connection connect;


//    private JButton SignIn;


    private void createUIComponents() {
        Name = new JLabel("Name");
        Password = new JLabel("Password");
        loginButton = new JButton("Login");
    }

    public LoginForm(JFrame parent) {
        super(parent);
        setTitle("Login");
        setContentPane(Panel);
        setVisible(true);
        setMinimumSize(new Dimension(400, 400));

        loginButton.addActionListener(e -> {
            String Name = nameField.getText();
            String Password = new String(passwordField.getPassword());

            try {
                connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "root");

                String Query = "SELECT * FROM regis WHERE Name='"+ Name +"' AND Password='"+ Password +"'";
                PreparedStatement statement = connect.prepareStatement(Query);

                ResultSet rs = statement.executeQuery();


                if (rs.next()) {
                    JOptionPane.showMessageDialog(loginButton, "login success");
                } else {
                    JOptionPane.showMessageDialog(loginButton, "login failed");
                }

            } catch (SQLException ex) {

                throw new RuntimeException(ex);
            }
        });

    }

    public static void main(String[] args) {
        JFrame parent = new JFrame();
        new LoginForm(parent);
    }


}
