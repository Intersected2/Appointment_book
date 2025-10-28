import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
public class main {
    public static void main (String[]args){
        boolean[][] schedule = new boolean[8][60];
        AppointmentBook a = new AppointmentBook(schedule);
        for (int i = 25; i < 30; i++) schedule[2][i] = true;
        for (int i = 0; i < 15; i++) schedule[2][i] = true;
        for (int i = 41; i < 60; i++) schedule[2][i] = true;
        for (int i = 5; i < 30; i++) schedule[3][i] = true;
        for (int i = 44; i < 60; i++) schedule[3][i] = true;
        a.printPeriod(2);
        System.out.println(a.findFreeBlock(2,15));
        System.out.println(a.findFreeBlock(2,9));
        System.out.println(a.findFreeBlock(2,20));
        AppointmentBook b = new AppointmentBook(schedule);
        int period = 2;
        while (period < 5){
            System.out.println("Period " + period);
            b.printPeriod(period);
            period++;
        }
        b.printPeriod(4);
        System.out.println(b.makeAppointment(2,4,22));
        System.out.println(b.makeAppointment(3,4,3));
        System.out.println(b.makeAppointment(2,4,30));
        b.printPeriod(4);
    }
    public static int read() throws FileNotFoundException {
        int numofschedulesreserved;
        AppointmentBook[] books = new AppointmentBook[1000];
        File f = new File("Schedules.txt");
        Scanner s = new Scanner(f);
        int index = 0;
        while (s.hasNextLine()) {
            boolean[][] schedules = new boolean[8][60];
            for (int i = 0; i < 60; i++){
                boolean x = s.nextBoolean();
                boolean print = s.nextBoolean();
                System.out.println(print);

            }
        }
        return 0;
    }
}