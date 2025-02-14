public class X {
    public static void main(String[] args) {
        System.out.println("main starts");
        if (test()) {
            System.out.println("from if");
        }
        System.out.println("main end");
    }
    static Boolean test()
    {
        System.out.println("from test");
        return null;
    }
}
