package stack_queue.bai_tap.tree_map;
import java.util.TreeMap;

public class TreeMapString {
	public static void main(String[] args) {
		String string = "anh yêu em em không yêu anh cô ấy yêu anh anh không yêu cô ấy";
        String[] arrays = string.split("\\s");
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        String temp;
        int count;
        for (String element : arrays) {
            temp = element.toUpperCase();
            if (treeMap.containsKey(temp)) {
                count = treeMap.get(temp);
                treeMap.put(temp, count + 1);
            } else treeMap.put(temp, 1);
        }
        System.out.println(treeMap);

	}
	
}