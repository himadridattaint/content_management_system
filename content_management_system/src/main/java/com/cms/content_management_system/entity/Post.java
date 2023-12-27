package com.cms.content_management_system.entity;

import jakarta.persistence.*;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
private Integer pId;
private String title;
private String content;
public Post(){

}
@ManyToOne
@JoinColumn(name="uId")
private User user;
    public Post(Integer pId, String title, String content) {
        //this.pId = pId;
        this.title = title;
        this.content = content;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
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
