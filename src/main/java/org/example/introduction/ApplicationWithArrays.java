package org.example.introduction;

import java.util.Collection;
import java.util.List;

public class ApplicationWithArrays {

    public static void main(String[] args) {
        Contract contract = new Implementation();

        printTerms(contract);

    }

    public static void printTerms(Contract contract) {
        contract.termOne();
        contract.termTwo();
        contract.termExtended();
    }


}
