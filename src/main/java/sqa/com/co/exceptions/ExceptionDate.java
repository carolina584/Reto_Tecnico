package sqa.com.co.exceptions;

import net.serenitybdd.core.exceptions.SerenityManagedException;

public class ExceptionDate extends SerenityManagedException {

    private static final long serialVersionUID = 1L;

    public static final String ELEMENT_MESSAGE = "element not found";
    public ExceptionDate(String message, Throwable testErrorException) {
        super(message, testErrorException);
    }
}
