package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@Data
@ToString
public class Invitation {

  int id;
  Booking booking;
  Person person;
  boolean isAccepted;
}
