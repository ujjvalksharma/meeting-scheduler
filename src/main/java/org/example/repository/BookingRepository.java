package org.example.repository;

import org.example.entity.Booking;

public class BookingRepository extends BaseRepository<Booking>{

  private static BookingRepository INSTANCE = new BookingRepository();

  public static BookingRepository getInstance(){
    return INSTANCE;
  }

}
