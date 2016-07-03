package org.forweb.sandbox.service;

import org.forweb.database.AbstractService;
import org.forweb.sandbox.dao.RoomDao;
import org.forweb.sandbox.entity.Account;
import org.forweb.sandbox.entity.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService extends AbstractService<Room, RoomDao> {
    @Autowired
    private AccountService accountService;

    @Override
    public Room save(Room room) {
        Account account = accountService.findOne(room.getAccount());
        if (account == null) {
            throw new RuntimeException("Room have no account");
        }
        List<Room> roomList = getRoomsByAccount(account.getId());
        Integer x = room.getX();
        Integer y = room.getY();
        Integer width = room.getWidth() - 1;
        Integer height = room.getHeight() - 1;

        for (Room item : roomList) {
            Integer x1 = item.getX();
            Integer x2 = x1 + item.getWidth();
            Integer y1 = item.getY();
            Integer y2 = y1 + item.getHeight();

            if(x >= x1 && x <= x2) {
                throw new RuntimeException("Rooms oX conflict");
            }
            if(x + width >= x1 && x + width <= x2) {
                throw new RuntimeException("Rooms oX conflict");
            }
            if(y >= y1 && y <= y2) {
                throw new RuntimeException("Rooms oY conflict");
            }
            if(y + height >= y1 && y + height <= y2) {
                throw new RuntimeException("Rooms oY conflict");
            }
        }
        super.save(room);
        return room;
    }

    private List<Room> getRoomsByAccount(Integer accountId) {
        return dao.getRoomsByAccount(accountId);
    }
}
