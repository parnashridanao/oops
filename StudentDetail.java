class Student{
    String Department;
    String Section;
    String name;
    int rollno;
    }
public class StudentDetail {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.Department="Electronics and Computer sciences";
        s1.Section="O4";
        s1.name="Parnashri Danao";
        s1.rollno=8;
        System.out.println("Department: "+s1.Department);
        System.out.println("Section: "+s1.Section);
        System.out.println("Name: "+s1.name);
        System.out.println("Rollno: "+s1.rollno);
    }
    }
