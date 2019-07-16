package com.codegym.model;

import javax.persistence.*;

@Entity
@Table(name = "note")
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String title;
    private String content;

    public Note_Type getNote_type() {
        return note_type;
    }

    public void setNote_type(Note_Type note_type) {
        this.note_type = note_type;
    }

    @ManyToOne
    @JoinColumn(name = "Note_type_id")
    private Note_Type note_type;

    public Note(){
    }

    public Note(String title){
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
