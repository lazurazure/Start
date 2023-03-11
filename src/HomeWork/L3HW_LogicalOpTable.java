package HomeWork;

public class L3HW_LogicalOpTable {
    public static void main(String[] args) {
        boolean p;
        boolean q;
        int a, b, c, d, e, f;
        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
        p = true;
        q = true;

        if (p) a = 1;  else a = 0;
        if (q) b = 1;  else b = 0;
        if (p&q) c = 1; else c = 0;
        if (p|q) d = 1; else d = 0;
        if (p^q) e = 1; else e = 0;
        if (!p) f = 1; else f = 0;

        System.out.println(a + "\t" + b + "\t" + c + "\t" + d + "\t" + e + "\t" + f);

        p = true;
        q = false;

        if (p) a = 1;  else a = 0;
        if (q) b = 1;  else b = 0;
        if (p&q) c = 1; else c = 0;
        if (p|q) d = 1; else d = 0;
        if (p^q) e = 1; else e = 0;
        if (!p) f = 1; else f = 0;

        System.out.println(a + "\t" + b + "\t" + c + "\t" + d + "\t" + e + "\t" + f);

        p = false;
        q = true;

        if (p) a = 1;  else a = 0;
        if (q) b = 1;  else b = 0;
        if (p&q) c = 1; else c = 0;
        if (p|q) d = 1; else d = 0;
        if (p^q) e = 1; else e = 0;
        if (!p) f = 1; else f = 0;

        System.out.println(a + "\t" + b + "\t" + c + "\t" + d + "\t" + e + "\t" + f);

        p = false;
        q = false;

        if (p) a = 1;  else a = 0;
        if (q) b = 1;  else b = 0;
        if (p&q) c = 1; else c = 0;
        if (p|q) d = 1; else d = 0;
        if (p^q) e = 1; else e = 0;
        if (!p) f = 1; else f = 0;

       System.out.println(a + "\t" + b + "\t" + c + "\t" + d + "\t" + e + "\t" + f);
     }
}
