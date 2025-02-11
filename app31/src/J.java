public class J {
    public static void main(String[] args) {
        System.out.println("begin of J.main()");
        test();
        System.out.println("-----------------");
        test2();
        System.out.println("-----------------");
        test();
        System.out.println("end of J.main()");
    }
    public static void test() {
        System.out.println("hello from start test");
        test2();
        System.out.println("hello from end test");
    }
    public static void test2() {
        System.out.println("hello from start test2");
        // test();
        // System.out.println("hello from end test2");
    }
}
