package com.example.classnotebackend.Repository;

import com.example.classnotebackend.model.MarkdownNotePO;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarkdownNoteRepository extends MongoRepository<MarkdownNotePO, String> {
}
