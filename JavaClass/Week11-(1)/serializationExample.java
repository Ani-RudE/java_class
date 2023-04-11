//Serialization
package JavaClass.Week11;

import java.io.*;

class Student implements Serializable
{
     String name;
     String className;
     String rollno;
     
     Student (String name, String className, String rollno)
     {
          this.name=name;
          this.className=className;
          this.rollno=rollno;
     }
}

class Test
{
     public void objectSerialization(Student stu)
     {
          try
          {
               FileOutputStream fos=new FileOutputStream("E:\\student1.ser"); //If not working, try "student1.txt"
               ObjectOutputStream oos=new ObjectOutputStream(fos);

               oos.writeObject(stu);
               oos.close();
               fos.close();
               System.out.println("Serialized data written to E:\\student1.ser");
          }
          catch (IOException e)
          {
               System.out.println(e);
          }
     }
}

class serializationExample
{
     public static void main(String[] args)
     {
          Student stu=new Student("Anil", "BTech", "AP211100");
          Test obj=new Test();
          obj.objectSerialization(stu);
     }
}