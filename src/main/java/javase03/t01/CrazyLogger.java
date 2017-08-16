package javase03.t01;



import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@SuppressWarnings("WeakerAccess")
public class CrazyLogger {

    private StringBuilder stringBuilder = new StringBuilder();

    public StringBuilder getStringBuilder() {
        return stringBuilder;
    }

    public void printLog() {
        System.out.println(stringBuilder);
    }

    public void addMess(String message) {
        if (null != message)
            stringBuilder.append(String.format("%s - %s",
                    LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-mm-YYYY : hh-mm")),
                    message));
    }


}
