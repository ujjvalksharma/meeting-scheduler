package org.example.repository;

import org.example.entity.Person;

public class PersonRepository extends BaseRepository<Person> {
  private static MeetingRoomRepository INSTANCE = new MeetingRoomRepository();

  public MeetingRoomRepository getInstance(){
    return INSTANCE;
  }
}
