package org.santhosh.dasari.learn.kotlin.basics

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeParseException
import java.time.temporal.ChronoUnit.YEARS

class UserServiceImpl: UserService {

  override fun getUserOrganization(user: User): String {
    return user.organization ?: "ALL"
  }

  override fun getUserCountry(user: User): String {
    return if (INDIA_LOCATIONS.contains(user.location)) "India" else "France"
  }

  override fun getUserAge(user: User): Int {
    return try {
      val localDate = LocalDate.parse(user.dob, DateTimeFormatter.ofPattern(USER_DATE_FORMAT))
      val today = LocalDate.now()
      YEARS.between(localDate, today).toInt()
    } catch (e:DateTimeParseException) {
      0
    }
  }

  companion object {
    val INDIA_LOCATIONS = listOf("Bangalore", "Chennai")

    const val USER_DATE_FORMAT = "yyyy-MM-dd"
  }
}
