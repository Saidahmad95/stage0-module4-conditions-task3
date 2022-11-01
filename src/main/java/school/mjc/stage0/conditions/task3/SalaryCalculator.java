package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        float salary1=salary;
        if (salary1<0) {
            System.out.println("wrong input!");
            return;
        } else if (salary1 <= 10000) {
            salary1 =salary1- (salary1 * 15)/100;
        } else if (salary1 <= 20000) {
            salary1 =salary1- (salary1 * 18) / 100;
        } else {
            salary1 =salary1- (salary1 * 20) / 100;
        }
        System.out.println(salary1);
    }
}

