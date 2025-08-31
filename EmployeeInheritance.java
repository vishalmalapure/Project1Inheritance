import java.util.Scanner;

class Emp {
    int wday;
    String name;

    Emp(int a, String b) {
        this.wday = a;
        this.name = b;
    }

    void CalDed(int Abday) {
        System.out.println("Here I will calculate the days of work");
    }
}

class Manager extends Emp {
    Manager(int a, String b) {
        super(a, b);
    }

    void CalDed(int Abday) {
        int y = wday - Abday;
        System.out.println("Total salary of the manager after deductions: " + y * 1000);
    }
}

class Clerk extends Emp {
    Clerk(int a, String b) {
        super(a, b);
    }

    void CalDed(int Abday) {
        int y = wday - Abday;
        System.out.println("Total salary of the clerk after deductions: " + y * 500);
    }
}

class Security extends Emp {
    Security(int a, String b) {
        super(a, b);
    }

    void CalDed(int Abday) {
        int y = wday - Abday;
        System.out.println("Total salary of the security after deductions: " + y * 300);
    }
}

public class EmployeeInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter employee name: ");
        String name = sc.nextLine();

        System.out.println("Enter total working days: ");
        int wday = sc.nextInt();

        System.out.println("Enter absent days: ");
        int Abday = sc.nextInt();

        System.out.println("Enter the choice:\n1. Manager\n2. Clerk\n3. Security\n4. Exit");
        int choice = sc.nextInt();

        Emp emp = null;

        switch (choice) {
            case 1:
                emp = new Manager(wday, name);
                break;
            case 2:
                emp = new Clerk(wday, name);
                break;
            case 3:
                emp = new Security(wday, name);
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        emp.CalDed(Abday);
    }
}
