public class Student {
    //variables/member variables/fields
    private int rollNo;
    private String name;
    private String clgName;
    int totalmarks;
    String id;
    double gpa;

    //constructures/methos
    //constructor1 with no arguments
    /**
     * this constructor is used to create a new instance without rollNo and name
     */
    public Student() {
        System.out.println("no arguments constructor");
    }

    //constructure 2
    /**
     * this constructor is usinged is to createa an object along with rollNo and name
     * @param rollNo the roll no of student
     * @param name the name of the student
     */
    public Student(int rollNo, String name) {
        super();
        System.out.println("parameterized constructor");
    }

    public Student(int rollNo, String name, String clgName) {
      
        System.out.println("3 parameters constructor");
        this.rollNo = rollNo;
        this.name = name;
        this.clgName = clgName;

    }
    public Student(String name, String id, double gpa){
        this.name = name;
        this.id = id;
        this.gpa = gpa;
        
    }
    /*
     this is comment
     */

     /**
      * this is java documentation
      */

      //this is single line comment
      
    //non static method
    public void calcTotalMarks() {
        System.out.println("method");
        //either call another method or statements
        anotherMethod();
    }

    public void anotherMethod() {
        System.out.println("its another method");
    }

    //static method
    public static void printCollageName() {
        System.out.println("SJCET");
    }
    public void printStudentInfo(){
        System.out.println(name);
        System.out.println(id);
        System.out.println(isOnDeansList());
    }
    public String isOnDeansList(){
        if (gpa >= 7){
            return "Yes";
        }
        else {
            return "no";
        }
    }

    //main method
    public static void main(String[] args) {
        Student student = new Student(20, "hare");
        Student student2 = new Student();
       
        System.out.println(student2.name);
        System.out.println(student2.rollNo);
        student2.calcTotalMarks();
        printCollageName();
    }
    
}
