/* 
Автоупаковка
В классе Solution представлены 8 переменных примитивных типов с именами вида типValue.
Для каждой из этих переменных необходимо создать объекты-обертки и присвоить им имена вида типValueBox.
Для создания объектов-оберток используй метод Тип.valueOf(примитив).
Пример переменной объекта-обертки: Integer integerValueBox = ....;
*/

public class Solution {
    byte byteValue;
    short shortValue;
    int intValue;
    long longValue;

    float floatValue;
    double doubleValue;

    char charValue;
    boolean booleanValue;

    Byte byteValueBox = Byte.valueOf(byteValue);
    Short shortValueBox = Short.valueOf(shortValue);
    Integer integerValueBox = Integer.valueOf(intValue);
    Long longValueBox = Long.valueOf(longValue);

    Float floatValueBox = Float.valueOf(floatValue);
    Double doubleValueBox = Double.valueOf(doubleValue);
    Character characterValueBox = Character.valueOf(charValue);
    Boolean booleanValueBox = Boolean.valueOf(booleanValue);
}