package com.codegym.service.impl;

import com.codegym.model.Note_Type;
import com.codegym.service.Note_TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class Note_TypeServiceImpl implements Note_TypeService {

    @Autowired
    private Note_TypeService note_typeService;

    @Override
    public Page<Note_Type> findAll(Pageable pageable) {
        return note_typeService.findAll(pageable);
    }

    @Override
    public Note_Type findById(Long id) {
        return note_typeService.findById(id);
    }

    @Override
    public void save(Note_Type note_type) {
        note_typeService.save(note_type);
    }

    @Override
    public void remove(Long id) {
        note_typeService.remove(id);
    }
}
