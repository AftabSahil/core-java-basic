public class B {
    public static void main(String[] args) {
        System.out.println(95>>1);  //right shift by 1
        System.out.println(95>>2);  //right shift by 2
        System.out.println(95>>3);  //right shift by 3

        System.out.println(95<<1);  //left shift by 1
        System.out.println(95<<2);  //left shift by 2
        System.out.println(95<<3);  //left shift by 3
        
    }

    /*
        95 = 1011111
        
        95>>1 = 100101 = 47
        95>>2 = 10010 = 23
        95>>3 = 1001 = 11

        95<<1 = 1011110 = 190
        95<<2 = 10111100 = 380
        95<<3 = 101111000 = 760
     */
}
