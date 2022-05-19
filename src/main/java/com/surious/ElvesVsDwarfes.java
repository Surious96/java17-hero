package com.surious;

import com.surious.domain.characters.Dwarf;
import com.surious.domain.characters.Elve;
import java.util.Random;
import lombok.SneakyThrows;

public class ElvesVsDwarfes {

  private static final String HISTORY =
      "Elves and dwarves were set against each other from their creation.\n"
          + " Elves were created by the God of Middle-earth Ilúvatar and dwarves "
          + "were created by the lesser entity Aulë. With dynamics like these, "
          + "both species were bound to feel negative feelings toward one another. "
          + "Thingol likely recruited dwarves to work for him in his mission to acquire "
          + "the Silmaril because his very creation gave him a superiority complex toward the other species."
          + "\n LET THE BATTLE BEGIN";
  public static final Random RANDOM = new Random();

  @SneakyThrows
  public static void main(String[] args) {
    System.out.println(HISTORY);
    Thread.sleep(2000);

    final Elve legolas = new Elve("Legolas");
    final Dwarf gimli = new Dwarf("Gimli");
    //
    //    List<Character> characters = List.of(legolas, gimli);
    //
    //    for (int it = 0; it < 20; it++) {
    //      if (characters.stream().allMatch(Character::isAlive)) {
    //        try {
    //          Thread.sleep(1000);
    //        } catch (InterruptedException e) {
    //          throw new RuntimeException(e);
    //        }
    //        final int randomCharacterIndex = RANDOM.nextInt(characters.size());
    //        characters.get(randomCharacterIndex).hit(characters.get(1 - randomCharacterIndex));
    //      }
    //    }
  }
}
