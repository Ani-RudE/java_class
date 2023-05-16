//JComboBox
import javax.swing.*;

class ComboBoxExample
{
     JFrame F;
     
     ComboBoxExample()
     {
          F=new JFrame("Combo Box Demo");
          String country[]={"India", "Canada", "UK", "USA"};

          JComboBox cb=new JComboBox<>(country);
          cb.setBounds(50, 100, 130, 30);
          F.add(cb);
          F.setLayout(null);
          F.setSize(600, 600);
          F.setVisible(true);
     }

     public static void main(String[] args)
     {
          new ComboBoxExample();
     }
}