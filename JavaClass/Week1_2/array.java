package JavaClass.Week1_2;

class array {
   public static void main(String[] args) {
      int roll[] = new int[2];
      roll[0] = 70;
      roll[1] = 75;
      String[] name = { "Ani", "Deew" };

      for (int i = 0; i < name.length; i++) {
         System.out.println(name[i]);
      }
      for (int x : roll) {
         System.out.println("Array elements are: " + x);
      }
   }
}