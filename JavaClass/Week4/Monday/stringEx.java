package 
public class stringEx {
     public static void main(String args[])
     {
          String str="Java Programming";
          System.out.println("Length = "+str.length());
          System.out.println();

          int a=14;
          String str2="one";
          System.out.println(a+" "+str2+" two");
          System.out.println();

          System.out.println("Hello".charAt(1));
          System.out.println();

          String s1="Hello";
          String s2="Hello";
          String s3="java";
          String s4="HELLO";
          System.out.println(s1.equals(s2));
          System.out.println(s1.equals(s3));
          System.out.println(s1.equals(s4));
          System.out.println(s1.equalsIgnoreCase(s4));
          System.out.println();

          System.out.println("Java Programming".startsWith("Java"));
          System.out.println("Java Programming".startsWith("JAVA"));
          System.out.println("Java Programming".endsWith("ing"));
          System.out.println("Java Programming".endsWith("inG"));
          System.out.println();

          s1="ABC";
          s2="BCD";
          s3="abc";
          System.out.println(s1.compareTo(s2));
          System.out.println(s1.compareTo(s3));
          System.out.println(s1.compareToIgnoreCase(s3));
          System.out.println();

          s1="abcxjk";
          s2="Object oriented";
          System.out.println(s1.indexOf('j'));   
          System.out.println(s2.lastIndexOf('e'));       
          System.out.println();

          s1="Attack postponed";
          System.out.println(s1.substring(4,7));
          System.out.println();

          s1="abc";
          s2="xyz";
          System.out.println(s1.concat(s2));
          System.out.println();

          s1="Hello";
          System.out.println(s1.replace('l', 'x'));
          System.out.println("Hello".replace('l','w'));
     }
}


// length
// +
// charAt
// equals() and equalsIgnoreCase()
// startsWith() and endsWith()
// compareTo() and compareToIgnoreCase)_
// indexOf and lastIndexOf()
// substring()
// concat()
// replace