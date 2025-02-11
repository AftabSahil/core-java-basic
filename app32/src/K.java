public class K {
    
    public static void main(String[] args) {
        System.out.println("main start");
        int i=20;
        int j=40;
        test(i++ + j++ + i++ + j++,j++ + i++ + j++ + i++); 
        System.out.println("main end"+ i +","+ j); 
    }
    static void test(int i,int j)  
     {
        System.out.println("test" + i +","+ j);
        i=10; 
        j=20;
    }
    
}