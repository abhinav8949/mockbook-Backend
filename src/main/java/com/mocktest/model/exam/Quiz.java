package com.mocktest.model.exam;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "quiz")
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;
    private String maxMarks;
    private String numberOfQuestions;
    private String image;
    private boolean active=false;

    @ManyToOne(fetch = FetchType.EAGER)
    private Category category;

    @OneToMany(mappedBy = "quiz", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Question> questions=new HashSet<>();

    public Quiz() {
    }

    public Quiz(Long id, String title, String description, String maxMarks, String numberOfQuestions, String image, boolean active, Category category, Set<Question> questions) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.maxMarks = maxMarks;
        this.numberOfQuestions = numberOfQuestions;
        this.image = image;
        this.active = active;
        this.category = category;
        this.questions = questions;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMaxMarks() {
        return maxMarks;
    }

    public void setMaxMarks(String maxMarks) {
        this.maxMarks = maxMarks;
    }

    public String getNumberOfQuestions() {
        return numberOfQuestions;
    }

    public void setNumberOfQuestions(String numberOfQuestions) {
        this.numberOfQuestions = numberOfQuestions;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Set<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(Set<Question> questions) {
        this.questions = questions;
    }

    @Override
    public String toString() {
        return "Quiz{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", maxMarks='" + maxMarks + '\'' +
                ", numberOfQuestions='" + numberOfQuestions + '\'' +
                ", image='" + image + '\'' +
                ", active=" + active +
                ", category=" + category +
                ", questions=" + questions +
                '}';
    }
}
