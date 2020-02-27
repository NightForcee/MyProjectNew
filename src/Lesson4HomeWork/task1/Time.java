package Lesson4HomeWork.task1;

public class Time {
    int hour;
    int min;
    int seconds;

    public Time(int setTime) {
        if (setTime < 0) {
            setTime = 0;
        }
        this.hour = setTime / 3600;
        this.min = (setTime % 3600) / 60;
        this.seconds = setTime % 60;
    }

    public int allSeconds() {
        return (hour * 60) * 60 + min * 60 + seconds;
    }

    public void printTime() {
        System.out.println("Вы ввели :" + "\n" + hour + "ч " + min + "м " + seconds + "с ");
    }

    public static void main(String[] args) {
        Time time1 = new Time(5555);

        time1.printTime();
        System.out.println(time1.allSeconds() + " секунд");
    }
}







