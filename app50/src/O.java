interface A{
    void test1();
    void test2();
}
class O implements A{
    public void test1() {
        System.out.println("test1");
    }
    public void test2() {
        System.out.println("test2");
    }
    public static void main(String[] args) {
        O o1 = new O();
        o1.test1();
        o1.test2();
        System.out.println();
        
    }
}
