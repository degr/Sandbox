package org.forweb.sandbox.dao;

import org.forweb.database.AbstractDao;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.forweb.sandbox.entity.Room;

import java.util.List;

public interface RoomDao extends AbstractDao<Room> {
    @Query("select room from Room room where room.account = :account")
    List<Room> getRoomsByAccount(@Param("account")Integer account);
}
