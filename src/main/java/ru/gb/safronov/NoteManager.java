package ru.gb.safronov;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class NoteManager {
    private String filePath;

    public NoteManager(String filePath) {
        this.filePath = filePath;
    }

    public void saveNote(Note note) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(note.toString());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}