public class E {
    public static void main(String[] args) {
        System.out.println("E.main()");
        test();
    }
    public static void test() {
        
        System.out.println("E.test()");
        System.out.println("E.test()");
        System.out.println("E.test()");
        int i = 10;
        System.out.println("E.test()"+i);
        i++;
        System.out.println("E.test()"+i);
    }
}
