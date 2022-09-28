package org.santhosh.dasari.learn.kotlin.basics

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import java.lang.IllegalArgumentException
import kotlin.test.assertFailsWith

class UserTests {

  @Test
  fun `user official name should be a combination of first name and last name`() {
    val user = User(FIRST_NAME, LAST_NAME)
    assertThat(user.getOfficialName()).isEqualTo(OFFICIAL_NAME)
  } // test to understand string template

  @Test
  fun `user should be created when invoked with named arguments in any order and have default values`() {
    val user = User(lastName = LAST_NAME, firstName = FIRST_NAME)
    assertThat(user.getOfficialName()).isEqualTo(OFFICIAL_NAME)
    assertThat(user.location).isEqualTo("Bangalore")
  } // test to understand named params and default values

  @Test
  fun `user identifier returned from the extension function should be as expected`() {
    val user = User(FIRST_NAME, LAST_NAME)
    assertThat(user.getIdentifier()).isEqualTo("santhosh.dasari")
  } // test to understand extension functions

  @Test
  fun `user first name provided should not be blank else throw an illegal argument exception`() {
    val exception = assertFailsWith<IllegalArgumentException>(
        block = { User(firstName = "", lastName = "") }
    )
    assertThat(exception.message).isEqualTo("first name cannot be empty")
  } // test to understand init block and require conditional to verify param values

  companion object {

    const val FIRST_NAME = "Santhosh"
    const val LAST_NAME = "Dasari"
    const val OFFICIAL_NAME = "Santhosh DASARI"
  }
}
