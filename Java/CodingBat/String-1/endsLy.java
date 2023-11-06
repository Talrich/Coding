public class endsLy 
{
    public static boolean endsInLy(String str)
    {
        
        if (str.length() < 2)
        {
            return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        String end = "ly ";
        endsInLy(String.valueOf(args[0])); 
        System.out.println(args[0].substring(args[0].length()-2)); 
        System.out.println(args[0].substring(args[0].length()-2) == end);
    }
}
