package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        if (year>1584&&(year%400==0)||(year%4==0&&year%100!=0)){
            year=1;

        }else{
            year=2;

        }
        switch (year){
            case 1:
                System.out.println("leap"); break;
            case 2:
                System.out.println("not leap"); break;
        }

    }

    }

