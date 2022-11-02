package com.vpbank.cmp.mockservices.service.impl.customerOnboardingImpl;

import com.vpbank.cmp.mockservices.config.LogExecutionTime;
import com.vpbank.cmp.mockservices.service.customerOnboardingServices.CustomerService;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    @LogExecutionTime
    public String getCustomerInfo(String cif) {
        //TODO : return customerInfo
        /*CustomerInfo customerInfo = CustomerInfo.builder()
                .customerNumber("76829")
                .customerName("HAI NGUYEN THI THU VN HAI NGUYEN THI THU VN 2")
                .shortName("HAI NGUYEN THI THU VN 2")
                .build();*/

        return "{\n" +
                "    \"customerNumber\": \"76829\",\n" +
                "    \"customerName\": \"HAI NGUYEN THI THU VN HAI NGUYEN THI THU VN 2\",\n" +
                "    \"shortName\": \"HAI NGUYEN THI THU VN 2\",\n" +
                "    \"dateOfBirth\": \"1983-10-13\",\n" +
                "    \"permanentAddress\": \"VPBank Add 76829 VN Per Add Wards Per Addr Distr VPBank Add 76829 VN\",\n" +
                "    \"currentAddress\": \"VPBank Add 76829 VN WARDS VPBank Add 76829 VN\",\n" +
                "    \"customerType\": \"2\",\n" +
                "    \"segment\": \"AF\",\n" +
                "    \"country\": \"Vietnam\",\n" +
                "    \"residence\": \"VN\",\n" +
                "    \"companyBook\": \"VN0010133\",\n" +
                "    \"gender\": \"Female\",\n" +
                "    \"dao\": \"5239\",\n" +
                "    \"daoPb\": \"\",\n" +
                "    \"vipType\": \"AF-Special\",\n" +
                "    \"jobTitle\": \"Nhan Vien\",\n" +
                "    \"legalId\": \"024176000099\",\n" +
                "    \"sectorCode\": \"1002\",\n" +
                "    \"sbvSector\": \"\",\n" +
                "    \"nationalId\": \"VN\",\n" +
                "    \"channel\": \"OCB\",\n" +
                "    \"maritalStatus\": \"Married\",\n" +
                "    \"education\": \"Cao dang\",\n" +
                "    \"occupation\": \"\",\n" +
                "    \"officeName\": \"\",\n" +
                "    \"officeAddress\": \"\",\n" +
                "    \"noticeList\": \"\",\n" +
                "    \"priorityBranch\": \"VN0010280\",\n" +
                "    \"daoRm\": \"34398\",\n" +
                "    \"nationality\": \"Vietnam\",\n" +
                "    \"buIssuedPlace\": \"\",\n" +
                "    \"buIssuedDate\": \"\",\n" +
                "    \"legalRepTitle\": \"\",\n" +
                "    \"legalRepName\": \"\",\n" +
                "    \"legalRepId\": \"\",\n" +
                "    \"bomMemName\": \"\",\n" +
                "    \"bomMemAddr\": \"\",\n" +
                "    \"bomMemId\": \"\",\n" +
                "    \"taxCode\": \"\",\n" +
                "    \"taxCoIssDate\": \"\",\n" +
                "    \"corpCustType\": \"\",\n" +
                "    \"provinceCity\": \"VPBank Add 76829 VN\",\n" +
                "    \"assetClass\": \"1\",\n" +
                "    \"maxDpd\": \"\",\n" +
                "    \"promotionPrg\": \"TD\",\n" +
                "    \"mobileNo\": \"0854303140\",\n" +
                "    \"gbName\": \"HAI NGUYEN THI THU GB HAI NGUYEN THI THU GB 2\",\n" +
                "    \"vnName\": \"HAI NGUYEN THI THU VN HAI NGUYEN THI THU VN 2\",\n" +
                "    \"language\": \"1\",\n" +
                "    \"vpbIndustry\": \"97000\",\n" +
                "    \"industryGroup\": \"\",\n" +
                "    \"revenue\": \"\",\n" +
                "    \"noEmployee\": \"\",\n" +
                "    \"investorType\": \"\",\n" +
                "    \"industry\": \"2451\",\n" +
                "    \"pcb\": \"YES\",\n" +
                "    \"mNemonic\": \"HAINTT12\",\n" +
                "    \"addCode\": \"\",\n" +
                "    \"addValue\": \"\",\n" +
                "    \"vpbIntroducer\": \"\",\n" +
                "    \"service\": \"\",\n" +
                "    \"serviceChannel\": \"\",\n" +
                "    \"postingRestrict\": \"\",\n" +
                "    \"docChangeNo\": \"\",\n" +
                "    \"customerStatus\": \"1\",\n" +
                "    \"accountOfficer\": \"133\",\n" +
                "    \"target\": \"1\",\n" +
                "    \"coEstablishNum\": \"\",\n" +
                "    \"vpbLnkPartner\": \"1-NONE\",\n" +
                "    \"totalCapital\": \"\",\n" +
                "    \"nativeCountry\": \"\",\n" +
                "    \"subSegment\": \"MASSAF\",\n" +
                "    \"mafType\": \"\",\n" +
                "    \"documentList\": [\n" +
                "        {\n" +
                "            \"type\": \"Identification Card\",\n" +
                "            \"number\": \"024176000099\",\n" +
                "            \"issuePlace\": \"CA HA NOI\",\n" +
                "            \"issueDate\": \"2014-03-22\",\n" +
                "            \"expiryDate\": \"2000-03-22\",\n" +
                "            \"primary\": \"true\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"contactList\": [\n" +
                "        {\n" +
                "            \"contactType\": \"Mobile\",\n" +
                "            \"contactInfo\": \"0854303140\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"contactType\": \"email\",\n" +
                "            \"contactInfo\": \"vpbcus76829@gmail.com\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"region\": \"\",\n" +
                "    \"curAddress\": {\n" +
                "        \"street1\": \"VPBank Add 76829 VN\",\n" +
                "        \"street2\": \"\",\n" +
                "        \"town1\": \"VPBank Add 76829 VN\",\n" +
                "        \"town2\": \"\",\n" +
                "        \"provinceCity\": \"VPBank Add 76829 VN\"\n" +
                "    },\n" +
                "    \"vpbAddress\": {\n" +
                "        \"ward\": \"Phuong Quan Hoa\",\n" +
                "        \"district\": \"Quan Cau Giay\",\n" +
                "        \"province\": \"Ha Noi\",\n" +
                "        \"nativeCountry\": \"\"\n" +
                "    },\n" +
                "    \"perAddress\": {\n" +
                "        \"street\": \"VPBank Add 76829 VN\",\n" +
                "        \"province\": \"VPBank Add 76829 VN\"\n" +
                "    },\n" +
                "    \"vpbWards\": \"Phuong Quan Hoa\",\n" +
                "    \"openDate\": \"2007-09-25\",\n" +
                "    \"cardOverdue\": \"NO\",\n" +
                "    \"vpbIndustryDes\": \"Hoat dong lam thue cong viec gia d inh trong cac ho gia dinh\",\n" +
                "    \"totalNumberSocialInsurance\": \"\",\n" +
                "    \"cuRelInfo\": {\n" +
                "        \"name\": \"\",\n" +
                "        \"legalId\": \"\",\n" +
                "        \"pos\": \"\",\n" +
                "        \"issueDate\": \"\",\n" +
                "        \"mobile\": \"\",\n" +
                "        \"email\": \"\"\n" +
                "    },\n" +
                "    \"otherRelInfo\": {\n" +
                "        \"type\": \"\",\n" +
                "        \"name\": \"\",\n" +
                "        \"legalId\": \"\"\n" +
                "    },\n" +
                "    \"otherInfo\": {\n" +
                "        \"docId\": \"\",\n" +
                "        \"fromDate\": \"\",\n" +
                "        \"toDate\": \"\",\n" +
                "        \"issueDate\": \"\"\n" +
                "    },\n" +
                "    \"legalRepInfo\": {\n" +
                "        \"issueDate\": \"\",\n" +
                "        \"email\": \"\",\n" +
                "        \"mobile\": \"\"\n" +
                "    },\n" +
                "    \"assessStatus\": \"NEW\",\n" +
                "    \"reAssetAF\": \"\",\n" +
                "    \"vpbRelTax\": \"\",\n" +
                "    \"vpbOtherTax\": \"\",\n" +
                "    \"vpbLegalTax\": \"\"\n" +
                "}";
    }
}
