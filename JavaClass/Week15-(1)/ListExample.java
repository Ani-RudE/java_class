// package JavaClass.Week15-(1);

import java.awt.*;
import javax.swing.*;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;

public class ListExample {
     JFrame F;

     ListExample()
     {
          F=new JFrame("JLisst Demo");
          DefaultListModel<String> l1=new DefaultListModel<String>();
          l1.addElement("One");
          l1.addElement("Two");
          l1.addElement("Three");
          l1.addElement("Four");

          JList<String> list=new JList<String>(l1);
          // list.setBounds(50, 100, 130, 30);
          list.setBounds(100, 100, 250, 500);
          F.add(list);
          F.setLayout(null);
          F.setSize(400, 400);
          F.setVisible(true);
     }

     public static void main(String[] args)
     {
          new ListExample();
     }
}
