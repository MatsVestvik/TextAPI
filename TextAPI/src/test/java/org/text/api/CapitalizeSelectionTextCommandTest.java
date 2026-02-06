package org.text.api;

import org.text.api.CapitalizeSelectionTextCommand;

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
    assert("this is a TEST", result, "Should capotilize the selection which is test");
  }
}
