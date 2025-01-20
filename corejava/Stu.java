public class Stu {
        public  String name;
        private int grade;
    
        public Stu(String name, int grade) {
            this.name = name;
            this.grade = grade;
        }
    
        public void enroll(Course course) {
            course.addStudent(this); // Passing the current object
        }


}