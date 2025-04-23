package ex.ch11.ex15;

import java.util.Calendar;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH);
        int day = now.get(Calendar.DAY_OF_WEEK);

        int week = now.get(Calendar.DAY_OF_WEEK);
        String weekday = null;
        if(week == Calendar.MONDAY){
            weekday = "Sunday";
        } else if(week==2){
            weekday = "Monday";
        } else if(week==3){
            weekday = "Tuesday";
        } else if(week==4){
            weekday = "Wednesday";
        } else if(week==5){
            weekday = "Thursday";
        } else if(week==6){
            weekday = "Friday";
        } else if(week==7){
            weekday = "Saturday";
        }
        int amPm = now.get(Calendar.AM_PM);
        String amPmString = null;
        if(amPm == Calendar.AM){
            amPmString = "오전";
        } else{
            amPmString = "오후";
        }

        int hour = now.get(Calendar.HOUR_OF_DAY);
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);

        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        System.out.println(weekday);
        System.out.println(amPmString);
        System.out.println(hour);
        System.out.println(minute);
        System.out.println(second);

    }
}