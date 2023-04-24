import Classes.Market;
import Classes.OrdinaryClient;
import Classes.SpecialClient;
import Classes.TaxService;
import Interfaces.iActorBehaviour;
import Classes.PromotionalClient;

/**
 * Главный класс приложения.
 */
public class App {

    /**
     * Метод main, запускающий приложение.
     * @param args аргументы командной строки.
     */
    public static void main(String[] args) {

        //    Market market = new Market();
        //    OrdinaryClient client1 = new OrdinaryClient("Boris");
        //    OrdinaryClient client2 = new OrdinaryClient("Dasha");
        //    SpecialClient client3 = new SpecialClient("Fedor", 1101);
        //    market.acceptToMarket(client1);
        //    market.acceptToMarket(client2);
        //    market.acceptToMarket(client3);
        //    market.update();

        Market market = new Market();
        iActorBehaviour item1 = new OrdinaryClient("Boris");
        iActorBehaviour item2 = new SpecialClient("Fedor", 1101);
        iActorBehaviour item3 = new OrdinaryClient("Dasha");
        iActorBehaviour item4 = new TaxService();
        iActorBehaviour item5 = new PromotionalClient("Dima", "2+1=2", 6);

        /**
         * Обычный клиент, пройдет все этапы
         */
        market.acceptToMarket(item1);
        market.acceptToMarket(item3);
        market.update();

        /**
         * ВИП клиент, пройдет все этапы, исключая возврат товара
         */
        market.acceptToMarket(item2);
        market.takeOrder();
        market.giveOrder();
        market.releaseFromQueue();

        /**
         * Налоговый служащий, как обычный клиент пройдет все этапы
         */
        market.acceptToMarket(item4);
        market.update();

        /**
         * Акционный клиент, получает отказ в обслуживании
         */
        market.acceptToMarket(item5);
        market.checkPromotional(item5);
    }
}