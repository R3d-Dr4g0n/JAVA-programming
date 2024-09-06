// First Non-Repeated Character in a String

import java.util.LinkedHashMap;
import java.util.Map;

public char firstNonRepeatedCharacter(String str) {
    Map<Character, Integer> charCountMap = new LinkedHashMap<>();
    for (char c : str.toCharArray()) {
        charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
    }
    for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
        if (entry.getValue() == 1) {
            return entry.getKey();
        }
    }
    return '_'; // Return '_' if there is no non-repeated character
}
