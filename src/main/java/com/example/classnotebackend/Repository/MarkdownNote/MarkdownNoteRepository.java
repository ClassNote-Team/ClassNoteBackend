package com.example.classnotebackend.Repository.MarkdownNote;

import com.example.classnotebackend.model.MarkdownNote.MarkdownNoteFileVO;
import com.example.classnotebackend.model.MarkdownNote.MarkdownNotePO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MarkdownNoteRepository extends MongoRepository<MarkdownNotePO, String> {
    List<MarkdownNotePO> findByUserId(String userId);
}
