package ru.gb.safronov;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NoteManager noteManager = new NoteManager("notes.txt");

        System.out.print("Введите заметку: ");
        String content = scanner.nextLine();

        Note note = new Note(content);
        noteManager.saveNote(note);

        System.out.println("Дозапись в файл: " + note);
    }
}