package com.mdc.enva.DesignPattern.Creartional.AbstractFactory;

public class VisaFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {
//        switch (cardType) {
//            case GOLD:
//                break;
//            case PLATINUM:
//                break;
//            default:
//                break;
//        }
        return new CreditCard();
    }

    @Override
    public Validator getValidator(CardType cardType) {
        return null;
    }
}
