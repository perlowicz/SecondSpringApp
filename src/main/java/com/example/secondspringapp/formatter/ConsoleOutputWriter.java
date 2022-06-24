package com.example.secondspringapp.formatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsoleOutputWriter {

    private final TextFormatter textFormatter;

    public void println(String text){
        String format = textFormatter.format(text);
        System.out.println(format);
    }

    @Autowired
    ConsoleOutputWriter(TextFormatter textFormatter){
        this.textFormatter = textFormatter;
    }
}
