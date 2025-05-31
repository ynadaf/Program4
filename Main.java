class Student {
    String name;
    Course[] courses; // Array to store courses

    // Constructor to initialize student name and courses
    public Student(String name, Course[] courses) {
        this.name = name;
        this.courses = courses;
    }

    // Method to display student details and failing courses
    public void displayFailingCourses() {
        System.out.println("Student: " + name);
        boolean hasFailingCourses = false;
        for (Course course : courses) {
            if (course.isFailing()) {
                if (!hasFailingCourses) {
                    System.out.println("Courses with marks less than 40:");
                    hasFailingCourses = true;
                }
                course.displayCourse();
            }
        }
        if (!hasFailingCourses) {
            System.out.println("No courses with marks less than 40.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create courses with course name and marks
        Course course1 = new Course("Math", 50);
        Course course2 = new Course("Science", 45);
        Course course3 = new Course("History", 49);

        // Create an array of courses
        Course[] courses = {course1, course2, course3};

        // Create a student and assign courses
        Student student = new Student("SANIYA", courses);

        // Display courses where the student scored less than 40
        student.displayFailingCourses();
    }
}
