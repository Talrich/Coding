public class right2 {
    public static String rightTwo(String str)
    {
        if (str.length() > 2)
        {
            String part1 = str.substring(str.length()-2, str.length()); 
            String part2 = str.substring(0, str.length()-2);
            return part1+part2; 
        }
        else 
        {
            return str;
        }
    }

    public static void main(String[] args)
    {
        rightTwo("Hello");
    }
}
