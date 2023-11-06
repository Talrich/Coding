public class nonStart {
    public static String removeFirst(String a, String b)
    {
        String part1 = a.substring(1, a.length()); 
        String part2 = b.substring(1, b.length()); 
        return part1+part2;
    }

    public static void main(String[] args)
    {
        removeFirst("Hello", "There");
    }
}
