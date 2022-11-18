package net.allcalculator.interest;

import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
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
