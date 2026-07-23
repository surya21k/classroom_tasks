public class EmployeeProcessor {
    public static void main(String[] args) {
        Employee obj = new Employee(201,"Bob",5);
        obj.setDesignation("Junior");
        obj.setSalary(50000);
        obj.display();
        obj.promoteEmployee("Senior");
    }
}
