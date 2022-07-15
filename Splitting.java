public class Splitting {
        public static void main(String args[])
        {
                String str = "Splitting String";
              
                String[] spl = str.split(" "); 
        
                for (String i : spl) {
                    System.out.println("Splitted : " + i);
                }
        }   
}
