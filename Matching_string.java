public class Matching_string {
        public static void main(String args[])
        {
                String ms = ("Matching a String Against a Regular Expression");
                boolean match = ms.matches("(.*)String(.*)");
                System.out.println("Matches : " + match);
        }
}
