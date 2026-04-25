class EmployeeSalary {
    double basic, da, hra, ma;

    EmployeeSalary(double basic) {
        this.basic = basic;
        this.da = basic*.75;
        this.hra = basic*.25;
        this.ma = 2000;
    }

    double regularSalary() {
        return basic + da + hra + ma;
    }
}

class Scientist extends EmployeeSalary {
    int publications;
    double bonusPerPublication;
    double net_bonus;

    Scientist(double basic, int publications, double bonusPerPublication) {
        super(basic);
        this.publications = publications;
        this.bonusPerPublication = bonusPerPublication;
	net_bonus=publications*bonusPerPublication;
    }

    double netSalary() {
        return regularSalary() + net_bonus;
    }
}

class Developer extends EmployeeSalary {
    int patents;
    double bonusPerPatent;
    double net_bonus;

    Developer(double basic, int patents, double bonusPerPatent) {
        super(basic);
        this.patents = patents;
        this.bonusPerPatent = bonusPerPatent;
	net_bonus=patents*bonusPerPatent;
    }

    double netSalary() {
        return regularSalary() + net_bonus;
    }
}


class ProjectLeader extends EmployeeSalary {
    int projects;
    double bonusPerProject;
    double net_bonus;

    ProjectLeader(double basic, int projects, double bonusPerProject) {
        super(basic);
        this.projects = projects;
        this.bonusPerProject = bonusPerProject;
	net_bonus=projects*bonusPerProject;
    }

    double netSalary() {
        return regularSalary() + net_bonus;
    }
}

class TestSalary {
    public static void main(String[] str) {

        Scientist s = new Scientist(30000, 3, 2000);
        Developer d = new Developer(35000, 2, 3000);
        ProjectLeader p = new ProjectLeader(40000, 4, 2500);

        System.out.println("Scientist Net Salary: " + s.netSalary());
        System.out.println("Developer Net Salary: " + d.netSalary());
        System.out.println("Project Leader Net Salary: " + p.netSalary());
    }
}
