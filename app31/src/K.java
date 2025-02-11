public class K {
    public static void main(String[] args) {
        System.out.println("begin of K.main()");
        test();
        System.out.println("-----------------");
        test2();
        System.out.println("-----------------");
        test();
        System.out.println("end of K.main()");
    }
    public static void test() {
        System.out.println("hello from start test");
        // test2();
        System.out.println("hello from end test");
    }
    public static void test2() {
        System.out.println("hello from start test2");
        test();
        // System.out.println("hello from end test2");
    }
}
