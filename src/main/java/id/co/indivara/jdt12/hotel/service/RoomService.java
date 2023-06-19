package id.co.indivara.jdt12.hotel.service;

import id.co.indivara.jdt12.hotel.entity.Room;

import java.util.List;

public interface RoomService {
    //POST /rooms
    Room saveRoom(Room room);

    //GET /rooms
    List<Room> fetchRoomList();

    //PUT /rooms/{id}
    Room updateRoom(Room room, Integer roomId);

    //DELETE /rooms/{id}
    void deleteRoom(Integer roomId);
}
