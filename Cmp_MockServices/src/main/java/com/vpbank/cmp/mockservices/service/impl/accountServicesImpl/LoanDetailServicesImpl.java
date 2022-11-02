package com.vpbank.cmp.mockservices.service.impl.accountServicesImpl;

import com.vpbank.cmp.mockservices.config.LogExecutionTime;
import com.vpbank.cmp.mockservices.service.accountServices.LoanDetailServices;
import org.springframework.stereotype.Service;

@Service
public class LoanDetailServicesImpl implements LoanDetailServices{
    @Override
    @LogExecutionTime
    public String getLoanDetailServices(String id){
        return "{\n" +
                "    \"contractID\": \"LD1435200022\",\n" +
                "    \"customerID\": \"76829\",\n" +
                "    \"nextDueDate\": \"2021-09-01\",\n" +
                "    \"approvalMoney\": \"2000000000\",\n" +
                "    \"nextInstAmt\": \"778782\",\n" +
                "    \"noOvdDays\": \"0\",\n" +
                "    \"prAmt\": \"0\",\n" +
                "    \"inAmt\": \"0\",\n" +
                "    \"peAmt\": \"0\",\n" +
                "    \"psAmt\": \"0\",\n" +
                "    \"legacyRef\": \"LD14352/00022\",\n" +
                "    \"branchCode\": \"VN0010214\",\n" +
                "    \"rate\": \"0.8\",\n" +
                "    \"insAmt\": \"0\",\n" +
                "    \"dao\": \"16506\",\n" +
                "    \"status\": \"CUR\",\n" +
                "    \"valueDate\": \"2014-12-18\",\n" +
                "    \"disbAmount\": \"\",\n" +
                "    \"loanProduct\": \"LDS14001\",\n" +
                "    \"loanPurpose\": \"01110\",\n" +
                "    \"currency\": \"VND\",\n" +
                "    \"interestType\": \"Lai suat ban von cua HO - VPBank\",\n" +
                "    \"interestBasic\": \"366/360\",\n" +
                "    \"interestSpread\": \"-7\",\n" +
                "    \"prinLiqAcct\": \"168769\",\n" +
                "    \"intLiqAcct\": \"168769\",\n" +
                "    \"securedLoan\": \"YES\",\n" +
                "    \"totalDistributedAmount\": \"2000000000\",\n" +
                "    \"lastedDateChgRate\": \"2021-04-01\",\n" +
                "    \"repaidLoan\": \"\",\n" +
                "    \"finMatDate\": \"2029-12-18\",\n" +
                "    \"term\": \"180M\",\n" +
                "    \"drawndownAccount\": \"74778647\",\n" +
                "    \"originalAmt\": \"2000000000\",\n" +
                "    \"amount\": \"1168900000\",\n" +
                "    \"totalOvdAmt\": \"0\",\n" +
                "    \"totalRepAmount\": \"778782\",\n" +
                "    \"rrtId\": \"1\",\n" +
                "    \"branchName\": \"VPBANK THANH CONG\",\n" +
                "    \"accountType\": \"LD\",\n" +
                "    \"thisPeriodInterestAmount\": \"778782\",\n" +
                "    \"thisPeriodPrincipleAmount\": \"10900000\",\n" +
                "    \"nextPayPrincipleDate\": \"2021-08-30\",\n" +
                "    \"nextPayInterestDate\": \"2021-09-01\",\n" +
                "    \"productName\": \"CV cam co GTCG VND do VPB phat hanh\",\n" +
                "    \"totalIntToday\": \"25976\",\n" +
                "    \"disbChannel\": \"\",\n" +
                "    \"collateralId\": \"76829.5.1\",\n" +
                "    \"limitRef\": \"66406.02\",\n" +
                "    \"limitAmount\": \"2000000000\",\n" +
                "    \"productProgram\": \"\",\n" +
                "    \"appLimitDate\": \"2014-12-18\",\n" +
                "    \"valuablePapers\": \"TV3424387\",\n" +
                "    \"valuablePapersPricipal\": \"1624794521\",\n" +
                "    \"intAmount\": \"1001586\",\n" +
                "    \"feeAmount\": \"0\",\n" +
                "    \"intAmountReceive\": \"0\",\n" +
                "    \"blockAmount\": \"1450000000\",\n" +
                "    \"valuablePapersOther\": \"NO\",\n" +
                "    \"savingValueDate\": \"2020-12-21\",\n" +
                "    \"savingMaturityDate\": \"2020-12-21\",\n" +
                "    \"hhCompany\": \"\",\n" +
                "    \"noPeriodPay\": \"195\"\n" +
                "}";
    }
}
