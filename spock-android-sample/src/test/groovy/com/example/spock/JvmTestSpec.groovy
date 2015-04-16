package com.example.spock

import spock.lang.Specification

class JvmTestSpec extends Specification {
  def "Should run on jvm"() {
    given:
    def a = 1

    expect:
    a + 2 == 3
  }
}
