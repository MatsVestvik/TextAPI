package org.text.api;

public class CapitalizeSelectionTextCommand extends CapitalizeTextCommand {

  public String selection;

  public CapitalizeSelectionTextCommand(String selection) {
    this.selection = selection;
  }

  @Override
  public String execute(String text) {
    String[] words = text.split(" ");
    StringBuilder sb = new StringBuilder();

    for (String word : words) {

      if (word.equalsIgnoreCase(selection)) {
        word = word.substring(0, 1).toUpperCase() + word.substring(1);
      }
      sb.append(word + " ");
    }

    return sb.toString().trim();
  }
}
