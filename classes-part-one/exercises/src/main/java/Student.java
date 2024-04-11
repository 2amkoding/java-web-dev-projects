public class Student {
        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa;
        private static int numOfStudents = 1;

        // Drop your getters and setters below for the Student class.
        // To instantiate the Student class, add your code to the main in the file, SchoolPractice.


        public Student(String aName, int aNumberOfCredits, double aGpa) {
                name = aName;
                numberOfCredits = aNumberOfCredits;
                gpa = aGpa;
                studentId = numOfStudents++;
        }

        public Student(String name, int numberOfCredits) {
                this.name = name;
                this.numberOfCredits = numberOfCredits;
        }

        public String getName() {
                return name;
        }


        public int getStudentId() {
                return studentId;
        }

        public int getID () {
                return studentId;
        }

        public int getNumberOfCredits() {
                return numberOfCredits;
        }

        public void setNumberOfCredits(int numberOfCredits) {
                this.numberOfCredits = numberOfCredits;
        }

        public double getGpa() {
                return gpa;
        }

        public void setGpa(double gpa) {
                this.gpa = gpa;
        }
}
