package com.mdc.enva.Collection.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        // write your code here
        HelpDesk helpDesk = new HelpDesk();
        helpDesk.enquire(Customer.JACK, Category.PHONE);
        helpDesk.enquire(Customer.JILL, Category.PRINTER);

        helpDesk.proccessPrinterEnquiry();
        helpDesk.processGeneralEnquiry();
    }
}
