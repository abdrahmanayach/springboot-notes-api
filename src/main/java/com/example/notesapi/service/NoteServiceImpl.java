package com.example.notesapi.service;

import com.example.notesapi.model.Note;
import com.example.notesapi.repository.NoteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteServiceImpl implements NoteService {
    private final NoteRepository noteRepository;

    public NoteServiceImpl(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @Override
    public Note createNote(Note note) {
        return noteRepository.save(note);
    }

    @Override
    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }

    @Override
    public Note getNoteById(Long id) {
        return noteRepository.findById(id).orElseThrow(() -> new RuntimeException("Note not found"));
    }

    @Override
    public Note updateNote(Long id, Note note) {
        Note n = noteRepository.findById(id).orElseThrow(() -> new RuntimeException("Note not found"));
        n.setTitle(note.getTitle());
        n.setContent(note.getContent());
        return noteRepository.save(n);
    }

    @Override
    public void deleteNoteById(Long id) {
        if(!noteRepository.existsById(id)) {
            throw new RuntimeException("Note not found");
        }
        noteRepository.deleteById(id);
    }
}
