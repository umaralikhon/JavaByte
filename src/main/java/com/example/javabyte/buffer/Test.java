package com.example.javabyte.buffer;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Test {
    public void readFile() throws IOException {
        var content = new String(Files.readAllBytes(Paths.get("C:\\Users\\umara\\Downloads\\Telegram Desktop\\Leaders_Eat_Last__Why_Some_Teams.pdf")),
                StandardCharsets.UTF_8);
        List<String> words = Arrays.asList(content.split("\\PL+"));

        int count = 0;
        for (String s : words) {
            if (s.length() > 12) {
                System.out.println(s);
            }
        }

    }
}
