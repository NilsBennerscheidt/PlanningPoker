import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class gui {
    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JTextArea textArea1;
    private JButton button1;
    private JComboBox comboBox1;
    private JFrame frame;
    private ArrayList<UserStory>  lsUserStories;
    private int nUserStoryIndex = 0;

    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try{

                    gui window = new gui();
                    window.frame.setVisible(true);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
    }

    public gui(){
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        frame.setContentPane(panel1);

        System.out.println("Hello");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Test");
                _fSetNextStory();
            }
        });

        _init();
    }

    private void _init(){
        // Laden der Userstories
        lsUserStories = this._getUserStories();
        //generate GUI

        //Startet das Program
        this._run();
    }

    private void _run(){
        // Hier wird der Loop gesteuert
        _fSetNextStory();
    }

    private ArrayList<UserStory> _getUserStories(){

        System.out.println("_getUserStories() erzeugung der Userstories");
        ArrayList<UserStory>  temp = new ArrayList<UserStory>();
        temp.add(new UserStory("Test 123"));
        temp.add(new UserStory("Test 456"));
        temp.add(new UserStory("Test 789"));

        return temp;
    }

    private void _fSetNextStory(){
        System.out.println("_fSetNextStory() setzen einer UserStory");


        if(this.nUserStoryIndex == this.lsUserStories.size()){
            //Next Tab
            System.out.println("Nächster Tab");
        }else{
            String Text = lsUserStories.get(this.nUserStoryIndex).getsStory();
            textArea1.setText(Text);
            this.nUserStoryIndex = this.nUserStoryIndex + 1;
        }
    }
}
