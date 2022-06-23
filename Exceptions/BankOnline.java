package Exceptions;

import java.io.*;

public class BankOnline {

    private static boolean isNumeric(String cardNumber){
        try {
            Double.parseDouble(cardNumber);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isBlocked(String cardNumber){
        try (BufferedReader reader = new BufferedReader(new FileReader("Exceptions\\BlockedCards.txt"))) {
            String blockedCard = reader.readLine();
            while (blockedCard != null){
                blockedCard = blockedCard.replaceAll("\s+", "");
                if (cardNumber.equals(blockedCard))
                    return true;
                blockedCard = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка при работе с файлом");
        }
        return false;
    }

    public void send(String cardNumber, Double money){
        try {
            if (cardNumber == null || money == null){
                throw new NullArgumentException("Номер карты или сумма перевода не введены");
            } 
            
            cardNumber = cardNumber.replaceAll("\\s+", "");

            if (!isNumeric(cardNumber) || cardNumber.length() != 16){
                throw new InvalidCardNumberException("Неправильно указан номер карты");
            }

            if (money > 50000){
                throw new OutOfLimitTransferException("Превышен лимит перевода");
            }

            if (money < 0) {
                throw new NegativeAmountTransferException("Сумма перевода не может быть отрицательным числом");
            }

            if (isBlocked(cardNumber)){
                throw new BlockedCardTransferException("Перевод не возможен так как карта заблокирована");
            }

            System.out.println(String.format("Перевод суммой %s был успешно выполнен на счёт %s", money, cardNumber));

        } catch (NullArgumentException eNullArgEx) {
            System.out.println(eNullArgEx.getMessage());
        } catch (InvalidCardNumberException eInvalidCardNumEx){
            System.out.println(eInvalidCardNumEx.getMessage());
        } catch (OutOfLimitTransferException eOfLimitTransferEx){
            System.out.println(eOfLimitTransferEx.getMessage());
        } catch (NegativeAmountTransferException eNegativeAmountTransferEx) {
            System.out.println(eNegativeAmountTransferEx.getMessage());
        } catch (BlockedCardTransferException eBlockedCardTransferEx){
            System.out.println(eBlockedCardTransferEx.getMessage());
        }
    }

}
