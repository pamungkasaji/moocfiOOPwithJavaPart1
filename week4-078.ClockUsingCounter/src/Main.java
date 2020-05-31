import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner reader = new Scanner(System.in);
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        System.out.print("seconds: ");
        int s = Integer.parseInt(reader.nextLine());
                System.out.print("minutes: ");
        int m = Integer.parseInt(reader.nextLine());
                System.out.print("hours: ");
        int h = Integer.parseInt(reader.nextLine());

        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);

        int i = 0;
        while ( i < 121 ) {
            System.out.println( hours + ":" + minutes + ":" + seconds);   // the current time printed
            seconds.next();
            if(seconds.getValue() == 0){
                minutes.next();
                if(minutes.getValue() == 0){
                    hours.next();
                }
            }
            i++;
        }
    }
}

//public class Main {
//    public static void main(String[] args) throws Exception {
//        BoundedCounter seconds = new BoundedCounter(59);
//        BoundedCounter minutes = new BoundedCounter(59);
//        BoundedCounter hours = new BoundedCounter(23);
//
//        seconds.setValue(50);
//        minutes.setValue(59);
//        hours.setValue(23);
//
//        while ( true ) {
//            System.out.println( hours + ":" + minutes + ":" + seconds );
//            Thread.sleep(1000);
//            // put here the logic to advance your clock by one second
//            seconds.next();
//            if(seconds.getValue() == 0){
//                minutes.next();
//                if(minutes.getValue() == 0){
//                    hours.next();
//                }
//            }
//        }
//    }
//}
