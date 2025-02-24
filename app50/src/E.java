interface A {
    int i = 10; //public, static, final     
                        //inside an interface only 2 types of member can be developed.
}                       //1. constants
                        //2. abstract methods
class E{
    public static void main(String[] args) {
        System.out.println(A.i);
    }
}
