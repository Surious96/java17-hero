package com.surious.domain.characters;

import static com.surious.utils.CollectionUtils.randomElement;

import com.surious.domain.weapons.Axe;
import java.util.List;

public class Dwarf extends Character {

  private final List<String> sillyWords =
      List.of(
          "\"Ishkhaqwi Ai Durugnul\"",
          "\"aaaahaaaaa\"",
          "\"there is one dwarf yet in moria who still draws breath\"",
          "\"nobody tosses a dwarf\"");

  public Dwarf(final String name) {
    super(name, new Axe("Double-bladed Axe"));
  }

  @Override
  public boolean hit(final Character enemy) {
    if (!super.hit(enemy)) return false;
    this.getWeapon().hit(enemy);
    if (enemy.dead()) {
      System.out.println(randomElement(sillyWords));
    }
    return true;
  }
}
