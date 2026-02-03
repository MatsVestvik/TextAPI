package org.text.api;

public class CapitalizeSelectionTextCommand extends CapitalizeTextCommand {

  public String selection;

  public CapitalizeSelectionTextCommand(String selection) {
    this.selection = selection;
  }

  @Override
  public String execute(String text) {
    return "temp";
  }
}
