public class Searching_string_index {
      public static void main(String args[])
      {
        String str = "Searching index";
     
        int s1 = str.indexOf("index");
        int s2 = str.indexOf("h", 3);

        
        System.out.println("At Index : " + s1);
        System.out.println("At Index : " + s2);

      }  
}
