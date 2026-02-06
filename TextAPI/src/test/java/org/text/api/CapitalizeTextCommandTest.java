package org.text.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CapitalizeTextCommandTest {

  private CapitalizeTextCommand capitalizeTextCommand;

  @BeforeEach
  void setup() {
    capitalizeTextCommand = new CapitalizeTextCommand();
  }

  @Test
  @DisplayName("positive")
  void testCapitalization() {
    String result = capitalizeTextCommand.execute("this is a text");
    assertEquals("This Is A Text", result);
  }
}
