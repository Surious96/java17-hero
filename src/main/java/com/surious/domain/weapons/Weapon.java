package com.surious.domain.weapons;

import com.surious.domain.characters.Character;
import com.surious.domain.extensions.Rune;
import java.util.HashSet;
import java.util.Set;
import lombok.Data;

@Data
public abstract class Weapon {

  private final String name;
  private final Long damage;

  private final Long mana;
  private Set<Rune> runes = new HashSet<>();

  public Weapon(final String name, final long damage, final long mana) {
    this.name = name;
    this.damage = damage;
    this.mana = mana;
  }

  public void attachRune(final Rune rune) {
    runes.add(rune);
  }

  public void hit(final Character enemy) {

    final Long extraDamage = runes.stream().map(Rune::bonusPoints).reduce(0L, Long::sum);

    enemy.consumeDamage(this.damage + extraDamage);
  }
}
