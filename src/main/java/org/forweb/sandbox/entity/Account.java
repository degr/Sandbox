package org.forweb.sandbox.entity;

import org.forweb.database.AbstractEntity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Account extends AbstractEntity{
    @Column(name = "client")
    private Integer clientId;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "acount")
    private List<Room> rooms;

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }
}
