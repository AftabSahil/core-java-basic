public class B {
    public static void main(String[] args) {
        System.out.println("main start");
        test(false);
        System.out.println("main end");
    }
    static void test(int i) { 
        System.out.println("test" + i);
    }
}
//this will give error because we are passing boolean value in test method but it is expecting int value
