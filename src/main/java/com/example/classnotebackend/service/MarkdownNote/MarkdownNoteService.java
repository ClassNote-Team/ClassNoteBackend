package com.example.classnotebackend.service.MarkdownNote;

import com.example.classnotebackend.Repository.MarkdownNote.MarkdownNoteRepository;
import com.example.classnotebackend.exception.NotFoundException;
import com.example.classnotebackend.model.MarkdownNote.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MarkdownNoteService {

    @Autowired
    private MarkdownNoteRepository markdownNoteRepository;


    public List<MarkdownNoteFileVO> getMarkdownNoteFileListVO(String userId) {
        List<MarkdownNotePO> notes = markdownNoteRepository.findByUserId(userId);

        return notes.stream()
                .map(MarkdownNoteFileVO::of)
                .sorted((vo1, vo2) -> Long.compare(vo2.getUpdateTime(), vo1.getUpdateTime()))
                .collect(Collectors.toList());
    }


    public MarkdownNoteVO getMarkdownNoteVO(String id) {
        MarkdownNotePO po = getMarkdownNotePO(id);
        return MarkdownNoteVO.of(po);
    }

    public MarkdownNotePO createMarkdownNotePO(MarkdownNoteCreateRequest request) {
        MarkdownNotePO po = MarkdownNotePO.of(request);
        return markdownNoteRepository.insert(po);
    }

    public void updateMarkdownNotePO(String id, MarkdownNoteUpdateRequest request) {
        MarkdownNotePO po = getMarkdownNotePO(id);
        po.setBase64Images(request.getBase64Images());
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
