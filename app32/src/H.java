public class H {
    static void test(int i,int j)  
     {
        System.out.println("test" + i +","+ j);
        i=6000; //it will not change the value of i beacuse i is defined in main method that is a
    }
    public static void main(String[] args) {
        System.out.println("main start");
        int a=20;
        test(a,50); //i will take the value of a
        System.out.println("main end"+ a); 
    }
    
}