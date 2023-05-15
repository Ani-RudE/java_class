//JCheckBox
import javax.swing.JCheckBox;
import java.awt.*;

class checkBoxExample{
     F=new JFrame("Check Box Demo");
     JCheckBox checkbox1=new JCheckBox("C++")
     JCheckBox checkbox2=new JCheckBox("Java");
     checkbox1 setBounds(50, 50, 130, 30);
     checkbox2 setBounds(50, 100, 130, 30);
     F.add(checkbox1);
     F.add(checkbox2);
     F.setLayout(null);
     F.setSize(300, 300);
     F.setVisible(true);

     public static void main(String[] args)
     {
          new checkBoxExample();
     }
}