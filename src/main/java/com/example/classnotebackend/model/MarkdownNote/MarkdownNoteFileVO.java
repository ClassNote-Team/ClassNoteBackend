package com.example.classnotebackend.model.MarkdownNote;

public class MarkdownNoteFileVO {
    private String filename;
    private Long updateTime;

    public static MarkdownNoteFileVO of(MarkdownNotePO po) {
        MarkdownNoteFileVO vo = new MarkdownNoteFileVO();
        vo.filename = po.getFilename();
        vo.updateTime = po.getUpdateTime();
        return vo;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }
}
