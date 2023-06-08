package myCollections;

import java.util.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapsTutorial {
    public static void main() {
        Map<String, Object> payment = new HashMap<>();
        payment.put("owner", "Ada D. Monkey");
        payment.put("balance", 9999.9);
        payment.put("accountNo", "123-333-2224");

        System.out.println(payment);

        if (!payment.containsKey("ada")) {
            System.out.println("Key 'ada' is not found.");
        }

        Map<String, Object> logging = new HashMap<>();
        logging.put("datetime", "2023-06-07, 15:40:00 UTC+07");
        logging.put("action", "update payment object");
        logging.put("error", "no error");

        payment.putAll(logging);
        payment.remove("error");

        System.out.println("After log updated: " + payment);

        // Iterator - Loop
        Iterator<Map.Entry<String, Object>> iterator = payment.entrySet().iterator();
        while (iterator.hasNext()) {
            var entry = iterator.next();
            System.out.printf("Key: %s value: %s\n", entry.getKey(), entry.getValue());
        }
    }
}
