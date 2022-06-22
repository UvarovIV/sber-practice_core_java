package Exceptions;

public class BlockedCardTransferException extends BankOnlineException{

    public BlockedCardTransferException() {}

    public BlockedCardTransferException(String message) {
        super(message);
    }
    
}
