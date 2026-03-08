package com.example.notesapi.service;

import com.example.notesapi.model.Note;

import java.util.List;

public interface NoteService {
    Note createNote(Note note);
    List<Note> getAllNotes();
    Note getNoteById(Long id);
    Note updateNote(Long id, Note note);
    void deleteNoteById(Long id);
}
