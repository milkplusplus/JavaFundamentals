package javase03.t01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;

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
            stringBuilder.append(String.format("%s - %s; \n",
                    LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-YYYY : HH-mm")),
                    message));
    }

    public LinkedList<String> searchContains(String target) {
        LinkedList<String> searched = new LinkedList<>();
        String [] strings = stringBuilder.toString().split("\n");
        for (String i: strings)
            if (i.contains(target))
                searched.add(i);
        return searched;
    }

    public LinkedList<String> searchExactMatch(String target) {
        LinkedList<String> searched = new LinkedList<>();
        String [] strings = stringBuilder.toString().split("\n");

        return searched;
    }
}
