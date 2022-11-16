package net.allcalculator.interest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Builder
public class CreditLoanUser {
    public LocalDate startDate;
    public LocalDate endDate;
    public double interestRate;
    public long loan;

    public boolean isEnddateAfterStartdate() {
        return endDate.isAfter(startDate);
    }
}
