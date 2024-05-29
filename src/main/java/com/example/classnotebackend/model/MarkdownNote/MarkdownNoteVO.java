package com.example.classnotebackend.model.MarkdownNote;

import java.util.List;

public class MarkdownNoteVO {
    private String id;
    private String filename;
    private String content;
    private long createTime;
    private long updateTime;
    private String userId;
    private List<String> base64Images;

    public static MarkdownNoteVO of(MarkdownNotePO po) {
        MarkdownNoteVO vo = new MarkdownNoteVO();
        vo.id = po.getId();
        vo.filename = po.getFilename();
        vo.content = po.getContent();
        vo.createTime = po.getCreateTime();
        vo.updateTime = po.getUpdateTime();
        vo.userId = po.getUserId();
        vo.base64Images = po.getBase64Images();
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

    public void setBase64Images(List<String> base64Images) {
        this.base64Images = base64Images;
    }

    public List<String> getBase64Images() {
        return base64Images;
    }
}
