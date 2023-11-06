public class left2 {
    public static String leftTwo(String str)
    {
        if (str.length()>2) 
        {
            String part1 = str.substring(0, 2); 
            String part2 = str.substring(2, str.length()); 
            str = part2 + part1;
            return str; 
        }
        else 
        {
            return str; 
        }
    }

    public static void main(String[] args)
    {
        leftTwo("Hello");
    }
}
