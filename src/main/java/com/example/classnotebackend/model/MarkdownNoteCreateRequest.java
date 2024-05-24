package com.example.classnotebackend.model;

public class MarkdownNoteCreateRequest {
    private String filename;
    private String content;
    private String[] imgUrls;
    private String userId;

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

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setImgUrls(String[] imgUrls) {
        this.imgUrls = imgUrls;
    }

    public String[] getImgUrls() {
        return imgUrls;
    }
}
