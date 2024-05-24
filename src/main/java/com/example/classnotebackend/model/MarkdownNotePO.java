package com.example.classnotebackend.model;

import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "markdown_note")
public class MarkdownNotePO {
    private String id;
    private String filename;
    private String content;
    private String[] imgUrls;
    private long createTime;
    private long updateTime;
    private String userId;

    public static MarkdownNotePO of(MarkdownNoteCreateRequest request) {
        MarkdownNotePO po = new MarkdownNotePO();
        po.filename = request.getFilename();
        po.content = request.getContent();
        po.userId = request.getUserId();
        po.createTime = System.currentTimeMillis();
        po.updateTime = po.createTime;
        po.imgUrls = request.getImgUrls();
        return po;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setImgUrls(String[] imgUrls) {
        this.imgUrls = imgUrls;
    }

    public String[] getImgUrls() {
        return imgUrls;
    }

}
