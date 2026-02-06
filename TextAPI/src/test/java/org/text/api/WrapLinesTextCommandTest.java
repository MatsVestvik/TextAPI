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
    String result = wrapLinesTextCommand.execute("test\ntest");
    assertEquals("<p>test</p>\n<p>test</p>", result);
  }
}
