public class Main {
    public static void main(String[] args) {

//        Employee emp =new Employee();
//        emp.setId(112);
//        emp.setName("Zoopla");
//        emp.setSalary(50000);
//        emp.getDetails();

        garbageCollection obj1 = new garbageCollection();
        System.out.println("Number of objects " + garbageCollection.count);
        garbageCollection obj2 = new garbageCollection();
        System.out.println("Number of objects " + garbageCollection.count);
        Runtime r = Runtime.getRuntime();
        obj1 = null;
        obj2 = null;
        r.gc();





    }
}