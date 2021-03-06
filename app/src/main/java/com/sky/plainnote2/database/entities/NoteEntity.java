package com.sky.plainnote2.database.entities;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "tbl_notes")
public class NoteEntity {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String name;
    private String text;
    private Date date;
    private Password password;

    public NoteEntity() {
        date = new Date(System.currentTimeMillis());
    }

    @Ignore
    public NoteEntity(String name, String text, Date date) {
        this.name = name;
        this.text = text;
        this.date = date;
    }

    @Ignore
    public NoteEntity(int id, String name, String text, Date date) {
        this.id = id;
        this.name = name;
        this.text = text;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDateToCurrent(long timeStamp) {
        date = new Date(timeStamp);
    }

    public Password getPassword() {
        return password;
    }

    public void setPassword(Password password) {
        this.password = password;
    }

    @NonNull
    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", text='" + text + '\'' +
                ", date=" + date +
                '}';
    }
}