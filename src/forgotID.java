import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class forgotID {
    JFrame forgot_id;

    JTextField phoneNumber, name;

    public void createFindIDframe(){
        forgot_id = new JFrame();
        forgot_id.setSize(300, 300);
        forgot_id.setLocation(400, 400);
        forgot_id.setTitle("Kakaotalk forgot ID");
        forgot_id.setLayout(null);

        phoneNumber = new JTextField();
        phoneNumber.setSize(130, 30);
        phoneNumber.setLocation(150, 450);
        forgot_id.add(phoneNumber);

        name = new JTextField();
        name.setSize(130, 30);
        name.setLocation(150,420);
        forgot_id.add(name);
    }
    // public void actionPerformed(ActionEvent e) {
        /*if (e.getActionCommand() == "Sign Up") {
            String input_id = new String(new_id.getText());
            String input_password = new String(new_password.getText());
            String input_name = new String(new_name.getText());
            String phonenumber = new String(new_nickname.getText());

            if(user1.insertAUser(input_id, input_password, input_name, phonenumber))
                JOptionPane.showMessageDialog(null, "Sign Up Success");
            else
                JOptionPane.showMessageDialog(null, "already exist!");
            sign_jf.dispose(); // 회원가입 성공 후 회원가입 창 끄기

        }
        else if (e.getActionCommand() == "Cancel") {
            sign_jf.setVisible(false);
        }
    }*/
}
