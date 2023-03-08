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
    private JLabel UserstoryCounter;
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
                String sItem = (String) comboBox1.getSelectedItem();
                System.out.println(comboBox1.getSelectedItem());

                if(sItem.equals("-")){
                    //Keine Auswahl getroffen. Der User muss was auswählen
                    JOptionPane.showMessageDialog(null, "Keine gültige Bewertung auswählt", "InfoBox: ", JOptionPane.INFORMATION_MESSAGE);

                }else{
                    comboBox1.setSelectedIndex(0);
                    //TODO: Update Label
                    //TODO: Speichern
                    _fSetNextStory();
                }
            }
        });

        _init();
    }

    private void _init(){
        // Laden der Userstories
        lsUserStories = this._getUserStories();

        //generate GUI
        String[] sWertungswerte = new String[]{"-", "0", "1", "2", "3", "5", "8", "13", "20", "40","100", "∞", "?"};
        for(int i = 0; i < sWertungswerte.length; i++){
            comboBox1.addItem(sWertungswerte[i]);
            comboBox1.setSelectedIndex(0);
            System.out.println(String.valueOf(i)+ "   "+ sWertungswerte[i]);
        }

        UserstoryCounter.setText("1/" + this.lsUserStories.size());

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

        // Get bewertung

        // Set Bewertung

        if(this.nUserStoryIndex == this.lsUserStories.size()){
            //Next Tab
            System.out.println("Wechsel zum nächster Tab");
            JOptionPane.showMessageDialog(null, "Bewertung beendet", "Info", JOptionPane.INFORMATION_MESSAGE);
            tabbedPane1.setSelectedIndex(1);
        }else{
            String Text = lsUserStories.get(this.nUserStoryIndex).getsStory();
            textArea1.setText(Text);
            String sCounter = this.nUserStoryIndex + 1 + "/" + this.lsUserStories.size();
            UserstoryCounter.setText(sCounter);
            this.nUserStoryIndex = this.nUserStoryIndex + 1;
        }
    }
}
