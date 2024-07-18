import java.util.Date;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import java.sql.*;
public class date {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d.getClass().getName());
        // Logger l = new LogRecord(null, null)
        java.sql.Date sd = new java.sql.Date(0);
        System.out.println(sd.getClass().getName());
    }
}
