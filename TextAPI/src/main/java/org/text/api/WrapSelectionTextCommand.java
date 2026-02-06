package org.text.api;

public class WrapSelectionTextCommand extends WrapTextCommand {

  private String selection;

  public WrapSelectionTextCommand(String opening, String end, String selection) {
    super(opening, end);
    this.selection = selection;
  }

  @Override
  public String execute(String text) {
    StringBuilder sb = new StringBuilder();
    String[] words = text.split(" ");

    for (String word : words) {
      if (word.equalsIgnoreCase(selection)) {
        sb.append(opening);
        sb.append(word);
        sb.append(end + " ");
      } else {
        sb.append(word + " ");
      }
    }
    return sb.toString().trim();
  }

}
