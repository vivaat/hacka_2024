public class TestEquals {
    TestEquals notThisInstance;

    public int getInt(TestEquals other) {
        if (notThisInstance == other.notThisInstance) {
            return 1;
        }
        return 0;
    }
}
