package org.santhosh.dasari.learn.kotlin.basics

data class User(
    val firstName: String,
    val lastName: String,
    val organization: String?  = null,
    val location: String = DEFAULT_LOCATION,
    val dob: String = ""
) {

  init {
    require(firstName.isNotBlank()) {
      "first name cannot be empty"
    }
  }

  fun getOfficialName(): String {
    return "$firstName ${lastName.toUpperCase()}"
  }

  companion object {
    const val DEFAULT_LOCATION = "Bangalore"
  }
}

fun User.getIdentifier(): String {
  return "${firstName.toLowerCase()}.${lastName.toLowerCase()}"
}
