package com.example.classnotebackend.controller;

import com.example.classnotebackend.model.MarkdownNote.*;
import com.example.classnotebackend.service.MarkdownNote.MarkdownNoteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/markdown")
public class MarkdownNoteController {

    @Autowired
    private MarkdownNoteService markdownNoteService;

    @GetMapping("/fileList/{userId}")
    public ResponseEntity<List<MarkdownNoteFileVO>> getHello(@PathVariable("userId") String userId){
        List<MarkdownNoteFileVO> vo = markdownNoteService.getMarkdownNoteFileListVO(userId);
        return ResponseEntity.ok(vo);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MarkdownNoteVO> getFile(@PathVariable("id") String id){
        MarkdownNoteVO vo =  markdownNoteService.getMarkdownNoteVO(id);
        return ResponseEntity.ok(vo);
    }

    @PostMapping
    public ResponseEntity<Void> createFile(@RequestBody MarkdownNoteCreateRequest request){
        MarkdownNotePO po = markdownNoteService.createMarkdownNotePO(request);
        URI uri = URI.create("/markdown/" + po.getId());
        return ResponseEntity.created(uri).build();
    }


    @PutMapping("/{id}")
    public ResponseEntity<Void> updateFile(@PathVariable("id") String id, @RequestBody MarkdownNoteUpdateRequest request){
        markdownNoteService.updateMarkdownNotePO(id, request);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFile(@PathVariable("id") String id){
        markdownNoteService.deleteMarkdownNotePOById(id);
        return ResponseEntity.noContent().build();
    }

}
