public class H {
    public static void main(String[] args) {
        int i=1;
        while (i<=5) {
            System.out.println("loop body begin: " + i);
            if (i==2) {
                i++;
                continue;
            }
            System.out.println("loop body end: " + i);
            
        }
        System.out.println("main end: " + i);
    }
}
