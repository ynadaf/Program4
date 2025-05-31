class Course {
    String courseName;
    int marks;

    // Constructor to initialize course name and marks
    public Course(String courseName, int marks) {
        this.courseName = courseName;
        this.marks = marks;
    }

    // Method to check if marks are less than 40
    public boolean isFailing() {
        return marks < 40;
    }

    // Method to display course information
    public void displayCourse() {
        System.out.println(courseName + " - Marks: " + marks);
    }
}
