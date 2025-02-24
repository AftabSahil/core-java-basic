public class D {
    static void test1(double d1){
        System.out.println("test1: " + d1);

    }
    public static void main(String[] args) {
        byte a=12;
        short b=12;
        int c=12;
        long d=12;
        float e=12;
        double f=12;
        test1(a);  //test1((double)a);
        test1(b);
        test1(c);
        test1(d);  //test1((double)d)
        test1(e);
        test1(f);
        System.out.println("done");
    }
}
