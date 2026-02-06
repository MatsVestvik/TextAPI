package org.text.api;

public class CapitalizeWordsTextCommand extends CapitalizeTextCommand {

  @Override
  public String execute(String text) {
    StringBuilder sb = new StringBuilder();
    String[] words = text.split(" ");

    for (String word : words) {
      word = word.substring(0, 1).toUpperCase() + word.substring(1);
      sb.append(word + " ");
    }
    return sb.toString().trim();
  }
}
