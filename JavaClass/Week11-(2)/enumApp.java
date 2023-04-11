//Enumeration

//Enumeration is a set of named constants.
enum PLtypes //Defining an Enumeration data type.
//Enumeration means named constants.
//Enumeration is represented in Java using class types.
{
     highlevel, machinelevel, assembly, middlelevel; //These are the constants that belong to this data type.
}

class enumApp
{
     public static void main(String[] args)
     {
          PLtypes lang; //This "PLtypes" is a data type defined at `Line 1` of code.
          //The data type contains several possible values that can be assigned to it.
          //Hence, the variable "lang" can store the constant values stored in "PLtypes", ie, highlevel, machinelevel, assembly, middlelevel.

          System.out.println("Here are the list of constants");
          PLtypes alltypes[]= PLtypes.values(); //Values is a method. It is a Static method.
          //Values method will return an array that contains all the enumeration constants.
          //"alltypes" is an array name.
          //alltypes[0]=highlevel            alltypes[1]=machinelevel
          //alltypes[2]=assembly             alltypes[3]=middlelevel

          for (PLtypes a:alltypes) //This is a type of "for each" loop.
          {
               System.out.println(a); //Prints the value stored in "a".
               //"a" is getting the contents from array "alltypes"
          }

          lang=PLtypes.valueOf("assembly"); //"lang" variable stores the returned value from right side of the "=" sign.
          //PLtypes is like class name, valueOf() method will compare the value of "assembly" in the enumration data type. If the value is found inside the enumration class, then it will return the value to the left hand side variable.
          System.out.println("Value is: "+lang);
     }
}