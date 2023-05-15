//JCheckBox
import java.awt.Button;
import javax.swing.*;
import java.awt.*;

class checkBoxExample{
     JFrame F;
     F=new JFrame("Check Box Demo");

     checkBoxExample()
     {
          JCheckBox checkbox1=new JCheckBox("C++");
          JCheckBox checkbox2=new JCheckBox("Java");
          checkbox1 setBounds(50, 50, 130, 30);
          checkbox2 setBounds(50, 100, 130, 30);
          F.add(checkbox1);
          F.add(checkbox2);
          F.setLayout(null);
          F.setSize(300, 300);
          F.setVisible(true);
     }

     public static void main(String[] args)
     {
          new checkBoxExample();
     }
}