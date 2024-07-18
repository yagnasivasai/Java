import static java.lang.Math.*;
// import java.io.*;

public class staticimport {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println(sqrt(190000));
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("elapsedTime is " + elapsedTime);
        long startTime2 = System.currentTimeMillis();
        System.out.println(Math.sqrt(190000));
        long stopTime2 = System.currentTimeMillis();
        long elapsedTime2 = stopTime2 - startTime2;
        System.out.println("elapsedTime is " + elapsedTime2);
    }
}
