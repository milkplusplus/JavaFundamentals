package javase04.t01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

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

    public static void findWords(String pathFrom, String pathTo) {
        byte[] bytesBuff;
        int bytesAvlbl = 0;
        int overallCounter = 0;


        try (FileInputStream in = new FileInputStream(pathFrom); FileOutputStream out = new FileOutputStream(pathTo)) {
            while((bytesAvlbl = in.available()) != 0) {

                bytesBuff = new byte[bytesAvlbl];
                in.read(bytesBuff, 0, bytesAvlbl);
                String[] buffArray = new String(bytesBuff).split("\\s+");


                for (int i = 0; i < JAVA_WORDS.length; i++) {
                    int localCounter = 0;
                    for (String buff : buffArray) {
                        if (JAVA_WORDS[i].equals(buff))
                            localCounter++;
                    }
                    if (localCounter > 0) {
                        out.write(String.format("%s %d \n", JAVA_WORDS[i], localCounter).getBytes("UTF-8"));
                        overallCounter += localCounter;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

