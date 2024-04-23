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
- [2,1] -> returns 2
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
    int value = 1 ;
    int[] array = new int[]{value} ;

    // Act
    int result = finder.findLowestValue(array) ;

    // Assert
    assertEquals(value, result);
  }
}
