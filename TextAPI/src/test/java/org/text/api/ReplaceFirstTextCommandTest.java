package org.text.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ReplaceFirstTextCommandTest {

  private ReplaceFirstTextCommand replaceFirstTextCommand;

  @BeforeEach
  void setup() {
    replaceFirstTextCommand = new ReplaceFirstTextCommand("bad", "good");
  }

  @Test
  @DisplayName("positive")
  void testReplace() {
    String result = replaceFirstTextCommand.execute("this is a bad bad test");
    assertEquals("this is a good bad test", result);
  }
}
