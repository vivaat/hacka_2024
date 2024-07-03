public class AIslave{
    int y;
    float x;

    public int IsAICanHandleIT(AIslave aiMaster) {
        if(y == aiMaster.y)
            return 1;
        if(x == aiMaster.x)
            return 2;
        return 0;
    }
}