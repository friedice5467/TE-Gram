package com.techelevator.model;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

public class Post {

    private int postId;
    private int accountId;
    private String img;
    private String caption;
    private LocalDateTime postDate;
    private boolean privated;
    private List<Comment> comments;
    private int likesCount;

    public Post(){}

    public Post(int postId, int accountId, String img, String caption, LocalDateTime postDate, boolean privated, List<Comment> comments, int likesCount) {
        this.postId = postId;
        this.accountId = accountId;
        this.img = img;
        this.caption = caption;
        this.postDate = postDate;
        this.privated = privated;
        this.comments = comments;
        this.likesCount = likesCount;
    }

    //overloaded constructor without comments/liked/favorited/likescount? to allow add post method to work

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public LocalDateTime getPostDate() {
        return postDate;
    }

//    commenting this out for now to run front-end :)
    public void setPostDate(LocalDateTime postDate) {
        this.postDate = postDate;
    }

    public boolean isPrivated() {
        return privated;
    }

    public void setPrivated(boolean privated) {
        this.privated = privated;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public int getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(int likesCount) {
        this.likesCount = likesCount;
    }
}
