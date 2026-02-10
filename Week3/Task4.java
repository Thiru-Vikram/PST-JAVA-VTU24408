package Week3;

import java.util.*;

class Student {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

public class Task4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int id = scan.nextInt();
            String fname = scan.next();
            double cgpa = scan.nextDouble();

            students.add(new Student(id, fname, cgpa));
        }
        scan.close();

        // Sort using a custom comparator
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                // First compare by CGPA in descending order
                if (s1.getCgpa() != s2.getCgpa()) {
                    return Double.compare(s2.getCgpa(), s1.getCgpa());
                }
                // If CGPA is equal, compare by first name alphabetically
                if (!s1.getFname().equals(s2.getFname())) {
                    return s1.getFname().compareTo(s2.getFname());
                }
                // If first name is also equal, compare by ID
                return Integer.compare(s1.getId(), s2.getId());
            }
        });

        // Print first names
        for (Student student : students) {
            System.out.println(student.getFname());
        }
    }
}
