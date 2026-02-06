package org.text.api;

public class CapitalizeTextCommand extends TextCommand {

  @Override
  public String execute(String text) {
    if (text.isEmpty()) {
      return text;
    }
    return text.toUpperCase();
  }
}
