package org.text.api;

public class CapitalizeTextCommand extends TextCommand {

  @Override
  public String execute(String text) {
    return text = text.substring(0, 1).toUpperCase() + text.substring(1);
  }
}
