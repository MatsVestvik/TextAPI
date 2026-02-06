package org.text.api;

public class WrapLinesTextCommand extends WrapTextCommand {

  public WrapLinesTextCommand(String opening, String end) {
    super(opening, end);
  }

  @Override
  public String execute(String text) {
    StringBuilder sb = new StringBuilder();
    String[] lines = text.split("\n");

    for (String line : lines) {
      sb.append(opening);
      sb.append(line);
      sb.append(end);
      sb.append("\n");
    }

    return sb.toString().trim();
  }
}
