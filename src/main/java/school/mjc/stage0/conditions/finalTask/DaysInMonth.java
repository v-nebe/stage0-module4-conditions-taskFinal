package school.mjc.stage0.conditions.finalTask;

import java.time.Year;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if(month>=1 && month<=12 && year>0){
            switch (month){
                case 1, 3, 5, 7, 8, 10, 12:
                    System.out.println(31);
                case 4, 6, 9, 11:
                    System.out.println(30);
                case 2:
                    if(year % 4 == 0)
                        System.out.println(29);
                    else
                        System.out.println(28);
            }
        }
        else
            System.out.println("invalid date");

    }
}
