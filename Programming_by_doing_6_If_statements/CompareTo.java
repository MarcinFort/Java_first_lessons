public class CompareTo {

    public static void main(String[] args) {

        System.out.print("1. Comparing \"axe\" with \"dog\" produces ");
        int i = "axe".compareTo("dog");
        System.out.println(i);

        System.out.print("2. Comparing \"dog\" with \"cat\" produces ");
        int j = "dog".compareTo("cat");
        System.out.println(j);

        System.out.print("3. Comparing \"Alaska\" with \"Wisconsin\" produces ");
        int k = "Alaska".compareTo("Wisconsin");
        System.out.println(k);

        System.out.print("4. Comparing \"highway\" with \"hell\" produces ");
        int l = "highway".compareTo("hell");
        System.out.println(l);

        System.out.print("5. Comparing \"\" (empty string) with \"String\" produces ");
        int m = "".compareTo("String");
        System.out.println(m);

        System.out.print("6. Comparing \"String\" with \"\" (empty string) produces ");
        int n = "String".compareTo("");
        System.out.println(n);

        System.out.print("7. Comparing \"Java\" with \"JavaScript\" produces ");
        int o = "Java".compareTo("JavaScript");
        System.out.println(o);

        System.out.print("8. Comparing \"Haskell\" with \"Perl\" produces ");
        int p = "Haskell".compareTo("Perl");
        System.out.println(p);

        System.out.print("9. Comparing \"C++\" with \"C\" produces ");
        int q = "C++".compareTo("C");
        System.out.println(q);

        System.out.print("10. Comparing \"SQL\" with \"MongoDB\" produces ");
        int r = "SQL".compareTo("MongoDB");
        System.out.println(r);

        System.out.print("11. Comparing \"Amazon\" with \"amazon\" produces ");
        int s = "Amazon".compareTo("amazon");
        System.out.println(s);

        System.out.print("12. Comparing \"Google\" with \"Googling\" produces ");
        int t = "Google".compareTo("Googling");
        System.out.println(t);
    }

}