package com.example.cashlez.springredistest.model;

import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Size;
import java.io.Serializable;
import java.text.DateFormat;

public class Book implements Serializable {

    private static final long serialVersionUID = 1L;
    private static long longId = 100;

    private String id;

    @NotEmpty
    @Size(min = 5, max = 100)
    private String name;

    @NotEmpty
    private String publisher;

    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private DateFormat dateOfPublication;

    private String description;

    private String photo;

    public static String generateNextId() {
        return String.valueOf(longId++);
    }

    public static long getLongId() {
        return longId;
    }

    public static void setLongId(long longId) {
        Book.longId = longId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public DateFormat getDateOfPublication() {
        return dateOfPublication;
    }

    public void setDateOfPublication(DateFormat dateOfPublication) {
        this.dateOfPublication = dateOfPublication;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
