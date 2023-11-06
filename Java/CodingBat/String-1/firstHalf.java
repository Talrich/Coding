public class firstHalf {
    public static String startingHalf(String str)
    {
        return str.substring(0, str.length()/2);
    }   

    public static void main(String[] args)
    {
        startingHalf("WooHoo");
    }
}
