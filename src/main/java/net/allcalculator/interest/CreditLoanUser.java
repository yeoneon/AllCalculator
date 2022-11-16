package net.allcalculator.interest;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Setter
public class CreditLoanUser {
    public LocalDate startDate;
    public LocalDate endDate;

    public boolean isEnddateAfterStartdate() {
        return endDate.isAfter(startDate);
    }
}
