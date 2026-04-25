import java.util.Vector;

class Employee {
    int empId;
    String name, designation;
    double salary;

    Employee(int id, String n, String d, double s) {
        empId = id;
        name = n;
        designation = d;
        salary = s;
    }

    void show() {
        System.out.println(empId + " " + name + " " + designation + " " + salary);
    }
}

class EmpList {
    public static void main(String[] str) {

        Vector<Employee> list = new Vector<Employee>();

        // Insert employees
        list.add(new Employee(101, "Amit", "Manager", 50000));
        list.add(new Employee(102, "Rita", "Secretary", 30000));
        list.add(new Employee(103, "John", "Clerk", 20000));

        // Search employee
        System.out.println("\nSearching employee with ID 102");
        for (Employee e : list) {
            if (e.empId == 102) {
                e.show();
            }
        }

        // Add employee at position
        list.add(1, new Employee(104, "Neha", "Clerk", 22000));

        // Delete employee
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).empId == 103) {
                list.remove(i);
                break;
            }
        }

        // Display all employees
        System.out.println("\nEmployee List:");
        for (Employee e : list) {
            e.show();
        }
    }
}
