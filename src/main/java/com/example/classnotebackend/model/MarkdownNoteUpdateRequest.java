package com.example.classnotebackend.model;

public class MarkdownNoteUpdateRequest {
    private String filename;
    private String content;
    private String[] imgUrls;

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

    public void setImgUrls(String[] imgUrls) {
        this.imgUrls = imgUrls;
    }

    public String[] getImgUrls() {
        return imgUrls;
    }
}
