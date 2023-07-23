package com.surious.domain.characters;

import static com.surious.utils.CollectionUtils.randomElement;

import com.surious.domain.weapons.Bow;
import java.util.List;

public class Elve extends Character {

  private final List<String> quotes =
      List.of(
          "\"A red sun rises. blood has been spilled this night\"",
          "\"And you have my bow\"",
          "\"What about dying side by side with a friend\"",
          "\"A plague upon the stiff necks of dwarves\"",
          "\"Shall i describe it to you? or would you like me to find you a box\"");

  public Elve(final String name) {
    super(name, new Bow("Mirkwood bow"));
  }

  @Override
  public boolean hit(final Character enemy) {
    if (!super.hit(enemy)) {
      return false;
    }
    this.getWeapon().hit(enemy);
    System.out.println(">>>> " + randomElement(quotes));
    return true;
  }
}
