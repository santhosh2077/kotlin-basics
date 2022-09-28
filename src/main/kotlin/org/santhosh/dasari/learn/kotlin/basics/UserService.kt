package org.santhosh.dasari.learn.kotlin.basics

interface UserService {
  fun getUserOrganization(user: User): String
  fun getUserCountry(user: User): String
  fun getUserAge(user: User): Int
}
