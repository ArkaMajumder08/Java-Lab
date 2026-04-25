abstract class Person {
    String name;
    int age;

    abstract void read();

    abstract void print();
}

class Student extends Person {
    int rollNo;
    String course;

    void read() {
        name = "ARKA";
        age = 21;
        rollNo = 8;
        course = "ECE";
    }

    void print() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
        System.out.println();
    }
}

class Teacher extends Person {
    String subject;
    double salary;

    void read() {
        name = "Mr. DG";
        age = 50;
        subject = "Physics";
        salary = 100000;
    }

    void print() {
        System.out.println("Teacher Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
}

class TestAbstract {
    public static void main(String[] args) {

        Student s = new Student();
        Teacher t = new Teacher();

        s.read();
        s.print();

        t.read();
        t.print();
    }
}
