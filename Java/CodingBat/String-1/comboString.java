public class comboString {
    public static String stringCombo(String a, String b) 
    {
        if (a.length()>b.length()) {
          return b + a + b; 
        }
        else {
          return a + b + a; 
        }
    }

    public static void main(String[] args)
    {
        stringCombo("Hello", "hi");
    }    
}
