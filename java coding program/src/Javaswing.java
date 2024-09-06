import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Javaswing {

    public static void main(String[] args) {

        Date currentDate = new Date();
        System.out.println("Current Date: " + currentDate);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String formattedDate = sdf.format(currentDate);
        System.out.println("Formatted Date: " + formattedDate);



    }}
