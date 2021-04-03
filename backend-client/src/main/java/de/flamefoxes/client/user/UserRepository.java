package de.flamefoxes.client.user;

import com.sun.istack.internal.NotNull;
import de.flamefoxes.user.User;
import java.util.List;

public interface UserRepository {
  /**
   * Create a new User in Database.
   * Do not Use this Method
   * Only use it when User dose not exist
   * Use the find method to check if the player exist
   *
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
   * Edit a Player
   * <br>Not nullable</br>
   * Use it eo edit Coins, Rank, Wind, Ban-Points or the Player Ban-History
   * Pleas don´t edit the Player Rank, you don´t need it
   * The new amount of Coins, Wins or Ban-Points are counted on the old ones
   *
   * @param uniqueId the UUID of the Player
   * @param rank the new Rank of the Player
   * @param coins the new Coins of the Player
   * @param wins the new Wins of the Player
   * @param banPoints the new Ban-Points of the Player
   * @param banHistory the edited Ban-History of the Player
   */
  void update(
      @NotNull String uniqueId,
      @NotNull String rank,
      @NotNull long coins,
      @NotNull long wins,
      @NotNull long banPoints,
      @NotNull boolean isBanned,
      @NotNull List<String> banHistory
  );

  /**
   * Find a Player in Database
   * Use it to initial User Variables
   *
   * @param uniqueId the UUID of the Player
   * @return the User of the UUID
   */
  User find(String uniqueId);
}
