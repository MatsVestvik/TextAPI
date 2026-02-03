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
    return "test";
  }
}
