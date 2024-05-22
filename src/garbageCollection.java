public class garbageCollection {
   public static int count;
    public garbageCollection(){
        count++;

    }
    protected void finalize(){
        System.out.println("Program about to terminate");
        garbageCollection.count--;
        System.out.println("Number of objects " + garbageCollection.count);

    }


}
