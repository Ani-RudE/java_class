// package JavaClass.Week15-(1);
import java.awt.*;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

class RadioButtonExample {
     JFrame F; //Data type JFrame
     
     RadioButtonExample()
     {
          F=new JFrame("RadioButton Demo"); //F is object name
          JRadioButton r1=new JRadioButton("A) Male");
          JRadioButton r2=new JRadioButton("A) Female");
          r1.setBounds(50, 50, 140, 30);
          r1.setBounds(50, 50, 140, 30);
          ButtonGroup bg=new ButtonGroup();
          bg.add(r1);
          bg.add(r2);
          F.add(r1);
          F.add(r2);
          F.setLayout(null);
          F.setSize(600, 600);
          F.setVisible(true);
     }

     public static void main(String[] args)
     {
          new RadioButtonExample();
     }
}
