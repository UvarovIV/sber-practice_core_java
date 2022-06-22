package Exceptions;

public class NegativeAmountTransferException extends BankOnlineException{

    public NegativeAmountTransferException() {}

    public NegativeAmountTransferException(String message) {
        super(message);
    }
    
}
