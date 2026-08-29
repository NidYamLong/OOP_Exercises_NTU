package time_class;

/**
 *  @Author Leonardo Marques - 29/08/2026
*/

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public  void setTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    @Override
    public String toString() {
        return String.format("%s:%s:%s",
                validateFormatTime(getHour()),
                validateFormatTime(getMinute()),
                validateFormatTime(getSecond())
            );
    }

    public Time nextSecond() {
        setSecond(getSecond() + 1);
        
       if (getSecond() >= 60) {
        setSecond(0);
        setMinute(getMinute() + 1);

       } 
       
       if (getMinute() >= 60) {
        setMinute(0);
        setHour(getHour() + 1);

       } 
       
       if (getHour() >= 24) {
        setHour(0);
       }

        return this;
    }

    public Time previousSecond() {
        if (getSecond() == 0) {
            setSecond(60);
            if(getMinute() == 0) {
                setMinute(60);
                setMinute(getMinute() - 1);
                if(getHour() == 0) {
                    setHour(24);
                    setHour(getHour() - 1);
                }
            }
        }

        setSecond(getSecond() - 1);
        
        return this;
    }

    private String validateFormatTime(int time) {
        return (time < 10) ? "0" + Integer.toString(time): Integer.toString(time);
    }
}
