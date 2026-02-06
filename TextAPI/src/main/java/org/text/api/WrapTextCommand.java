package org.text.api;

public class WrapTextCommand extends TextCommand {

  protected String opening;
  protected String end;

  public WrapTextCommand(String opening, String end) {
    this.opening = opening;
    this.end = end;
  }

  public String getOpening() {
    return this.opening;
  }

  public String getEnd() {
    return this.end;
  }

  @Override
  public String execute(String text) {
    StringBuilder sb = new StringBuilder();

    sb.append(opening);
    sb.append(text);
    sb.append(end);

    return sb.toString();
  }
}
