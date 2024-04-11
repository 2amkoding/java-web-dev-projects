public class StudentPractice {
    public static void main(String[] args){
        Student student1 = new Student("June", 1234,4.0);
        Student student2 = new Student("james", 20, 3.4);
        Teacher javaTeacher = new Teacher("Phillip","h", "java", 10);
        Course launchCode = new Course("java", "phillip");
        launchCode.addStudent((student1));
        launchCode.addStudent((student2));

       System.out.println(launchCode.getSubject());
//       System.out.println(launchCode.getEnrolledStudents().get(0).getName());
//       System.out.println(launchCode.getEnrolledStudents().get(1).getName());
        for (Student student : launchCode.getEnrolledStudents()){
            System.out.println(student.getName());
        }
    }

}
