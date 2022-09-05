package com.vpbank.cmp.mockservices.service.impl.customerOnboardingImpl;

import com.vpbank.cmp.mockservices.service.customerOnboardingServices.CreditCardInformationServices;
import org.springframework.stereotype.Service;

@Service
public class CreditCardInformationServiceImpl implements CreditCardInformationServices {
    @Override
    public String getCreditCardInformationServices(String id) {
        return "{\n" +
                "    \"cardList\": {\n" +
                "        \"card\": {\n" +
                "            \"cardNumber\": \"5590731502290351\",\n" +
                "            \"comContractNumber\": \"133-C-693464\",\n" +
                "            \"depContractNumber\": \"\",\n" +
                "            \"legalId\": \"011950023\",\n" +
                "            \"cardId\": \"13983264\",\n" +
                "            \"depId\": \"\",\n" +
                "            \"comId\": \"13983262\",\n" +
                "            \"depName\": \"\",\n" +
                "            \"clientName\": \"SHORT NAME 4525166\",\n" +
                "            \"comLimit\": \"-50000000.0000000000\",\n" +
                "            \"comBlocked\": \"0\",\n" +
                "            \"depLimit\": \"\",\n" +
                "            \"cardLimit\": \"-20000000.0000000000\",\n" +
                "            \"depBlocked\": \"\",\n" +
                "            \"depTotalBalance\": \"\",\n" +
                "            \"depAvail\": \"\",\n" +
                "            \"cardDepRegnumber\": \"\",\n" +
                "            \"cardBlocked\": \"0\",\n" +
                "            \"cardExpire\": \"2309\",\n" +
                "            \"comTotalBalance\": \"-22429523.9700000000\",\n" +
                "            \"cardTotalBalance\": \"0\",\n" +
                "            \"comAvail\": \"27570476.0300000000\",\n" +
                "            \"comDateOpen\": \"19/09/2018\",\n" +
                "            \"cardComRegNumber\": \"0107957835\",\n" +
                "            \"statuseCom\": \"Active ecom\",\n" +
                "            \"dateOpen\": \"19/09/2018\",\n" +
                "            \"government\": \"SUP\",\n" +
                "            \"cardCurr\": \"VND\",\n" +
                "            \"cardType\": \"MC SME Classic Credit\",\n" +
                "            \"name\": \"Card No Renewal\",\n" +
                "            \"fbranch\": \"Dong Ha Noi\",\n" +
                "            \"cardAvail\": \"20000000.0000000000\",\n" +
                "            \"rBSNumber\": \"139076777\",\n" +
                "            \"cardNumberMasked\": \"559073______0351\",\n" +
                "            \"comMainName\": \"SHORT NAME 4487274\",\n" +
                "            \"productionStatus\": \"Ready\",\n" +
                "            \"cardProductCode\": \"MCSSCES\",\n" +
                "            \"cardProductName\": \"298-MC SME Classic Credit Supp\",\n" +
                "            \"accountListing\": \"\"\n" +
                "        },\n" +
                "        \"card\": {\n" +
                "            \"cardNumber\": \"5223841502411298\",\n" +
                "            \"comContractNumber\": \"133-C-991728\",\n" +
                "            \"depContractNumber\": \"\",\n" +
                "            \"legalId\": \"132096877\",\n" +
                "            \"cardId\": \"13906020\",\n" +
                "            \"depId\": \"\",\n" +
                "            \"comId\": \"13906019\",\n" +
                "            \"depName\": \"\",\n" +
                "            \"clientName\": \"SHORT NAME 4487207\",\n" +
                "            \"comLimit\": \"0\",\n" +
                "            \"comBlocked\": \"0\",\n" +
                "            \"depLimit\": \"\",\n" +
                "            \"cardLimit\": \"0\",\n" +
                "            \"depBlocked\": \"\",\n" +
                "            \"depTotalBalance\": \"\",\n" +
                "            \"depAvail\": \"\",\n" +
                "            \"cardDepRegnumber\": \"\",\n" +
                "            \"cardBlocked\": \"0\",\n" +
                "            \"cardExpire\": \"2309\",\n" +
                "            \"comTotalBalance\": \"0\",\n" +
                "            \"cardTotalBalance\": \"0\",\n" +
                "            \"comAvail\": \"0\",\n" +
                "            \"comDateOpen\": \"11/09/2018\",\n" +
                "            \"cardComRegNumber\": \"0107957835\",\n" +
                "            \"statuseCom\": \"Inactive ecom\",\n" +
                "            \"dateOpen\": \"11/09/2018\",\n" +
                "            \"government\": \"PRIN\",\n" +
                "            \"cardCurr\": \"VND\",\n" +
                "            \"cardType\": \"MC SME Classic Debit\",\n" +
                "            \"name\": \"Card OK\",\n" +
                "            \"fbranch\": \"So Giao Dich\",\n" +
                "            \"cardAvail\": \"0\",\n" +
                "            \"rBSNumber\": \"139076777\",\n" +
                "            \"cardNumberMasked\": \"522384______1298\",\n" +
                "            \"comMainName\": \"SHORT NAME 4487274\",\n" +
                "            \"productionStatus\": \"Locked\",\n" +
                "            \"cardProductCode\": \"MCSSDP\",\n" +
                "            \"cardProductName\": \"133-MC SME Classic Debit Prin\",\n" +
                "            \"accountListing\": \"139076777\"\n" +
                "        },\n" +
                "        \"card\": {\n" +
                "            \"cardNumber\": \"5590731502121887\",\n" +
                "            \"comContractNumber\": \"133-C-693464\",\n" +
                "            \"depContractNumber\": \"\",\n" +
                "            \"legalId\": \"132096877\",\n" +
                "            \"cardId\": \"13983263\",\n" +
                "            \"depId\": \"\",\n" +
                "            \"comId\": \"13983262\",\n" +
                "            \"depName\": \"\",\n" +
                "            \"clientName\": \"SHORT NAME 4487207\",\n" +
                "            \"comLimit\": \"-50000000.0000000000\",\n" +
                "            \"comBlocked\": \"0\",\n" +
                "            \"depLimit\": \"\",\n" +
                "            \"cardLimit\": \"-30000000.0000000000\",\n" +
                "            \"depBlocked\": \"\",\n" +
                "            \"depTotalBalance\": \"\",\n" +
                "            \"depAvail\": \"\",\n" +
                "            \"cardDepRegnumber\": \"\",\n" +
                "            \"cardBlocked\": \"0\",\n" +
                "            \"cardExpire\": \"2309\",\n" +
                "            \"comTotalBalance\": \"-22429523.9700000000\",\n" +
                "            \"cardTotalBalance\": \"0\",\n" +
                "            \"comAvail\": \"27570476.0300000000\",\n" +
                "            \"comDateOpen\": \"19/09/2018\",\n" +
                "            \"cardComRegNumber\": \"0107957835\",\n" +
                "            \"statuseCom\": \"Active ecom\",\n" +
                "            \"dateOpen\": \"19/09/2018\",\n" +
                "            \"government\": \"PRIN\",\n" +
                "            \"cardCurr\": \"VND\",\n" +
                "            \"cardType\": \"MC SME Classic Credit\",\n" +
                "            \"name\": \"Card No Renewal\",\n" +
                "            \"fbranch\": \"Dong Ha Noi\",\n" +
                "            \"cardAvail\": \"30000000.0000000000\",\n" +
                "            \"rBSNumber\": \"139076777\",\n" +
                "            \"cardNumberMasked\": \"559073______1887\",\n" +
                "            \"comMainName\": \"SHORT NAME 4487274\",\n" +
                "            \"productionStatus\": \"Ready\",\n" +
                "            \"cardProductCode\": \"MCSSCEP\",\n" +
                "            \"cardProductName\": \"298-MC SME Classic Credit Prin\",\n" +
                "            \"accountListing\": \"\"\n" +
                "        }\n" +
                "    }\n" +
                "}";
    }
}
