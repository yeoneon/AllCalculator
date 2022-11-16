package net.allcalculator.interest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

public class CreditLoanTest {
    private CreditLoanUser creditLoanUser;
    private CreditLoan creditLoan;

    @BeforeEach
    void init() {
        creditLoanUser = CreditLoanUser.builder()
                .startDate(LocalDate.of(2022, 1, 31))
                .endDate(LocalDate.of(2023, 1, 31))
                .loan(20000000)
                .interestRate(5.68)
                .build();

        creditLoan = new CreditLoan();
    }

    @Test
    void 대출기간총일수() {
        long totalDays = creditLoan.loanPeriod(creditLoanUser.startDate, creditLoanUser.endDate);
        assertThat(totalDays).isEqualTo(365);
    }

    @Test
    void 대출실행일이상환일보다과거여부() {
        //종료일이 시작일 이후
        assertThat(creditLoanUser.isEnddateAfterStartdate()).isEqualTo(true);

        //종료일이 시작일 이전
        creditLoanUser.setEndDate(LocalDate.of(2022, 1, 30));
        assertThat(creditLoanUser.isEnddateAfterStartdate()).isEqualTo(false);
    }

    @Test
    void 하루당이자() {
        long interestOfOneDay = creditLoan.calcInterestPerDay(creditLoanUser.loan,creditLoanUser.interestRate);
        assertThat(interestOfOneDay).isEqualTo(3112);
    }
}
