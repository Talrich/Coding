public class endsLy 
{
    public static boolean endsInLy(String str) {
        if (str.length() < 2)
        {
          return false;
        }
        else if (str.substring(str.length()-2, str.length()).equals("ly"))
        {
          return true;
        }
        else 
        {
          return false;
        }
      }
      
    public static void main(String[] args)
    {
        endsInLy("oddly");
    }
}
