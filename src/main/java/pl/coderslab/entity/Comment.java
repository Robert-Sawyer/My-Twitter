package pl.coderslab.entity;

import javax.persistence.Entity;
import javax.persistence.PrePersist;
import java.time.LocalDateTime;

@Entity
public class Comment {

    private Long id;
    private User user;
    private Tweet tweet;
    private LocalDateTime created;
    private String text;


    @PrePersist
    public void setCreatedTime(){
        this.created = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Tweet getTweet() {
        return tweet;
    }

    public void setTweet(Tweet tweet) {
        this.tweet = tweet;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
