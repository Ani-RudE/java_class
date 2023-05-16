//JMenu
import javax.swing.*;
// import javax.swing.JFrame;
// import javax.swing.JMenuBar;
// import javax.swing.JMenuItem;

class JMenuExample
{
     JMenuExample()
     {
          JMenu menu, submenu;     
          JMenuItem i1, i2, i3, i4, i5;
          JFrame F=new JFrame("JMenu Demo");
         JMenuBar mb=new JMenuBar();
          menu=new JMenu("menu");
          submenu=new JMenu("submenu");
          i1=new JMenuItem("Item1");
          i2=new JMenuItem("Item2");
          i3=new JMenuItem("Item3");
          i4=new JMenuItem("Item4");
          i5=new JMenuItem("Item5");

          menu.add(i1);
          menu.add(i2);
          menu.add(i3);
          menu.add(i4);
          menu.add(i5);
          menu.add(submenu);
          mb.add(menu);
          //F.add(mb);
     F.setMenuBar(mb);
          F.setMenuBar(mb);
          F.setLayout(null);
          F.setSize(500, 500);
          F.setVisible(true);
     }
}