public class J {
    
    public static void main(String[] args) {
        System.out.println("main start");
        int i=20;
        int j=40;
        test(i++,j++); 
        System.out.println("main end"+ i +","+ j); 
    }
    static void test(int i,int j)  
     {
        System.out.println("test" + i +","+ j);
        i=6000; 
        j=60;
    }
    
}