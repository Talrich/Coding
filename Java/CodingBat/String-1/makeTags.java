public class makeTags {
    public static String tags(String tag, String word)
    {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public static void main(String[] args)
    {
        tags("i", "Yay");
    }
}
