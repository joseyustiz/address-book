package com.joseyustiz.addressbook.core;

import lombok.EqualsAndHashCode;
import lombok.Value;

import javax.validation.constraints.NotBlank;

public interface AddContactServiceUseCase {

    void handle(AddContactCommand addContactCommand);

    @Value
    @EqualsAndHashCode(callSuper = false)
    class AddContactCommand extends SelfValidating<AddContactCommand> {
        @NotBlank
        private String givenNames;
        @NotBlank
        private String familyNames;

        public AddContactCommand(String givenNames, String familyNames) {
            this.givenNames = givenNames;
            this.familyNames = familyNames;
            this.validateSelf();
        }
    }
}
