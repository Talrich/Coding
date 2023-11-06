public class withouEnd2 {
    public static String withouEndTwo(String str) 
    {
        if (str.length() >= 2)
        {
          String part = str.substring(1, str.length()-1);
          str = part; 
          return str;
        }
        else 
        {
          str = "";
          return str; 
        }
    }

    public static void main(String[] args)
    {
        withouEndTwo("Hello");
    }
}
