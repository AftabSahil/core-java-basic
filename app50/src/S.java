interface A{
    void test1();
}
interface B extends A{
    void test1();
}
class S implements B{
    public void test1() {
        System.out.println("test1");
    }
    public void test2() {
        System.out.println("test2");
    }
    public static void main(String[] args) {
        S s1 = new S();
        s1.test1();
        s1.test2();
        System.out.println("hello S");
    }
}