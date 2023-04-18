//HashSet Class
import java.util.*;

public class hashSetApp {
     public static void main(String[] args)
     {
          //HashSet is a built-in method
          HashSet<String> cars=new HashSet<String>(); //"cars" is the object name
          //HashSet<String>() will call the null argument constructor

          cars.add("BMW"); //HashSet -> | "BMW" |
          cars.add("FORD"); //HashSet -> | "BMW" | "FORD" |
          cars.add("VOLVO"); //HashSet -> | "BMW" | "FORD" | "VOLVO" |
          cars.add("KIA"); //HashSet -> | "BMW" | "FORD" | "VOLVO" | "KIA" |
          cars.add("BMW"); //HashSet -> | "BMW" | "FORD" | "VOLVO" | "KIA" |
          //Rejects "BMW" as it is a repeated value
          cars.add("MARUTI 800"); //HashSet -> | "BMW" | "FORD" | "VOLVO" | "KIA" | "MARUTI 800" |
          cars.add("KIA"); //HashSet -> | "BMW" | "FORD" | "VOLVO" | "KIA" | "MARUTI 800" |
          //Rejects "KIA" as it is a repeated value
          System.out.println("Contents of the object cars: "+cars); //Prints in the reverse alphabetical order
     }
}

//Duplicate elements can not be stored in HashSet
//Even if we add a duplicate element, it will only store one value
//Therfore, duplicate elements are not allowed in HashSet, so, only one copy will be sotred in the HashSet