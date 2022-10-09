/* 
Àâòîóïàêîâêà
Â êëàññå Solution ïðåäñòàâëåíû 8 ïåðåìåííûõ ïðèìèòèâíûõ òèïîâ ñ èìåíàìè âèäà òèïValue.
Äëÿ êàæäîé èç ýòèõ ïåðåìåííûõ íåîáõîäèìî ñîçäàòü îáúåêòû-îáåðòêè è ïðèñâîèòü èì èìåíà âèäà òèïValueBox.
Äëÿ ñîçäàíèÿ îáúåêòîâ-îáåðòîê èñïîëüçóé ìåòîä Òèï.valueOf(ïðèìèòèâ).
Ïðèìåð ïåðåìåííîé îáúåêòà-îáåðòêè: Integer integerValueBox = ....;
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
