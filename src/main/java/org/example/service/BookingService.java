package org.example.service;

import org.example.entity.*;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public class BookingService {

  private static BookingService INSTANCE = new BookingService();

  public BookingService getInstance() {
    return INSTANCE;
  }

  public Booking scheduleMeeting(List<Person> person, MeetingRoom meetingRoom, Date day, Time startTime, Time endTime) {
    //write code
    return null;
  }

  public Booking scheduleMeeting(List<Person> person, Date day, Time startTime, Time endTime) {
    //write code
    return null;
  }

  public Booking addPersonToBooking(int bookingId, List<Person> person) {
    //write code
    return null;
  }

}
