public class F {
    static void test(int i,int j)  
     {
        System.out.println("test" + i +','+ j);
    }
    public static void main(String[] args) {
        System.out.println("main start");
        test(20); 
        System.out.println("main end"+i);
    }
    
}
//this will give error as j is not defined in main method