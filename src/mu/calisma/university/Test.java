package mu.calisma.university;

public class Test {

    public static void main(String[] args) {


       //DEPARTMENT 1
        Department department1 = new Department();
        department1.name = "Civil Engineering";


        //COURSE 1
        Course course1 = new Course();
        course1.code = 101;
        course1.name = "Dynamic";


        //PROFESSOR 1
        Proffessor proffessor1 = new Proffessor();
        proffessor1.no = 532;
        proffessor1.name = "Sinan Altın";
        proffessor1.rank = "Professor";


        //STUDENT 1
        Student student1 = new Student();
        student1.no = 111130084;
        student1.name = "Mustafa";
        student1.lastName = "Uğurlu";



        department1.head = proffessor1;
        proffessor1.department = department1;


        course1.department = department1;
        department1.courses = new Course[100];
        department1.courses[0] =course1;

        course1.teacher = proffessor1;
        proffessor1.coursesGiven = new Course[5];
        proffessor1.coursesGiven[0] = course1;


        student1.advisor = proffessor1;
        proffessor1.advise = new Student[10];
        proffessor1.advise[0] = student1;


        student1.coursesTaken = new Course[4];
        student1.coursesTaken[0] = course1;

        course1.students = new Student[100];
        course1.students[0] = student1;


        System.out.println(course1.code);
        System.out.println(student1.coursesTaken[0].teacher.name);
        System.out.println(student1.coursesTaken[0].teacher.department.head.name);















    }
}
