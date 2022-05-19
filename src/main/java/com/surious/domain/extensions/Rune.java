package com.surious.domain.extensions;

public enum Rune {
  MOON_RUNE(10L),

  ;

  private final Long extraPoints;

  Rune(final long extraPoints) {
    this.extraPoints = extraPoints;
  }

  public Long extraPoints() {
    return extraPoints;
  }
}
