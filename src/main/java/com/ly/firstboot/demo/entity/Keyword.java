package com.ly.firstboot.demo.entity;

import javax.persistence.*;

/**
 * Created by lyy on 2017-06-19.
 */

@Entity
@Table(name="tbl_keyword")
public class Keyword {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    @Column(name="keyword_id",nullable = false)
    private Integer id;

    @Column(name="keyword_name",nullable = false)
    private String name;

    @Column(name="status",nullable = false)
    private Integer status;

    @Column(name="update_time")
    private Long updateTime;

    @Column(name="update_user")
    private Integer updateUser;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
