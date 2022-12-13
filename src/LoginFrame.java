import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

class LoginFrame implements ActionListener {
    JTextField id, password;
    UserTable user1;
    //ArticleTable article1;
    int userNumID;
    public LoginFrame(UserTable user1) {
        this.user1 = user1;
    }
    public void createLoginFrame() {
        JFrame jf = new JFrame();
        jf.setSize(400, 600);
        jf.setLocation(50, 50);
        jf.setTitle("AIKAO");
        jf.setLayout(null);
        jf.getContentPane().setBackground(Color.WHITE);

        String[] label_name = {"ID", "password"};


        ImageIcon logo = new ImageIcon("./image/kakao_logo.jpg");
        Image relogo = logo.getImage();
        Image updatelogo = relogo.getScaledInstance(320,300,Image.SCALE_SMOOTH);
        ImageIcon resizelogo = new ImageIcon(updatelogo);
        JLabel logolabel = new JLabel(resizelogo);
        logolabel.setSize(320,300);
        logolabel.setLocation(40,50);

        jf.add(logolabel);

        JLabel jl = new JLabel(label_name[0]);
        jl.setSize(80, 30);
        jl.setLocation(70, 420);
        jl.setHorizontalAlignment(JLabel.LEFT);

        jf.add(jl);

        jl = new JLabel(label_name[1]);
        jl.setSize(80, 30);
        jl.setLocation(70, 450);
        jl.setHorizontalAlignment(JLabel.LEFT);

        jf.add(jl);

        id = new JTextField();
        id.setSize(130, 30);
        id.setLocation(150, 420);

        jf.add(id);

        JButton forgot_ID = new JButton("forgotID");
        forgot_ID.setSize(95,25);
        forgot_ID.addActionListener(this);
        forgot_ID.setLocation(285,420);

        jf.add(forgot_ID);

        password = new JTextField();
        password.setSize(130, 30);
        password.setLocation(150, 450);
        jf.add(password);

        JButton forgot_PW = new JButton("forgotPW");
        forgot_PW.setSize(95,25);
        forgot_PW.addActionListener(this);
        forgot_PW.setLocation(285,450);

        jf.add(forgot_PW);

        String btn_name = "Login";
        JButton jb = new JButton(btn_name);
        jb.setSize(100, 25);
        jb.addActionListener(this);
        jb.setLocation(150, 500);

        jf.add(jb);

        String btn_sign = "Sign Up";
        jb = new JButton(btn_sign);
        jb.setSize(100, 25);
        jb.addActionListener(this);
        jb.setLocation(150, 525);

        jf.add(jb);

        jf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == "Login") {
            String input_id = id.getText();
            String input_password = password.getText();

            try {
                userNumID = user1.loginReturnNum(input_id, input_password);
                if(userNumID == 0) {
                    JOptionPane.showMessageDialog(null, "Invalid input!!");
                }
                else { //로그인 성공!
                    JOptionPane.showMessageDialog(null, "Welcome!!");
                    //MainPage mainPage = new MainPage(user1, article1, image1, userNumID);
                    //mainPage.createMainPage();
                   // jf.dispose();
                    //여기에 병규 아진이가 만든 메인 패널 등장시킨다
                }
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }

        }
        else if (e.getActionCommand() == "Sign Up") {
            SignupFrame usr = new SignupFrame(user1);
            usr.createSignupFrame();
        }

        else if(e.getActionCommand() == "forgotID"){
               forgotID f_id = new forgotID();
               f_id.createFindIDframe();
        }

        else if(e.getActionCommand() == "forgotPW"){

        }

    }
}