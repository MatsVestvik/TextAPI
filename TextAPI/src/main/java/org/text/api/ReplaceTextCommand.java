package org.text.api;

public class ReplaceTextCommand extends TextCommand {

  protected String target;
  protected String replacement;

  public ReplaceTextCommand(String target, String replacement) {
    this.target = target;
    this.replacement = replacement;
  }

  public String getTarget() {
    return this.target;
  }

  public String getReplacement() {
    return this.replacement;
  }

  @Override
  public String execute(String text) {
    if (text == null) {
      throw new IllegalArgumentException();
    }
    StringBuilder sb = new StringBuilder();
    String[] words = text.split("\\s");

    for (String word : words) {
      if (word.equalsIgnoreCase(target)) {
        word = replacement;
        sb.append(word);
      } else {
        sb.append(word);
      }
      sb.append(" ");
    }
    return sb.toString();
  }
}
