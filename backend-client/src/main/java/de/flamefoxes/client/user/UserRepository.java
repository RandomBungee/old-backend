package de.flamefoxes.client.user;

import de.flamefoxes.user.User;
import java.util.List;

public interface UserRepository {
  /**
   * Create a new User in Database.
   * Do not Use this Method
   * Only use it when User dose not exist
   * Use the find method to check if the player exist
   * @param uniqueId the UUID of the Player
   * @param rank the default Rank of the Player. Default Rank always "Spieler"
   * @param coins the default coins of the Player.
   * @param wins the default wins of the Player.
   * @param banPoints the default Ban-Points of the Player.
   * @param banHistory the default Ban-History of the Player
   */
  void create(
      String uniqueId,
      String rank,
      long coins,
      long wins,
      long banPoints,
      boolean isBanned,
      List<String> banHistory
  );

  /**
   *
   * @param uniqueId
   * @param rank
   * @param coins
   * @param wins
   * @param banPoints
   * @param banHistory
   */
  void update(
      String uniqueId,
      String rank,
      long coins,
      long wins,
      long banPoints,
      boolean isBanned,
      List<String> banHistory
  );

  User find(String uniqueId);
}
