package com.example.classnotebackend.model.MarkdownNote;

public class MarkdownNoteUpdateRequest {
    private String filename;
    private String content;

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
