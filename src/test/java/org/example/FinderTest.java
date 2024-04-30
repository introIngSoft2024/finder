package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/*
Test cases for the findLowestValue() method
- [] -> raise an EmptyArrayException
- [1] -> returns 1
- [1,2] -> returns 1
- [2,1] -> returns 1
- [3,2,5] -> returns 2
*/

@DisplayName("Test cases for the findLowestValue() method")
class FinderTest {
  private Finder finder;

  @BeforeEach
  void setUp() {
    finder = new Finder();
  }

  @AfterEach
  void tearDown() {
    finder = null;
  }

  @Test
  void givenAnEmptyArrayWhenCallingTheMethodThenAnExceptionIsRaised() {
    // Assert
    assertThrows(EmptyArrayException.class, () -> finder.findLowestValue(new int[] {}));
  }

  @Test
  void givenAnArrayWithAValueWhenCallingTheMethodThenTheValueIsReturned() {
    // Arrange
    int[] array = new int[]{1} ;

    // Act
    int result = finder.findLowestValue(array) ;

    // Assert
    int expectedValue = 1 ;
    assertEquals(expectedValue, result);
  }

  @Test
  void givenAnArrayWithTwoValuesWhenCallingTheMethodThenTheFirstOneIsReturned() {
    // Arrange
    int[] array = new int[]{1,2} ;

    // Act
    int result = finder.findLowestValue(array) ;

    // Assert
    int expectedValue = 1 ;
    assertEquals(expectedValue, result);
  }

  @Test
  void givenAnArrayWithTwoValuesWhenCallingTheMethodThenTheSecondOneIsReturned() {
    // Arrange
    int[] array = new int[]{2,1} ;

    // Act
    int result = finder.findLowestValue(array) ;

    // Assert
    int expectedValue = 1 ;
    assertEquals(expectedValue, result);
  }

  @Test
  void givenAnArrayWithThreeValuesWhenCallingTheMethodThenTheSecondOneIsReturned() {
    // Arrange
    int[] array = new int[]{3,2,5} ;

    // Act
    int result = finder.findLowestValue(array) ;

    // Assert
    int expectedValue = 2 ;
    assertEquals(expectedValue, result);
  }
}
