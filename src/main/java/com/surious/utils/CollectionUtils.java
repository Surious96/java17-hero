package com.surious.utils;

import java.util.Collection;
import java.util.Random;

public class CollectionUtils {

  private static Random random = new Random();

  public static <T> T randomCollectionElement(final Collection<T> collection) {
    return collection.stream().skip(random.nextInt(collection.size() - 1)).findFirst().orElse(null);
  }
}
