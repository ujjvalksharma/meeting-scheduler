package org.example.repository;

public class NotificationRepository {

  private static NotificationRepository INSTANCE = new NotificationRepository();
  public NotificationRepository getInstance(){
    return INSTANCE;
  }

}
