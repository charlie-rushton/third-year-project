/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package third.year.project;

/**
 *
 * @author charlierushton
 */
public class PinException extends Exception {

    public PinException(String message) {
        super(message);
    }

    public PinException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
