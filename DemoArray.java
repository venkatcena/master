class Student{
    int id ;
    String name;
    int marks;
}

public class DemoArray {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.id = 405;
        s1.name = "Mahesh";
        s1.marks = 89;

        Student s2 = new Student();
        s2.id = 404;
        s2.name = "Malli";
        s2.marks = 98;

        Student s3 = new Student();
        s3.id = 1023;
        s3.name = "Teju";
        s3.marks = 70;

        System.out.println(s1.name + " : " + s1.marks);

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;


        for (Student student : students) {
            System.out.println(student.name + " : " + student.marks);

        }

    }
}
