package com.surious;

import com.surious.domain.characters.Character;
import com.surious.domain.characters.Dwarf;
import com.surious.domain.characters.Elve;
import lombok.SneakyThrows;

import java.util.List;
import java.util.Random;

import static java.lang.Thread.sleep;

public class ElvesVsDwarfes {

  public static final Random RANDOM = new Random();
  private static final String HISTORY = """
          Elves and dwarves were set against each other from their creation.
          Elves were created by the God of Middle-earth Ilúvatar and dwarves were created by the lesser entity Aulë.
          With dynamics like these, both species were bound to feel negative feelings toward one another.
          Thingol likely recruited dwarves to work for him in his mission to acquire the Silmaril
          because his very creation gave him a superiority complex toward the other species.
          LET THE BATTLE BEGIN""";

  @SneakyThrows
  public static void main(String[] args) {
    final Elve legolas = new Elve("Legolas");
    final Dwarf gimli = new Dwarf("Gimli");

    System.out.println(HISTORY);
    sleep(2000);

    final List<Character> characters = List.of(legolas, gimli);
    final int heroesCount = characters.size();

    while (characters.stream().allMatch(Character::isAlive)) {
        try {
          sleep(1000);
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
        final int randomCharacterIndex = RANDOM.nextInt(heroesCount);
        characters.get(randomCharacterIndex).hit(characters.get(1 - randomCharacterIndex));
    }
  }
}
