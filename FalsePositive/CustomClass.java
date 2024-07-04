public class CustomClass {

    Object customField;

    public boolean isEqual(CustomClass otherCustom) {
        if(customField != otherCustom.customField)
            return false;
        else 
            return customField.equals(otherCustom.customField); 
    }
}
