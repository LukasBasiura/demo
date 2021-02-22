package examples.junit;

public class ExampleClass {

    private Money setElement;

    private Money falseNotUsed;

    public ExampleClass(Money setElement) {
        this.setElement = setElement;
    }

    public ExampleClass(Money setElement, Money falseParameter) {
        this(setElement);
        falseNotUsed = falseParameter;
    }

    IMoney aTestMethod(SimpleObjectHandler simpleObjectHandler) {
        SimpleObjectHandler fieldHandler = simpleObjectHandler;
        SimpleGenericHandler<Money> genericHandler = new SimpleGenericHandler(setElement);


        Object fieldHandlerElement = fieldHandler.getElement();
        Money genericHandlerElement = genericHandler.getElement();

        //Return point
        setElement = getElement((Money) genericHandlerElement.multiply(2));
        int hashCode = setElement.hashCode();

        fieldHandlerElement = getElement((Money) genericHandlerElement.multiply(2));

        if (!setElement.equals(fieldHandlerElement)) {
            return null;
        }

        String currency = setElement.currency();
        String currencyGeneric = genericHandlerElement.currency();
        String fieldHandlerCurrency = ((Money) fieldHandlerElement).currency();

        genericHandlerElement = (Money) genericHandlerElement.multiply(2);
        String newCurrency = genericHandlerElement.currency();
        genericHandlerElement = (Money) genericHandlerElement.multiply(2);


        return new Money(1, currency.concat(currencyGeneric).concat(fieldHandlerCurrency));
    }


    public Money setSetElement(Money setElement) {
        this.setElement = setElement;
        return setElement;
    }

    public Money getElement(Money setElement) {
        Money money = new Money(1,"200");
        money.addMoney(setElement);
        return money;
    }

}
