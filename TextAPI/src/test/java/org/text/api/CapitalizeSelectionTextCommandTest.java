package org.text.api;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class CapitalizeSelectionTextCommandTest {

  private CapitalizeSelectionTextCommand capitalizeSelectionTextCommand;

  @BeforeEach
  void setup() {
    capitalizeSelectionTextCommand = new CapitalizeSelectionTextCommand("test");
  }

  @Test
  @DisplayName("positive test")
  void testCapitalization() {
    String result = capitalizeSelectionTextCommand.execute("this is a test");
    assertEquals("this is a Test", result, "Should capitilize the selection which is test");
  }
}
