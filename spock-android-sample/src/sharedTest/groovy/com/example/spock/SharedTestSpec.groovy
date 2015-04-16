package com.example.spock

import spock.lang.Specification

class SharedTestSpec extends Specification {
  /** This should be shared between the two source sets. */
  def "should run on both environments"() {
    given:
    def a = 1

    expect:
    a + 2 == 3
  }
}
