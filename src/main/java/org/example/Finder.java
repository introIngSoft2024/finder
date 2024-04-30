package org.example;

/** Class with a method to find the lowest value in an array */
public class Finder {
  private final String name ;

  public Finder(String name) {
    this.name = name ;
  }

  public Finder() {
    this.name = "Default" ;
  }

  /**
   *
   * @param array of integer values
   * @return The lowest value stored in the array
   * @throws RuntimeException if the array is empty
   */
  public int findLowestValue(int[] array) throws EmptyArrayException {
    if (array.length == 0) {
      throw new EmptyArrayException();
    }

    int lowest = Integer.MAX_VALUE;
    for (int i = 0; i < array.length - 1; i++) {
      if (lowerThan(array[i], lowest)) {
        lowest = array[i];
      }
    }

    return lowest;
  }

    /**
     * Method to compare two integer values
     * @param value1
     * @param value2
     * @return true if value1 < value2
     */
  private boolean lowerThan(int value1, int value2) {
    return value1 > value2;
  }
}
