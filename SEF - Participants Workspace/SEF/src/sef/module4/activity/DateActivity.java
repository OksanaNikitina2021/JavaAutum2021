package sef.module4.activity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateActivity {

    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date currentDate = new Date();
        System.out.println(formatter.format(currentDate));

        //another option to print the date
        System.out.println(currentDate);

    }
}


