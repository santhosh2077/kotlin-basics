package org.santhosh.dasari.learn.kotlin.basics.java;

public class JavaUser {

  private final String firstName;
  private final String lastName;

  public JavaUser(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getOfficialName() {
    return this.firstName + " " + this.lastName.toUpperCase();
  }

  public String getIdentifier() {
    return String.format("%s.%s", this.firstName.toLowerCase(), this.lastName.toLowerCase());
  }
}
