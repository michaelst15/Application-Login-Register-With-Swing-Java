package Login;

import javax.swing.*;
import java.awt.*;

public class Login extends JDialog {
    private JLabel Title;
    private JTextField Name;
    private JTextField Password;
//    private JButton SignIn;

    public Login(JFrame parent) {
        super(parent);
        setTitle("Login");
//        setContentPane(SignIn);
        setVisible(true);
        setMinimumSize(new Dimension(400, 400));
    }

    public static void main(String[] args) {
        JFrame parent = new JFrame();
        new Login(parent);
    }
}
