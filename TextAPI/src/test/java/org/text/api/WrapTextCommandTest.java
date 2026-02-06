package org.text.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class WrapTextCommandTest {

  private WrapTextCommand wrapTextCommand;

  @BeforeEach
  void setup() {
    wrapTextCommand = new WrapTextCommand("<p>", "</p>");
  }

  @Test
  @DisplayName("positive")
  void testWrap() {
    String result = wrapTextCommand.execute("this is a normal string");
    assertEquals("<p>this is a normal string", result);
  }
}
