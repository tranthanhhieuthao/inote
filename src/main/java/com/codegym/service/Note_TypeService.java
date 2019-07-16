package com.codegym.service;

import com.codegym.model.Note_Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface Note_TypeService {

    Page<Note_Type> findAll(Pageable pageable);

    Note_Type findById(Long id);

    void save(Note_Type note_type);

    void remove(Long id);
}
