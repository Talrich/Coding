public class extraEnd {
    public static String endRepeated(String str)
    {
        String portion = str.substring(str.length()-2, str.length());
        return portion + portion + portion;
    }

    public static void main(String[] args)
    {
        endRepeated("Hello");
    }
}
