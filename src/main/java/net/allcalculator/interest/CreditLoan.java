package net.allcalculator.interest;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CreditLoan {
    public long loanPeriod(LocalDate startDate, LocalDate endDate) {
        return startDate.until(endDate, ChronoUnit.DAYS);
    }
}
