package org.example.repository;

import org.example.entity.Invitation;

public class InvitationRepository extends BaseRepository<Invitation> {
  private static InvitationRepository INSTANCE = new InvitationRepository();

  public InvitationRepository getInstance(){
    return INSTANCE;
  }
}
