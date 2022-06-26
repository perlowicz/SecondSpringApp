package com.example.secondspringapp;

import com.example.secondspringapp.formatter.TextFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsoleOutputWriter {

    private final TextFormatter textFormatter;

    @Autowired
    ConsoleOutputWriter(TextFormatter textFormatter){
        this.textFormatter = textFormatter;
    }

    public void println(String text){
        String formattedText = textFormatter.format(text);
        System.out.println(formattedText);
    }
}
