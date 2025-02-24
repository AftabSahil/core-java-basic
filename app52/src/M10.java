class M10{
    public static void main(String[] args) {
        A a1=new D();
        B b1=new D();
        C c1=new D();
        Object o1=new D();


        // test(a1);
        // test(b1);
        // test(c1);
        // test(o1);

        test((D) a1);
        test((D) b1);
        test((D) c1);
        test((D) o1);


        System.out.println("hello world");
    }
    static void test(D obj){
        System.out.println("test(D) called");
    }
}