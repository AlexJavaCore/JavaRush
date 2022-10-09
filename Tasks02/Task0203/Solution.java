/* 
Ñðàâíåíèå ÷èñåë
Â êëàññå Solution åñòü òðè ïîëÿ ñ îäèíàêîâûìè çíà÷åíèÿìè.
Â ìåòîäå main ïðîèñõîäèò èõ ñðàâíåíèå ñ âûâîäîì ðåçóëüòàòà â êîíñîëè.
Äîáàâü èñïîëüçîâàíèå ìåòîäà equals() â ìåòîäå main òàêîå ìèíèìàëüíîå êîëè÷åñòâî ðàç,
÷òîáû âûâîä áûë:
true
true
true
*/

public class Solution {
    static Integer first = 1000;
    static Integer second = 1000;
    static int third = 1000;

    public static void main(String[] args) {
        System.out.println(first.equals(second));
        System.out.println(third == second);
        System.out.println(third == first);
    }
}
