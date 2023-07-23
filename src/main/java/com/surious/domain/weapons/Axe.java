package com.surious.domain.weapons;

/**
 * Represents an Axe weapon.
 * Inherits from the Weapon class.
 */
public class Axe extends Weapon {

  public static final long PREDEFINED_AXE_DAMAGE = 15L;
  public static final long PREDEFINED_AXE_MANA = 20L;

  public Axe(final String name) {
    super(name, PREDEFINED_AXE_DAMAGE, PREDEFINED_AXE_MANA);
  }
}
