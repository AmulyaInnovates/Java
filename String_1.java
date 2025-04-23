class String_1 {
    public static void main(String[] args) {
        
        //String Pool is currently empty and when we add the String s1 to the pool, it is stored in a memory location. When s2 is executed with the same text, it would point to the same memory location like 2 domains linking to a single website.
        String s1= "TAT";
        String s2= "TAT";
        
        //In String Heap we are making new object in the heap which is seperate from the pool. So both of these would be pointing to different new adresses.
        String s3= new String("TAT");
        String s4= new String("TAT");
        
        //The output would remain same but the structural changes would be there.
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}