package com.mdc.enva.Collection.Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class HelpDesk {
    private final Queue<Enquiry> enquiries = new ArrayDeque<>();

    public void enquire(final Customer customer, Category category) {
        enquiries.offer(new Enquiry(customer, category));
    }

    public void proccessPrinterEnquiry() {
        enquiries.stream()
                .filter(enq -> enq.getCategory() == Category.PRINTER)
                .forEach(enq -> {
                    enq.getCustomer().reply("test printer");
                });

    }

    public void processGeneralEnquiry() {
        Enquiry enquiry;
        while ((enquiry = enquiries.poll()) != null) {
            enquiry.getCustomer().reply("test");
        }

    }
}
