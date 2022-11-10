package person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Date date = new Date((byte) input.nextInt(), (byte) input.nextInt() , (byte) input.nextInt());
        System.out.print(date.getHour() + "/" +date.getMinute() + "/" + date.getSecond() + "\n");
        date.nextSecond();

    }
}
