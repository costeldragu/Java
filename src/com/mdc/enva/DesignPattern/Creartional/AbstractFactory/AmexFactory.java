package com.mdc.enva.DesignPattern.Creartional.AbstractFactory;

public class AmexFactory extends CreditCardFactory {
    @Override
    public CreditCard getCreditCard(CardType cardType) {
        return null;
    }

    @Override
    public Validator getValidator(CardType cardType) {
        return null;
    }
}
