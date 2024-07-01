class Employee1{
    int id;
    int salary;
    String name;
    public void printDetails() {
        System.out.println("My name is "+ name);
        System.out.println("My Employee1 ID is "+ id);
    }

    public int getSalary(){
        return salary;
        // System.out.println("Salary is " + salary);
    }
}

public class oops{

    // static int sum(int a, int b){
    //     return a + b;
    // }
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee1 manoj = new Employee1();   // Object creation, Instatiation of a new Employee11 object
        Employee1 manasa = new Employee1();

        // Attribute creation
        manoj.id = 12;                      
        manoj.name = "Manoj S"; 
        manoj.salary = 34;
        manasa.id = 17;                      
        manasa.name = "Manasa S";
        manasa.salary = 12; 
        
        // Priting the attributes
        // System.out.println("Employee11 name is: " + manoj.name);
        // System.out.println("Employee11 ID is: " + manoj.id);
        manoj.printDetails();
        manasa.printDetails();
        int salary = manasa.getSalary();
        System.out.println(salary);

        // int a = 12;
        // int b = 20;
        // System.out.println("the sum of two numbers is "+ sum(a, b));
        
    }

}