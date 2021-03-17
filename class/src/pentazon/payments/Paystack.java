package pentazon.payments;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Paystack implements PaymentService {

    @Override
    public boolean pay(PaymentCard card, BigDecimal amount) {
        boolean result = isValidCard(card);
        return result;
    }

    private boolean isValidCard(PaymentCard card) {
        boolean result = false;

        if(card.getExpiry().isAfter(LocalDate.now())) {
            result = true;
        }

        return result;
    }
}
