public class Student{
    private String name;
    private int id;
    private ArrayList courses;

    public Student(String name, int id){
        this.name=name;
        this.id=id;
        courses= new ArrayList();
    }

    public void addCourse(Course course){
        courses.add(course);
    }

    public void removeCourse(Course course){
        courses.remove(course);
    }

    public ArrayList getCourses(){
        return courses;
    }

    public double getGPA(){
        double total=0;
        int count=0;
        
        for( Course course : courses){
            total += courses.getGrade();
            count++;
        }

        public String getTranscript() {
            String transcript= "Name : " + name + "\n" ;
            transcript += "ID : "+ id + "\n";
            for ( Course course : courses){
                transcript +=  "Course: " + course.getName() + " (" + course.getCredits() + " credits)\n";
                transcript +=  "Grade: " + course.getGrade() + " (" + course.getLetterGrade() + " )\n";
            }
            return transcript
        }

        System.out.println( "The Average Grade :- " + total/count);
    }
}

public class Course{
    private String name;
    private int credits;
    private double grade;

    public Course(String name, int credits){
        this.name=name;
        this.credits=credits;
    }

    public void setGrade(double grade){
        this.grade=grade;
    }

    public double getGrade(){
        return grade;
    }

    public int getCredits(){
        return credits;
    }
}

public class revision_5{
    public static void main(String[] args){

        Course cs= new Course("Computer Science", 4);
        cs.setGrade(3.7);

        Course mt = new Course("Math", 3);
        mt.setGrade(4);

        Student Alice= new Student("Alice", 1234);
        Alice.addCourse(cs);
        Alice.addCourse(mt);

        System.out.println(Alice.getGPA());

        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");

        Course cs2= new Course("Computer Science", 4);
        cs2.setGrade(3);

        Course mt2 = new Course("Math", 3);
        mt2.setGrade(3.5);

        Student Bob= new Student("Alice", 5678);
        Bob.addCourse(cs2);
        Bob.addCourse(mt2);

        System.out.println(Bob.getGPA());
        System.out.println(Bob.getTranscript());
        

    }
}