
public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mary", "1234", "PHYS");
        Teacher t2 = new Teacher("Tom", "1231", "MATH");
        Teacher t3 = new Teacher("Julia", "1212", "BIO");

        Course c1 = new Course("Physics", "101", "PHYS");
        Course c2 = new Course("Maths", "101","MATH");
        Course c3 = new Course("Biology", "101", "BIO");

        Student s1 = new Student("Ross", "111", 1,  c1, c2, c3);
        s1.addBulkExamNote(20,80,50,80,50,50);
        s1.isPass();


        c1.printTeacher();
        c2.printTeacher();
        c3.printTeacher();

        }
    }
