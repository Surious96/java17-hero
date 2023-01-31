package com.surious.domain.extensions;

import static com.surious.domain.extensions.RuneType.DAMAGE;
import static com.surious.domain.extensions.RuneType.HEAL;

public enum Rune {
  MOON_RUNE(10L, DAMAGE),
  ELVEN_LEAF(10L, HEAL),
  ;

  private final Long bonusPoints;
  private final RuneType type;

  Rune(final long bonusPoints, final RuneType type) {
    this.bonusPoints = bonusPoints;
    this.type = type;
  }

  public Long bonusPoints() {
    switch (type) {
      case DAMAGE:
        return -bonusPoints;
      case HEAL:
        return bonusPoints;
      default:
        throw new IllegalStateException();
    }
  }
}
