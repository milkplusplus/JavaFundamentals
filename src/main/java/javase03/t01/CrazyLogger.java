package javase03.t01;


import java.time.LocalDate;

public class CrazyLogger {

    StringBuilder stringBuilder = new StringBuilder();

    public StringBuilder getStringBuilder() {
        return stringBuilder;
    }

    public void printLog() {
        System.out.println(stringBuilder);
    }

    public void addMess(String message) {
        if (null != message)
            stringBuilder.append(String.format("%s - %s", LocalDate.now(), message));
    }


}
