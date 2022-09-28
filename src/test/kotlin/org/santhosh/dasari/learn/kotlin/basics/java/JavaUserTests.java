package org.santhosh.dasari.learn.kotlin.basics.java;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class JavaUserTests {

  // tests to showcase string interpolation in java

  @Test
  @DisplayName("user official name should be a combination of first name and last name")
  void userOfficialNameShouldBeACombinationOfFirstNameAndLastName() {
    JavaUser user = new JavaUser("Santhosh", "Dasari");
    assertThat(user.getOfficialName()).isEqualTo("Santhosh DASARI");
  }

  @Test
  @DisplayName("user identifier should be a combination of first name and last name")
  void userIdentifierShouldBeACombinationOfFirstNameAndLastName() {
    JavaUser user = new JavaUser("Santosh", "D");
    assertThat(user.getIdentifier()).isEqualTo("santosh.d");
  }
}
