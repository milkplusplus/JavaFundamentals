package javase03.t03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressWarnings("WeakerAccess")
public class Parser {

    public static StringBuilder getFileContent(String path) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(path),
                "Windows-1251"))) {
            while (bufferedReader.ready())
                content.append((char)bufferedReader.read());
            System.out.println("Load was successful");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }

    // also the task says that i need to do method which should determine
    // "ссылается ли автор на рисунки последовательно или нет", but i don't understand what it mean
    @SuppressWarnings("SingleCharAlternation")
    public static LinkedList<String> getPicRefers(StringBuilder content) {
        LinkedList<String> list = new LinkedList<>();
        Pattern p = Pattern.compile("[А-ЯA-Z]([«»\\wа-яёА-Я\\d-();&,\\s]*(([Рр]ис(ун(ке|кам|ках|ком|ками|ок|ки|ку|ка)|\\.))(\\d|\\s\\d)))+[«»\\w;&а-яёА-Я\\d-(),\\s]*(\\.|!|\\?)");
        Matcher m = p.matcher(content);
        while (m.find())
            list.add(m.group());
        return list;
    }

    public static void main(String[] args) {
        LinkedList<String> list = Parser.getPicRefers(
                getFileContent("src/main/resources/Java.SE.03.Information handling_task_attachment.html"));
        for (String i: list)
            System.out.println(i);
    }
}