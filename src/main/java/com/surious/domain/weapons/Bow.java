package com.surious.domain.weapons;

/**
 * Represents a Bow weapon.
 * Extends the abstract class Weapon.
 */
public class Bow extends Weapon {

  public static final long PREDEFINED_BOW_DAMAGE = 10L;
  public static final long PREDEFINED_BOW_MANA = 10L;

  public Bow(final String name) {
    super(name, PREDEFINED_BOW_DAMAGE, PREDEFINED_BOW_MANA);
  }
}
