package com.surious.domain.characters;

import static java.lang.System.out;

import com.surious.domain.weapons.Weapon;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * The Character class represents a character in a game.
 * It provides methods for hitting an enemy, consuming damage, and checking if the character is alive or dead.
 */
@Data
@AllArgsConstructor
public abstract class Character {

  private String name;
  private Long health;
  private Long mana;
  private Long shield;

  private final Weapon weapon;

  public Character(final String name, final Weapon weapon) {
    this.name = name;
    this.weapon = weapon;
    this.health = 100L;
    this.mana = 100L;
    this.shield = 0L;
  }

  /**
   * Hits the enemy with the weapon.
   *
   * @param enemy the Character representing the enemy to hit
   * @return true if the hit is successful, false otherwise
   */
  public boolean hit(final Character enemy) {
    if (mana < weapon.getMana()) {
      out.printf("====  %s misses hit\n", this.name);
      return false;
    }
    out.printf(
        "=====  %s hits %s with '%s' with %d damage%n",
        this.name, enemy.name, weapon.getName(), weapon.getDamage());
    mana -= weapon.getMana();
    return true;
  }

  public void consumeDamage(final Long damage) {
    if (this.health - damage <= 0) {
      out.printf("!!!!!  %s died\n", this.name);
      this.health = 0L;
      return;
    }
    this.health -= damage;
    this.mana += 10;
    out.printf("---  %s health is %d\n", this.name, this.health);
  }

  public boolean isAlive() {
    return this.health > 0;
  }

  public boolean dead() {
    return this.health == 0;
  }
}
