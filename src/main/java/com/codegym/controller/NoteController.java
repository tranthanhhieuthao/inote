package com.codegym.controller;


import com.codegym.model.Note;
import com.codegym.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NoteController {
    @Autowired
    private NoteService noteService;

    @GetMapping("/")
    public ModelAndView listNote(Pageable pageable){
        Page<Note> notes =noteService.findAll(pageable);
        ModelAndView modelAndView = new ModelAndView("/Note/index");
        modelAndView.addObject("inote",notes);
        return modelAndView;
    }
}
