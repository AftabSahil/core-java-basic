public class G {
    static void test(int i,int j)  
     {
        System.out.println("test" + i +","+ j);
        i=6000; //i is defined in  local test method
    }
    public static void main(String[] args) {
        System.out.println("main start");
        test(20,50); 
        System.out.println("main end"+ i); //i is not defined in main method
    }
    
}