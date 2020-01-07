package com.joseyustiz.addressbook


import spock.lang.Specification

import javax.validation.ConstraintViolationException

import static com.joseyustiz.addressbook.core.AddContactServiceUseCase.AddContactCommand

class AddContactCommandSpec extends Specification {

    def "throws an exception if the given name is blank"() {
        when:
        def command = new AddContactCommand(null, "Family Name")
        then:
        thrown(ConstraintViolationException)

    }
}
