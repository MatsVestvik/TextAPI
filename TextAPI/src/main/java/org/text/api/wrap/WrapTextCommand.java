package org.text.api.wrap;

public abstract class WrapTextCommand {

  protected String opening;
  protected String end;

  public WrapTextCommand(String opening, String end) {
    this.opening = opening;
    this.end = end;
  }

  public abstract String execute(String text);

}
