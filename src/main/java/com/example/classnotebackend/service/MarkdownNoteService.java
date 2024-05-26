package com.example.classnotebackend.service;

import com.example.classnotebackend.Repository.MarkdownNoteRepository;
import com.example.classnotebackend.exception.NotFoundException;
import com.example.classnotebackend.model.MarkdownNoteCreateRequest;
import com.example.classnotebackend.model.MarkdownNotePO;
import com.example.classnotebackend.model.MarkdownNoteUpdateRequest;
import com.example.classnotebackend.model.MarkdownNoteVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

    @Service
public class MarkdownNoteService {

    @Autowired
    private MarkdownNoteRepository markdownNoteRepository;

    public MarkdownNoteVO getMarkdownNoteVO(String id) {
        MarkdownNotePO po = getMarkdownNotePO(id);
        MarkdownNoteVO vo = MarkdownNoteVO.of(po);
        vo.setUsername("test");
        return vo;
    }

    public MarkdownNotePO createMarkdownNotePO(MarkdownNoteCreateRequest request) {
        MarkdownNotePO po = MarkdownNotePO.of(request);
        return markdownNoteRepository.insert(po);
    }

    public void updateMarkdownNotePO(String id, MarkdownNoteUpdateRequest request) {
        MarkdownNotePO po = getMarkdownNotePO(id);
        po.setFilename(request.getFilename());
        po.setContent(request.getContent());
        po.setUpdateTime(System.currentTimeMillis());
        markdownNoteRepository.save(po);
    }


    public void deleteMarkdownNotePOById(String id) {
        markdownNoteRepository.deleteById(id);
    }

    private MarkdownNotePO getMarkdownNotePO(String id) {
        return markdownNoteRepository.findById(id).orElseThrow(() -> new NotFoundException("MarkdownNote not found"));
    }

}
