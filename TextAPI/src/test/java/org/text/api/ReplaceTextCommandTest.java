package org.text.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ReplaceTextCommandTest {

  private ReplaceTextCommand replaceTextCommand;

  @BeforeEach
  void setup() {
    replaceTextCommand = new ReplaceTextCommand("bad", "good");
  }

  @Test
  @DisplayName("positive")
  void testReplace() {
    String result = replaceTextCommand.execute("this is a bad test");
    assertEquals("this is a good test", result);
  }
}
