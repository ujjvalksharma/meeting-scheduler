package org.example.entity;

import java.sql.Time;
import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@Data
@ToString
public class Booking {
  int id;
  private MeetingRoom meetingRoom;
  private List<Person> personList;
  private Date meetingDay;
  private Time startTime;
  private Time endTime;
}
