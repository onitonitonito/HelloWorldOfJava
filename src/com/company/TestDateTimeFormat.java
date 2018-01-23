package com.company;

import java.util.Calendar;

public class TestDateTimeFormat {
    /**
     * Calendar 사용예제 참조 : https://goo.gl/Pq8FvF
     * @param args
     */

    public static void timeDifferCalculate() {
        /**
         * JAVA 칼랜다 사용사례 2: https://goo.gl/2StFfo
         */
        final int[] TIME_UNIT = {3600, 60, 1}; // 큰 단위를 앞에 놓는다.
        final String[] TIME_UNIT_NAME = {"시간 ", "분 ", "초"};

        Calendar time1 = Calendar.getInstance();
        Calendar time2 = Calendar.getInstance();

        // time1의 시간을 10시 20분 30초로 설정한다.
        time1.set(Calendar.HOUR_OF_DAY, 10);
        time1.set(Calendar.MINUTE, 20);
        time1.set(Calendar.SECOND, 30);

        // time2의 시간을 20시 30분 10초로 설정한다.
        time2.set(Calendar.HOUR_OF_DAY, 20);
        time2.set(Calendar.MINUTE, 30);
        time2.set(Calendar.SECOND, 10);

        System.out.println("time1 :"+time1.get(Calendar.HOUR_OF_DAY)+"시 " +
                time1.get(Calendar.MINUTE) +"분 " + time1.get(Calendar.SECOND) + "초");
        System.out.println("time2 :"+time2.get(Calendar.HOUR_OF_DAY)+"시 " +
                time2.get(Calendar.MINUTE) +"분 " + time2.get(Calendar.SECOND) + "초");

        long difference = Math.abs(time2.getTimeInMillis() - time1.getTimeInMillis())/1000;
        System.out.println("time1과 time2의 차이는 "+ difference +"초 입니다.");

        String tmp = "";
        for(int i=0; i < TIME_UNIT.length;i++) {
            tmp += difference/TIME_UNIT[i]+ TIME_UNIT_NAME[i];
            difference %= TIME_UNIT[i];
        }

        System.out.println("시분초로 변환하면 " + tmp + "입니다.");

    }

    public static void dateTimeFormat() {

        Calendar cal = Calendar.getInstance();

      String[] months = {"January", "February","March","April","May","Jun",
              "July", "August", "September", "October", "November", "December"};
      String[] weeks = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

      int year = cal.get(Calendar.YEAR);
      int monthOfNumber = cal.get(Calendar.MONTH);    // index number (position)
      int day = cal.get(Calendar.DAY_OF_MONTH);
      int weekNumbers = cal.get(Calendar.DAY_OF_WEEK);  //1=Sun~ 7=Sat
      int amPmNumber = cal.get(Calendar.AM_PM);
      int hour = cal.get(Calendar.HOUR);
      int minute = cal.get(Calendar.MINUTE);
      int second = cal.get(Calendar.SECOND);
      int millisecond = cal.get(Calendar.MILLISECOND);

      String amPm = amPmNumber == '0' ? "AM":"PM";
      String week = weeks[weekNumbers-1];

      System.out.println("Using, Calendar Utility : Datetime Format!\n");
      System.out.printf("%s %sth.(%s), %s.\n", months[0], day, week, year);
      System.out.printf("%s. %s:%s:%s:%s \n", amPm, hour, minute, second, millisecond);
    }

    public static void showSeasonOfFour()  {

        Calendar cal = Calendar.getInstance();

        int monthOfNumber = cal.get(Calendar.MONTH);     // Index # of 0~11

        String season = "";

        switch (monthOfNumber+1)  {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
        }

        System.out.printf("This season %s is %s \n", monthOfNumber+1, season);
    }

    public static void main(String[] args)  {

      showSeasonOfFour();

      timeDifferCalculate();

      dateTimeFormat();
    }

}
