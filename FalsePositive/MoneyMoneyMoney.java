public class MoneyMoneyMoney {
        MoneyMoneyMoney notThisInstance;

        public int mustBeFunny(MoneyMoneyMoney other) {
            if (notThisInstance.equals(other.notThisInstance)) {
                return 1;
            }
            return 0;
        }
}
