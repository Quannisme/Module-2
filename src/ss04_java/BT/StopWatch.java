package ss04_java.BT;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class StopWatch {
    private long startTime, endTime;

    public long getStartTime() {
        return this.startTime;
    }

    public long getEndTime() {
        return this.endTime;
    }

    StopWatch() {
        this.startTime = (new Date()).getTime();
    }

    public void Star() {
        this.startTime = (new Date()).getTime();

    }

    public void Stop() {
        this.endTime = (new Date()).getTime();
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }

    public static void main(String[] args) {
        StopWatch sw = new StopWatch();
        Scanner sc = new Scanner(System.in);
        System.out.println("do you want to stop");
        String str = sc.nextLine();
        sw.Stop();
        System.out.println(sw.getElapsedTime());
    }
}
