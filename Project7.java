class Student {
    int admissionNo;
    String name;
    int studentClass;
    char section;
    double marksPercentage;

    // Constructor
    Student(int admissionNo, String name, int studentClass, char section, double marksPercentage) {
        this.admissionNo = admissionNo;
        this.name = name;
        this.studentClass = studentClass;
        this.section = section;
        this.marksPercentage = marksPercentage;
    }

    // Method to display student details
    void DisplayData() {
        System.out.println("Admission No: " + admissionNo 
                + " | Name: " + name 
                + " | Class: " + studentClass 
                + " | Section: " + section 
                + " | Marks Percentage: " + marksPercentage + "%");
                System.out.println("-_-_-_-_");
    }
}

class Project7 {
    public static void main(String[] args) {
        // Array of students
        Student[] students = new Student[10];

        // Initializing students
        students[0] = new Student(101, "Amulya Gupta", 9, 'A', 99.45);
        students[1] = new Student(102, "Tom", 9, 'B', 88.4);
        students[2] = new Student(103, "Sam", 10, 'A', 80.2);
        students[3] = new Student(104, "Ananya Tuteja", 10, 'B', 95.6);
        students[4] = new Student(105, "Karan Singh", 8, 'C', 78.9);
        students[5] = new Student(106, "Isha Arora", 9, 'A', 89.7);
        students[6] = new Student(107, "Arnav Verma", 8, 'B', 85.3);
        students[7] = new Student(108, "Pooja Reddy", 10, 'C', 91.4);
        students[8] = new Student(109, "Nitin Mehra", 9, 'A', 76.8);
        students[9] = new Student(110, "Sneha Roy", 8, 'C', 87.1);

        // Displaying student details
        for (Student student : students) {
            student.DisplayData();
        }
    }
}
