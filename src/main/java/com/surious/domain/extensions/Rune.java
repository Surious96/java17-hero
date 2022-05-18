package com.surious.domain.extensions;

import static com.surious.domain.extensions.RuneType.DAMAGE;
import static com.surious.domain.extensions.RuneType.HEAL;

public enum Rune {
  MOON_RUNE(10L, DAMAGE),
  ELVEN_LEAF(10L, HEAL),
  ;

  private Long bonusPoints;
  private RuneType type;

  Rune(final long bonusPoints, final RuneType type) {
    this.bonusPoints = bonusPoints;
    this.type = type;
  }

  public Long bonusPoints() {
    Long points;
    switch (type) {
      case DAMAGE:
        points = -bonusPoints;
        break;
      case HEAL:
        points = bonusPoints;
        break;
      default:
        throw new IllegalStateException();
    }
    return points;
  }
}
