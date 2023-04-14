public class Student {

   Course c1;
   Course c2;
   Course c3;
    String name;
    String stuNo;
    int classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, int classes, Course c1, Course c2, Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;

    }
    void addBulkExamNote(int quiz1, int exam1, int quiz2, int exam2, int quiz3, int exam3){
       if(c1.quiz >= 0 && c1.quiz <= 100 && c1.exam >= 0 && c1.exam <=100) {
           c1.quiz = quiz1;
           c1.exam = exam1;
           c1.note = c1.noteCalcC1(quiz1, exam1);
           System.out.println("fizik notu: " + c1.note);
       }
        if(c2.quiz >= 0 && c2.quiz <= 100 && c2.exam >= 0 && c2.exam <=100) {
            c2.quiz = quiz2;
            c2.exam = exam2;
            c2.note = c2.noteCalcC2(quiz2, exam2);
            System.out.println("mat notu: " + c2.note);
        }
        if(c3.quiz >= 0 && c3.quiz <= 100 && c3.exam >= 0 && c3.exam <=100) {
            c3.quiz = quiz3;
            c3.exam = exam3;
            c3.note = c2.noteCalcC3(quiz3, exam3);
            System.out.println("tarih notu: " + c3.note);
        }


    }
    void isPass(){


        this.avarage = (c1.note + c2.note + c3.note)/3.0;
        if(avarage>=55){
            System.out.println("Passed!");
            isPass = true;
        }
        else{
            System.out.println("Failed!");
            isPass = false;
        }
    }



    }



