import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class GUI implements ActionListener, java.awt.event.ActionListener {

       private static JLabel userLabel;
       private static JPanel panel;
       private static JFrame frame;
       private static JTextField userText;
       private static JPasswordField passwordText;
       private static JButton button;
       private static JLabel passwordLabel;
       private static JLabel success;


    public static void main(String[] args) {
    
        panel =new JPanel();
        frame = new JFrame();
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        
        panel.setLayout(null);

        userLabel = new JLabel("User");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        userText = new JTextField();
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        button = new JButton("Login");
        button.setBounds(10, 80, 80, 25);
        button.addActionListener(new GUI());
        panel.add(button);

        success = new JLabel();
        success.setBounds(10, 110, 300, 25);
        panel.add(success);

        frame.setVisible(true);
        }
    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passwordText.getText();      //deprecated  
        System.out.println(user + ", " + password);

        if(user.equals("Steve") && password.equals("guesshowmuchilovefood123")) {
            success.setText("Login successful!");
        } else {
            success.setText("Retry");
        }
    }
    }