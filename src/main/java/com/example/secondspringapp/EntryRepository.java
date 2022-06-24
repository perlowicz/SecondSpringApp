package com.example.secondspringapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.*;

@Repository
public class EntryRepository {

    private List<Entry> entries;

    @Autowired
    EntryRepository(FileService fileService){
        try {
            this.entries = fileService.readAllFile();
        } catch (IOException e) {
            entries = new ArrayList<>();
        }
    }

    List<Entry> getAll(){
        return entries;
    }

    Set<Entry> getRandomEntries(int number) {
        Random random = new Random();
        Set<Entry> randomEntries = new HashSet<>();
        while (randomEntries.size() < number && randomEntries.size() < entries.size()) {
            randomEntries.add(entries.get(random.nextInt(entries.size())));
        }
        return randomEntries;
    }

    void add(Entry entry) {
        entries.add(entry);
    }

    int size(){
        return entries.size();
    }

    boolean isEmpty(){
        return entries.isEmpty();
    }
}
