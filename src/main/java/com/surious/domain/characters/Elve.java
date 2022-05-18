package com.surious.domain.characters;

import static com.surious.domain.characters.Race.ELVE;
import static com.surious.utils.CollectionUtils.randomElement;

import com.surious.domain.weapons.Bow;
import java.util.List;

public class Elve extends Character {

  private final List<String> quotes =
      List.of(
          "\"a red sun rises. blood has been spilled this night\"",
          "\"and you have my bow\"",
          "\"what about dying side by side with a friend\"",
          "\"a plague upon the stiff necks of dwarves\"",
          "\"shall i describe it to you? or would you like me to find you a box\"");

  public Elve(final String name) {
    super(name, new Bow("Mirkwood bow"), ELVE);
  }

  @Override
  public boolean hit(final Character enemy) {
    if (!super.hit(enemy)) {
      return false;
    }
    System.out.println(">>>> " + randomElement(quotes));
    return true;
  }
}
