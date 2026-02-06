package org.text.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class WrapLinesTextCommandTest {

  private WrapLinesTextCommand wrapLinesTextCommand;

  @BeforeEach
  void setup() {
    wrapLinesTextCommand = new WrapLinesTextCommand("<p>", "</p>");
  }

  @Test
  @DisplayName("positve")
  void testWrapLines() {
    String result = wrapLinesTextCommand.execute("this is a text with \na newline character");
    assertEquals("<p>this is a text with</p> <p>a newline character</p>", result);
  }
}
