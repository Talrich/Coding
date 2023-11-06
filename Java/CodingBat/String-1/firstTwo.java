public class firstTwo {
    public static String first2(String str) 
    {
        if (str.length()>=2) 
        {
            return str.substring(0,2);
        }
        else 
        {
            return str;
        }
    }

    public static void main(String[] args)
    {
        first2("Hello");
    }
}
