public class Employee {
    int id;
    int salary;

    String name;
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }

    public void getDetails(){
        System.out.println(id + " " + name + " " + salary);
    }
}
