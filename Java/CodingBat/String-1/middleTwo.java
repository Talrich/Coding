public class middleTwo {
    public static String middle2(String str)
    {
        return str.substring((str.length()/2)-1, (str.length()/2)+1); 
    }

    public static void main(String[] args)
    {
        middle2("string");
    }
}
