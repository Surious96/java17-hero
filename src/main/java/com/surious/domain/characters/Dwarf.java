package com.surious.domain.characters;

import static com.surious.domain.characters.Race.DWARF;
import static com.surious.utils.CollectionUtils.randomCollectionElement;

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
    super(name, DWARF);
    this.weapon = new Axe("Double-bladed Axe");
  }

  @Override
  public boolean hit(final Character enemy) {
    if (!super.hit(enemy)) return false;
    if (enemy.dead()) {
      System.out.println(randomCollectionElement(sillyWords));
    }
    return true;
  }
}
