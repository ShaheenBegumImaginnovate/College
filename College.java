import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class College {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("CSE", "Afreen", 60));
        students.add(new Student("EEE", "Shireen", 70));
        students.add(new Student("Mech", "roja", 80));
        students.add(new Student("CSE", "swathi", 69));
        students.add(new Student("EEE", "swetha", 85));
        students.add(new Student("Mech", "madhav", 65));
        students.add(new Student("CSE", "sai sree", 58));
        students.add(new Student("Civil", "ramya", 90));
        students.add(new Student("Mech", "Harshitha", 75));
        Map<String, List<Student>> studentByBranch = new HashMap<>();
        for (Student st : students) {
            String Branch = st.getBranch();
            if (!studentByBranch.containsKey(Branch)) {
                studentByBranch.put(Branch, new ArrayList<Student>());
            }
            studentByBranch.get(Branch).add(st);
        }
        for (String Branch : studentByBranch.keySet()) {
            List<Student> branchStudents = studentByBranch.get(Branch);
            int totalMarks = 0;
            for (Student student : branchStudents) {
                totalMarks = totalMarks + student.getMarks();
            }
            double avarageMarks = (double) totalMarks / branchStudents.size();
            System.out.println("Branch: " + Branch);
            System.out.println("Average Marks: " + avarageMarks);
            System.out.println("Students:");
            for (Student student : branchStudents) {
                System.out.print(student.getStudent() + ",");
            }
            System.out.println();
        }
    }
}
class Student{
    private String branch;
    private String student;
    private int marks;
    public Student(String branch, String student, int marks) {
        super();
        this.branch = branch;
        this.student = student;
        this.marks = marks;
    }
    public String getBranch() {
        return branch;
    }
    public String getStudent() {
        return student;
    }
    public int getMarks() {
        return marks;
    }
}

