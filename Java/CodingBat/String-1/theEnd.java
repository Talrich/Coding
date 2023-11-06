public class theEnd {
    public static String end(String str, boolean front) {

        if (front == true) 
        {
          return str.substring(0, 1);
        }
        else 
        {
          return str.substring(str.length()-1, str.length());
        }
      }
    public static void main(String[] args)
    {
        end("Hello", true);
    }
}
