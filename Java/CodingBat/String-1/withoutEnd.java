public class withoutEnd {
    public static String removeEnd(String str)
    {
        return str.substring(1, str.length()-1);
    }

    public static void main(String[] args)
    {
        removeEnd("Hello");
    }
}
