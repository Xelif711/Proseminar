import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.*;

public class PressButtons{
    void doSomethingRight(){
        JOptionPane.showMessageDialog(null, "Du hast auf den rechten Button geklickt!");
        //do something
    }
    void doSomethingLeft(){
        JOptionPane.showMessageDialog(null, "Du hast auf den linken Button geklickt!");
        //do something else
    }
    public static void main(String[] args){
        PressButtons myApp = new PressButtons();
        PressButtons.GUI myGUI = myApp.new GUI();
        myGUI.setVisible(true);
        myGUI.setSize(300, 100);
        myGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private class GUI extends JFrame{
        private JButton left;
        private JButton right;
        public GUI(){
            super("Buttons klicken!");
            setLayout(new FlowLayout());
            left = new JButton("left");
            right = new JButton("right");
            add(left);
            add(right);
            MyEventHandler handler = new MyEventHandler();
            left.addActionListener(handler);
            right.addActionListener(handler);
        }
        private class MyEventHandler implements ActionListener{
            public void actionPerformed(ActionEvent event){
                if(event.getSource() == left){
                    doSomethingLeft();
                }else if(event.getSource() == right){
                    doSomethingRight();
                }
}}}}
