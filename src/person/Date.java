package person;

public class Date {
    private byte hour;
    private byte minute;
    private byte second;

    public Date(byte hour, byte minute, byte second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public Date(){

    }

    public byte getHour() {
        return hour;
    }

    public byte getMinute() {
        return minute;
    }

    public byte getSecond() {
        return second;
    }

    public void setHour(byte hour) {
        this.hour = hour;
    }

    public void setMinute(byte minute) {
        this.minute = minute;
    }

    public void setSecond(byte second) {
        this.second = second;
    }

    public void nextSecond(){
        int sec = this.second + 1;
        int min = this.minute;
        int hou = this.hour;
        if (sec == 60){
            min = min+1;
            if (min == 60){
                hou = hou +1;
                if (hou == 24){
                    System.out.print(0 + "" + 0 + "/");
                }else{
                    System.out.print(hou +"/");
                }
                System.out.print(0 + "" + 0 + "/");
            }else {
                System.out.print(hou +"/");
                System.out.print(min +"/");
            }
            System.out.print(0 + "" + 0 );
        }else {
            System.out.print(hou + "/");
            System.out.print(min + "/");
            System.out.print(sec);

        }

    }

}
