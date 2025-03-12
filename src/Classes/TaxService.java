package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

/**
 * Класс TaxService, представляющий налоговую инспекцию.
 */
public class TaxService implements iActorBehaviour, iReturnOrder {
    private String name;
    private boolean isTakeOrder;
    private boolean isMakeOrder;
    /**
     * Конструктор класса SpecialClient.
     */
    public TaxService() {
        this.name = "Tax audit";
    }
    /**
     * Метод для получения имени клиента.
     * @return имя клиента
     */
    public String getName() {

        return name;
    }
    /**
     * Метод для проверки, хочет ли клиент сделать заказ.
     * @return true, если клиент хочет сделать заказ, иначе false
     */
    @Override
    public boolean isMakeOrder() {

        return isMakeOrder;
    }
    /**
     * Метод для проверки, готов ли клиент забрать заказ.
     * @return true, если клиент готов забрать заказ, иначе false
     */
    @Override
    public boolean isTakeOrder() {

        return isTakeOrder;
    }
    /**
     * Метод для установки флага о желании клиента сделать заказ.
     * @param makeOrder значение флага
     */
    @Override
    public void setMakeOrder(boolean makeOrder) {

        isMakeOrder = makeOrder;
    }
    /**
     * Метод для установки флага о готовности клиента забрать заказ.
     * @param pickUpOrder значение флага
     */
    @Override
    public void setTakeOrder(boolean pickUpOrder) {

        isTakeOrder = pickUpOrder;
    }
    /**
     * Метод для получения объекта клиента.
     * @return объект клиента
     */
    @Override
    public Actor getActor() {

        return new OrdinaryClient(name);
    }

    /**
     * Метод для проверки возможности возврата товара.
     * @return true - если возврат возможен, false - если нет.
     */
    @Override
    public boolean isCanReturn() {
        return true;
    }

    /**
     * Метод для установки флага о возможности клиента вернуть заказ.
     * @param canReturn значение флага
     */
    @Override
    public void setReturnOrder(boolean canReturn){
        //isCanReturn() = canReturn;
    }
}
