package javase04.t01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

@SuppressWarnings({"WeakerAccess", "UnusedReturnValue"})
public class WordHunterByStream {

    static final String[] JAVA_WORDS = {
            "abstract", "assert", "boolean", "break", "byte",
            "case", "catch", "char", "class", "const",
            "continue", "default", "do", "double", "else",
            "enum", "extends", "final", "finally", "float",
            "for", "goto", "if", "implements", "import",
            "instanceof", "int", "interface", "long", "native",
            "new", "package", "private", "protected", "public",
            "return", "short", "static", "strictfp", "super",
            "switch", "synchronized", "this", "throw", "throws",
            "transient", "try", "void", "volatile", "while"};

    @SuppressWarnings("ResultOfMethodCallIgnored")
    public static int findWords(String pathFrom, String pathTo) {
        byte[] buffBytes;
        int bytesAvlbl;
        int overallCounter = 0;
        try (FileInputStream in = new FileInputStream(pathFrom); FileOutputStream out = new FileOutputStream(pathTo)) {
            while((bytesAvlbl = in.available()) != 0) {
                buffBytes = new byte[bytesAvlbl];
                in.read(buffBytes, 0, bytesAvlbl);
                String[] buffStrings = new String(buffBytes).split("((\\s)|\\[|\\(|\\))+");
                for (String JAVA_WORD : JAVA_WORDS) {
                    int localCounter = 0;
                    for (String string : buffStrings) {
                        if (JAVA_WORD.equals(string))
                            localCounter++;
                    }
                    if (localCounter > 0) {
                        out.write(String.format("%s %d \n", JAVA_WORD, localCounter).getBytes("UTF-8"));
                        overallCounter += localCounter;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return overallCounter;
    }
}

