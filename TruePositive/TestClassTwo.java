public class TestClassTwo {

    Object var1;
    Object var2;

    public boolean isIdentical(TestClass otherTest) {
        if(var1 == otherTest.var1 && var2 == otherTest.var2)
            return true;
        else
            return false;
    }
}
