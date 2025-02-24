class E {
    static long test1(short s1){
        return s1;
    }
    public static void main(String[] args) {
        byte b1 = 12;
        float f1 = test1(b1);
        System.out.println("done");
    }
}
