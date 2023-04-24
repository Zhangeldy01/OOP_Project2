package Classes;
/**
 * Класс PromotionalClient, представляющий акционного клиента.
 */
public class PromotionalClient extends Actor {
    private String promotionalName;
    private static int promotionalNumber;
   private static int maxPromotionalClients = 9;

    /**
     * Конструктор класса PromotionalClient.
     * @param name имя клиента
     * @param promotionalName название акции
     * @param promotionalNumber номер клиента в акции
     // * @param maxPromotionalClients максимальное количество участников акции
     */
    public PromotionalClient(String name, String promotionalName, int promotionalNumber) {
        super(name);
        this.promotionalName = promotionalName;
        PromotionalClient.promotionalNumber = promotionalNumber;
    }

    /**
     * Возвращает название акции
     * @return название акции
     */
    public String getPromotionalName() {
        return promotionalName;
    }


    /**
     * Возвращает номер клиента в акции
     * @return номер клиента в акции
     */
    public static int getPromotionalNumber() {
        return promotionalNumber;
    }

    /**
     * Возвращает максимальное количество участников акции
     * @return максимальное количество участников акции
     */
    public static int getMaxPromotionalClients() {
        return maxPromotionalClients;
    }
    /**
     * Метод для получения имени клиента.
     * @return имя клиента
     */
    @Override
    public String getName() {
        return super.name;
    }

    /**
     * Метод для проверки, хочет ли клиент сделать заказ.
     * @return true, если клиент хочет сделать заказ, иначе false
     */
    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    /**
     * Метод для проверки, готов ли клиент забрать заказ.
     * @return true, если клиент готов забрать заказ, иначе false
     */
    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    /**
     * Метод для установки флага о желании клиента сделать заказ.
     * @param makeOrder значение флага
     */
    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    /**
     * Метод для установки флага о готовности клиента забрать заказ.
     * @param pickUpOrder значение флага
     */
    @Override
    public void setTakeOrder(boolean pickUpOrder) {
        super.isTakeOrder = pickUpOrder;
    }

    /**
     * Метод для получения объекта клиента.
     * @return объект клиента
     */
    @Override
    public Actor getActor() {
        return this;
    }

    /**
     * Метод для проверки возможности возврата товара.
     * @return true - если возврат возможен, false - если нет.
     */
    @Override
    public boolean isCanReturn() {
        return super.isCanReturn;
    }

    /**
     * Метод для установки флага о возможности клиента вернуть заказ.
     * @param canReturn значение флага
     */
    @Override
    public void setReturnOrder(boolean canReturn) {
        super.isCanReturn = canReturn;
    }
}
