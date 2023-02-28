// import java.util.*;
// import java.io.*;
// import java.awt.event.*;

// //Same class
// class accessSpecifier { 
//      private int a;
//      int b;
//      public int c;
//      protected int d;

//      private void read()
//      {

//      }
//      public void show()
//      {
//           System.out.println(a);
//      }
//      void display()
//      {
//           // Can access a, b, c and d
//      }
// }

// //Same package sub class
// class ABC_accessSpecifier extends accessSpecifier
// {
//      int x;
//      int y;
//      int z;

//      void show()
//      {
//           //Does not have access to private members fo base class, ie, "a"
//           // Can modify the value of protected, ie, "b"
//           b=100;
//           // Can modify "d" and "c" as well
//      }
// }

// //Same package non sub class
// class XYZ_accessSpecifier
// {
//      int x, y, z;

//      void show()
//      {
//           // Can't modify a
//           // Can access b, c and d
//      }
// }

// // https://docs.google.com/document/d/133qz5WTsjd66ODYaFABROKH969400f44qRxmIKUQCsg/edit