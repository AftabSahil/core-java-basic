public class H {
    public static void test() {
        System.out.println("hello from H");
    }
    public static void main(String[] args) {
        System.out.println("H.main()");
        test();
        System.out.println("-----------------");
        test();
        System.out.println("-----------------");
        test();
    }
}
