public class H {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two numbers as arguments");
            return;
        }
        int i=Integer.parseInt(args[0]);
        int j=Integer.parseInt(args[1]);
        int sum=i+j;
        System.out.println(i);
        System.out.println(j);
        System.out.println(sum);
    }
        
}
