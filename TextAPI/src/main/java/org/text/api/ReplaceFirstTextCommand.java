package org.text.api;

public class ReplaceFirstTextCommand extends ReplaceTextCommand {

  public ReplaceFirstTextCommand(String target, String replacement) {
    super(target, replacement);
  }

  @Override
  public String execute(String text) {
    StringBuilder sb = new StringBuilder();
    String[] words = text.split(" ");

    int index = 0;
    boolean found = false;

    while (index < words.length && !found) {
      if (words[index].equalsIgnoreCase(target)) {
        words[index] = replacement;
        found = true;
      }
      index++;
    }

    for (String word : words) {
      sb.append(word + " ");
    }
    return sb.toString().trim();
  }
}
