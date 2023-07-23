package com.surious.domain.weapons;

import com.surious.domain.characters.Character;
import com.surious.domain.extensions.Rune;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.HashSet;
import java.util.Set;

/**
 * The Weapon class represents a weapon that can be used by characters in a game.
 * It provides methods for attaching runes and hitting enemies.
 */
@Data
@RequiredArgsConstructor
public abstract class Weapon {

  private final String name;
  private final Long damage;

  private final Long mana;
  private Set<Rune> runes = new HashSet<>();

  public void attachRune(final Rune rune) {
    runes.add(rune);
  }

  /**
   * Inflicts damage on the enemy character.
   *
   * @param enemy the character to be attacked
   */
  public void hit(final Character enemy) {

    final Long extraDamage = runes.stream().map(Rune::bonusPoints).reduce(0L, Long::sum);

    enemy.consumeDamage(this.damage + extraDamage);
  }
}
