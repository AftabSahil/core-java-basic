public class D {
    public static void main(String[] args) {
        int i=1;
        while (i++<=5) {
            System.out.println("loop body: " + i);
            i++;
        }
        System.out.println("loop end: " + i);
    }
}
