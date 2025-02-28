package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@Data
@ToString
public class MeetingRoom {
  int id;
  boolean isAvailable;
  int capacity;
}
