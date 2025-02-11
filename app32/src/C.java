public class C {
    public static void main(String[] args) {
        System.out.println("main start");
        test(20); //20 is called argument
        System.out.println("main end");
    }
    static void test(int i)  //int i is called parameter
     {
        System.out.println("test" + i);
    }
}
