public class I {
    public static void main(String[] args) {
        System.out.println("I.main()");
        test();
        System.out.println("-----------------");
        test2();
        System.out.println("-----------------");
        test();
    }
    public static void test() {
        System.out.println("hello from test");
    }
    public static void test2() {
        System.out.println("hello from test2");
    }
}
