import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    static int userCount = 0;
    static Form users[] = new Form[100];
    public static void main(String[] args)
    {


        JFrame gg = new JFrame("Login");
        gg.setSize(500,400);
        gg.setResizable(false);
        gg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel left = new JPanel();
        left.setLayout(null);


        JLabel lable = new JLabel("Enter Student OOP Marks");
        lable.setBounds(200,10,200,20);
        JLabel username_lable = new JLabel("User Name");
        username_lable.setBounds(20,70,200,20);
        JTextField username_text = new JTextField();
        username_text.setBounds(250,70,200,20);

        JLabel student_name_lable = new JLabel("Student Name");
        student_name_lable.setBounds(20,110,200,20);
        JTextField student_name_text = new JTextField();
        student_name_text.setBounds(250,110,200,20);

        JLabel ca_lable = new JLabel("CA");
        ca_lable.setBounds(20,150,200,20);
        JTextField ca_text = new JTextField();
        ca_text.setBounds(250,150,200,20);

        JLabel practical_lable = new JLabel("Practical");
        practical_lable.setBounds(20,190,200,20);
        JTextField practical_text = new JTextField();
        practical_text.setBounds(250,190,200,20);

        JLabel theory_lable = new JLabel("Theory");
        theory_lable.setBounds(20,230,200,20);
        JTextField theory_text = new JTextField();
        theory_text.setBounds(250,230,200,20);

        JButton view = new JButton("View All Marks");
        JButton save  = new JButton("Save");
        view.setBounds(100,300,200,30);
        save.setBounds(300,300,100,30);




        left.add(username_text);
        left.add(username_lable);
        left.add(student_name_lable);
        left.add(student_name_text);
        left.add(ca_lable);
        left.add(ca_text);
        left.add(practical_lable);
        left.add(practical_text);
        left.add(theory_lable);
        left.add(theory_text);
        left.add(lable) ;
        left.add(view);
        left.add(save);

        gg.add(left);

        gg.setVisible(true);


        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                users[userCount] = new Form(username_text.getText(),student_name_text.getText(),ca_text.getText(),practical_text.getText(),theory_text.getText());
                userCount++;
                username_text.setText("");
                student_name_text.setText("");
                ca_text.setText("");
                practical_text.setText("");
                theory_text.setText("");
            }
        });
        view.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame preview = new JFrame("preview");
                preview.setSize(450,400);
                preview.setResizable(false);
                preview.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

                JLabel lable = new JLabel("view student's OOP marks",SwingConstants.CENTER);
                lable.setOpaque(true);
                lable.setBackground(new Color(122,252,222));
                preview.setLayout(null);

                lable.setBounds(0,0,450,50);

                JTextArea showingField = new JTextArea(10,30);
                showingField.setEditable(false);
                showingField.setBounds(0,50,450,350);
                showingField.setText("user name\tstudent name\tca\tpractical\ttheory\t");
                for( int i = 0 ; i<userCount;i++){
                    showingField.append("jskd"+users[i].toString());

                }



                preview.add(showingField);
                preview.add(lable);
                preview.setVisible(true);
            }
        });
    }
}