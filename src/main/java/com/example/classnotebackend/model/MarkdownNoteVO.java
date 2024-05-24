package com.example.classnotebackend.model;

public class MarkdownNoteVO {
    private String id;
    private String filename;
    private String content;
    private String[] imgUrls;
    private long createTime;
    private long updateTime;
    private String userId;
    private String username;

    public static MarkdownNoteVO of(MarkdownNotePO po) {
        MarkdownNoteVO vo = new MarkdownNoteVO();
        vo.id = po.getId();
        vo.filename = po.getFilename();
        vo.content = po.getContent();
        vo.createTime = po.getCreateTime();
        vo.updateTime = po.getUpdateTime();
        vo.userId = po.getUserId();
        vo.imgUrls = po.getImgUrls();
        return vo;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }

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

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }

    public long getUpdateTime() {
        return updateTime;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setImgUrls(String[] imgUrls) {
        this.imgUrls = imgUrls;
    }

    public String[] getImgUrls() {
        return imgUrls;
    }
}
