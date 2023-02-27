import javax.swing.*;
import java.awt.*;

public class app {
    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JButton button1;
    private JFrame frame;


    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try{

                    app window = new app();
                    window.frame.setVisible(true);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
    }
    public app() {
        frame = new JFrame();
        frame.setBounds(100, 100, 600, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        panel1 = new JPanel();
        panel1.setLayout(null);

        JButton button1 = new JButton();


    }

    public void initalize(){


    }
    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

}
