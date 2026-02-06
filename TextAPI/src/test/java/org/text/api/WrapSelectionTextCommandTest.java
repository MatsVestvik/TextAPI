package org.text.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class WrapSelectionTextCommandTest {

  private WrapSelectionTextCommand wrapSelectionTextCommand;

  @BeforeEach
  void setup() {
    wrapSelectionTextCommand = new WrapSelectionTextCommand("<p>", "</p>", "bad");
  }

  @Test
  @DisplayName("positive")
  void testWrapSelection() {
    String result = wrapSelectionTextCommand.execute("this is a bad text");
    assertEquals("this is a <p>bad</p> text", result);
  }
}
