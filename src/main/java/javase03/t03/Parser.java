package javase03.t03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

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

    public static void main(String[] args) {
        StringBuilder stringBuilder = Parser.getFileContent("src/main/resources/Java.SE.03.Information handling_task_attachment.html");
        System.out.println(stringBuilder);
    }
}