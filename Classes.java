class Employee{
    int empNo;
    String name;
    int sal;

    Employee(){
        empNo=1982;
        name="Ashish";
        sal= 2000000;
    }

    void Displaydata(){
        System.out.println("Employee No. :- "+ empNo +" | Name of the Employee :- " + name + " | Salary of the Employee :- "+ sal);
    }

}


class Classes {
    public static void main(String[] args){
        Employee emp1=new Employee();
        Employee emp2=new Employee();
        Employee emp3=new Employee();

        emp1.Displaydata();
        emp2.Displaydata();
        emp3.Displaydata();
    }
}
