
package ru.gb.safronov;

import java.time.LocalDateTime;

public class Note {
    private String content;
    private LocalDateTime timestamp;

    public Note(String content) {
        this.content = content;
        this.timestamp = LocalDateTime.now();
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return timestamp + " -> " + content;
    }
}
