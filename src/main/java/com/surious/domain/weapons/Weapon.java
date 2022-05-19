package com.surious.domain.weapons;

import com.surious.domain.characters.Character;
import lombok.Data;

@Data
public abstract class Weapon {

  private final String name;
  private final Long damage;

  private final Long manaCost;

  public Weapon(final String name, final long damage, final long manaCost) {
    this.name = name;
    this.damage = damage;
    this.manaCost = manaCost;
  }

  public void hit(final Character characterToHit) {
    characterToHit.consumeDamage(this.damage);
  }
}
