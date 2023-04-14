public class Course {

    Teacher teacher;
    String name;
    String code;
    String prefix;
    double note;
    double quiz;
    double exam;
    double courseAvarage;

    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
           }
    void addTeacher(Teacher teacher){
        this.teacher = teacher;
    }
    void printTeacher(){

        System.out.println("=============");
        System.out.println("Name: " + this.teacher.name + "\nPhone: " + this.teacher.mpno + "\nBranch: " + this.teacher.branch);
    }
    double noteCalcC1(double quiz1, double exam1){
        this.quiz = quiz1*0.2;
        this.exam = exam1+0.8;
        this.note= quiz + exam;
        return note;

    }
    double noteCalcC2(double quiz2, double exam2){
        this.quiz = quiz2*0.3;
        this.exam = exam2*0.7;
        this.note = quiz + exam;
        return note;}
    double noteCalcC3(double quiz3, double exam3){
        this.quiz = quiz3*0.3;
        this.exam = exam3*0.7;
        this.note = quiz + exam;
        return note;}


}
