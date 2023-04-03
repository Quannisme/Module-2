package ss04_java.BT;

import java.time.LocalDate;
import java.util.Date;

public class StopWatch {
    private long startTime,endTime;
    public long getStartTime()
    {
        return this.startTime;
    }
    public long getEndTime()
    {
        return this.endTime;
    }
    StopWatch()
    {
        this.startTime=(new Date()).getTime();
    }
    public void Star()
    {
        this.startTime=(new Date()).getTime();

    }
    public void Stop()
    {
        this.endTime=(new Date()).getTime();
    }
    public long getElapsedTime()
    {
        return this.endTime-this.startTime;
    }
}
