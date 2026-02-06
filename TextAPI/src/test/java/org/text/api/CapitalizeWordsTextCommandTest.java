package org.text.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CapitalizeWordsTextCommandTest {

  private CapitalizeWordsTextCommand capitalizeWordsTextCommand;

  @BeforeEach
  void setup() {
    capitalizeWordsTextCommand = new CapitalizeWordsTextCommand();
  }

  @Test
  @DisplayName("positive")
  void testCapitalization() {
    String result = capitalizeWordsTextCommand.execute("this is a text");
    assertEquals("This Is A Text", result);
  }
}
