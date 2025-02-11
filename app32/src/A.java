public class A {

    public static void main(String[] args) {
        System.out.println("main start");
        test();
        System.out.println("main end");
    }
    static void test() {
        System.out.println("test");
    }
}
//this will give output as
// main start
//test
//main end