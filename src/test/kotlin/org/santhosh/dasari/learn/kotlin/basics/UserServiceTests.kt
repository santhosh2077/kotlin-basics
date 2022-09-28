package org.santhosh.dasari.learn.kotlin.basics

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class UserServiceTests {

  private lateinit var userService: UserService

  @BeforeEach
  fun setUp() {
    userService = UserServiceImpl()
  }

  @Test
  fun `user organization should be ALL unless restricted to indicate limited access`() {
    val user = User(FIRST_NAME, LAST_NAME)
    assertThat(userService.getUserOrganization(user)).isEqualTo("ALL")
  } // test to understand elvis operator

  @Test
  fun `user country should be India by default or France if not located in India`() {
    var user = User(FIRST_NAME, LAST_NAME)
    assertThat(userService.getUserCountry(user)).isEqualTo("India")
    user = User(FIRST_NAME, LAST_NAME, location = "Paris")
    assertThat(userService.getUserCountry(user)).isEqualTo("France")
  } // test to understand if-else expression

  @Test
  fun `user age should be 0 when dob is blank or not provided in proper format else calculated from it`() {
    var user = User(FIRST_NAME, LAST_NAME, "01-02-2000")
    assertThat(userService.getUserAge(user)).isEqualTo(0)
    user = User(FIRST_NAME, LAST_NAME, "2000-01-02")
    assertThat(userService.getUserAge(user)).isEqualTo(22)
  } // test to understand try-catch expression

  companion object {

    const val FIRST_NAME = "Santhosh"
    const val LAST_NAME = "Dasari"
  }
}
