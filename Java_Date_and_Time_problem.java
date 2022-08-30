import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {
    
    public static String findDay(int month, int day, int year) {
     String daytosee[] = {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
        Calendar cal = Calendar.getInstance();
        cal.set(year, month-1, day);
        int dayno = cal.get(Calendar.DAY_OF_WEEK);
        return daytosee[dayno-1];
    }

}

