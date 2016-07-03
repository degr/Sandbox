package org.forweb.sandbox.controller;

import org.forweb.sandbox.dao.RoomDao;
import org.forweb.sandbox.entity.Room;
import org.forweb.sandbox.service.RoomService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/room")
public class RoomController extends CrudController<Room, RoomDao, RoomService>{


}
