package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree.LinearDataStructures;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class LittleBlackBook {

    static class Employee {
        String title;
        String firstName;
        String lastName;
        String homeAddress;
        String department;
        String homePhone;
        String workPhone;
        String campusBox;

        public Employee(String title, String firstName, String lastName, String homeAddress, String department,
                        String homePhone, String workPhone, String campus) {
            super();
            this.title = title;
            this.firstName = firstName;
            this.lastName = lastName;
            this.homeAddress = homeAddress;
            this.department = department;
            this.homePhone = homePhone;
            this.workPhone = workPhone;
            this.campusBox = campus;
        }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("----------------------------------------").append("\n");
            sb.append(String.format("%s %s %s", this.title, this.firstName, this.lastName)).append("\n");
            sb.append(homeAddress).append("\n");
            sb.append(String.format("Department: %s", this.department)).append("\n");
            sb.append(String.format("Home Phone: %s", this.homePhone)).append("\n");
            sb.append(String.format("Work Phone: %s", this.workPhone)).append("\n");
            sb.append(String.format("Campus Box: %s", this.campusBox)).append("\n");
            return sb.toString();
        }
    }

    static class EmployeeComparator implements Comparator<Employee> {

        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.lastName.compareTo(o2.lastName);
        }
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        ArrayList<Employee> list = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            String rec;
            String department = br.readLine();
            while ((rec = br.readLine()) != null && rec.length() != 0) {
                String[] field = rec.split(",");
                String title = field[0];
                String first = field[1];
                String last = field[2];
                String add = field[3];
                String hPhone = field[4];
                String wPhone = field[5];
                String campus = field[6];
                Employee employee = new Employee(title, first, last, add, department, hPhone, wPhone, campus);
                list.add(employee);
            }
        }
        list.sort(new EmployeeComparator());
        StringBuilder ans = new StringBuilder();
        for (Employee e: list)
            ans.append(e.toString());
        System.out.print(ans);

    }


}
