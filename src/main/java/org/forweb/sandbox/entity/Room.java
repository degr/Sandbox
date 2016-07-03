package org.forweb.sandbox.entity;

import org.forweb.database.AbstractEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Room extends AbstractEntity {
    private Integer x;
    private Integer y;
    private Integer width;
    private Integer height;
    private Integer level;
    private Integer account;
    private String type;


    public Integer getAccount() {
        return account;
    }

    public void setAccount(Integer account) {
        this.account = account;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
