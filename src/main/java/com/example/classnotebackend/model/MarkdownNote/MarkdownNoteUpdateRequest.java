package com.example.classnotebackend.model.MarkdownNote;

import java.util.List;

public class MarkdownNoteUpdateRequest {
    private String content;
    private List<String> base64Images;

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setBase64Images(List<String> base64Images) {
        this.base64Images = base64Images;
    }

    public List<String> getBase64Images() {
        return base64Images;
    }
}
