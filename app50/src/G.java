interface G {
    int a = 10;
    public int b =20;
    public static String s1 ="abc";
    public final static double d1 = 1.5;
    final static public char c1 = 'F';
}
class H{
    public static void main(String[] args) {
        System.out.println(G.a);
        System.out.println( G.b);
        System.out.println(G.s1);
        System.out.println(G.d1);
        System.out.println(G.c1);

    }
}
