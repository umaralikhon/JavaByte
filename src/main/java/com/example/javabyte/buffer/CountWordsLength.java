package com.example.javabyte.buffer;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class CountWordsLength {
    public void readFile() throws IOException {
        var content = new String(Files.readAllBytes(Paths.get("C:\\Users\\umara\\Documents\\Pinger.docx")),
                StandardCharsets.UTF_8);
        List<String> words = Arrays.asList(content.split("\\PL+"));

//        for (String s : words) {
//            if (s.length() > 12) {
//                System.out.println(s);
//            }
//        }

        String count = String.valueOf(words.stream().filter(s -> s.length()>5));
        System.out.println(count);
    }
}
