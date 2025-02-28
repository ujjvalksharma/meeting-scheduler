package org.example.repository;

import org.example.entity.MeetingRoom;

public class MeetingRoomRepository extends BaseRepository<MeetingRoom> {

  private static MeetingRoomRepository INSTANCE = new MeetingRoomRepository();

  public MeetingRoomRepository getInstance(){
    return INSTANCE;
  }
}
