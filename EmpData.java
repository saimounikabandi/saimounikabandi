class Employee{
    int id;
    String name;
    String role;
    double salary;
    String company;
    Employee(int id,String name,String role,double salary,String company){
        this.id=id;
        this.name=name;
        this.role=role;
        this.salary=salary;
        this.company=company;
    }
    public void display(){
        System.out.println("name is:"+this.name);
        System.out.println("id is:"+this.id);
        System.out.println("role is:"+this.role);
        System.out.println("salary is:"+this.salary);
        System.out.println ("companyis:"+this.company);
        System.out.println();
    }
}
    class EmpData{
        public static void main(String argds[]){
            Employee e1= new Employee(101,"sunny","python FS",58000.9,"wipro");
            Employee e2=new Employee(102,"sai","manger",108000.9,"wipro");
            e1.display();
            e2.display();
        }
    }