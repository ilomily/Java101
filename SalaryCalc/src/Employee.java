public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        }
    double tax(){

        double tax;
        if(this.salary<1000){
            tax = 0;
            return tax;
        }else
            tax = this.salary * 0.03;
            return tax;

        }


    double bonus(){
        int bonus;
        if(this.workHours>40){
           return ((this.workHours - 40)*30);

        }else
            return bonus =0;

    }
    public double raiseSalary() {
        int workingYears = 2021 - this.hireYear;

        if (workingYears < 10) {
            return (this.salary * 0.05);
        } else if ((workingYears >= 9) && (2021 - this.hireYear < 20)) {
            return (this.salary * 0.1);
        } else if (workingYears > 19) {
            return (this.salary * 0.15);
        }
        return 0;

    }

    void write(){
            System.out.println("Adı: " + this.name);
            System.out.println("Maaşı: " + this.salary);
            System.out.println("Çalışma Saati: " + this.workHours);
            System.out.println("Başlangıç yılı: " + this.hireYear);
            System.out.println("Vergi: " + tax());
            System.out.println("Bonus: " + bonus());
            System.out.println("Maaş artışı: " + raiseSalary());
            System.out.println("Vergi ve bonuslar ile maaş: " + (this.salary - tax() + bonus()));
            System.out.println("Toplam maaş: " + (this.salary + raiseSalary()));
        }
    }



