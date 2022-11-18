package net.allcalculator.interest;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class CreditLoan {
    public long loanPeriod(LocalDate startDate, LocalDate endDate) {
        return startDate.until(endDate, ChronoUnit.DAYS);
    }

    public long calcInterestPerDay(long loan, double interestRate) {
        return Math.round((loan * interestRate / 100) /365);
    }

    public List<LocalDate> getByTheRedemptionDateList(LocalDate startDate, LocalDate endDate) {
        List<LocalDate> redemptionDateList = new ArrayList<>();
        while (!startDate.equals(endDate)) {
            redemptionDateList.add(startDate);
            startDate = startDate.plusDays(1);
        }
        return redemptionDateList;
    }
}
