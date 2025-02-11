public class I {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two numbers as arguments");
            return;
        }
        int i=Integer.parseInt(args[0]);
        int j=Integer.parseInt(args[1]);
        int min=i<j?i:j;
        System.out.println(i);
        System.out.println(j);
        System.out.println("min between "+i+" and "+j+" is "+min);
    }
        
}
