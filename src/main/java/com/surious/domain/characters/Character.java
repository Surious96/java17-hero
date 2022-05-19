package com.surious.domain.characters;

import static java.lang.System.out;

import com.surious.domain.weapons.Weapon;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public abstract class Character {

  protected final String name;
  protected final Race race;
  protected Weapon weapon;
  protected Long health;
  protected Long mana;

  public boolean hit(final Character enemy) {
    if (mana < weapon.getManaCost()) {
      out.printf("====  %s misses the hit ", this.name);
      return false;
    }
    out.printf(
        "=====  %s hits %s with '%s' with %d. took %n damage",
        this.name, enemy.name, weapon.getName(), weapon.getDamage());
    this.getWeapon().hit(enemy);
    mana -= weapon.getManaCost();
    return true;
  }

  public void consumeDamage(final Long damage) {
    //    Long actualDamage = ;

    if (this.health - damage <= 0) {
      out.printf("!!!!!  %s died\n", this.name);
      this.health = 0L;
      return;
    }
    this.health -= damage;
    this.mana += 10;
    out.printf("---  %s health is %d\n", this.name, this.health);
  }

  public boolean dead() {
    return this.health == 0;
  }
}
