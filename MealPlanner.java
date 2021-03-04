package test1;

import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MealPlanner {

    Map<String, List<Float>> map = new LinkedHashMap<>();

    @Test
    void planMeal() {
        map.put("Rice", List.of(92f, 0f, 8f));
        map.put("Yellow Lentils", List.of(76f, 0f, 24f));
        map.put("Egg", List.of(10f, 50f, 40f));
        map.put("Peanuts", List.of(8f, 60f, 32f));
        map.put("Cashew", List.of(0f, 70f, 30f));
        map.put("Milk", List.of(30f, 40f, 30f));
        map.put("Apple", List.of(100f, 0f, 0f));
        map.put("Spinach", List.of(60f, 0f, 40f));
        map.put("Butter", List.of(0f, 100f, 0f));
        map.put("Cheese", List.of(0f, 60f, 40f));
        map.put("Almonds", List.of(5f, 55f, 40f));

        printMeals(map, 2000, 50, 30, 20);
    }

    void printMeals(Map<String, List<Float>> data, float calories, float carb, float protein, float fat) {

        float carbsGram = (calories * carb / 100) / 4.1f;
        float proteinGram = (calories * carb / 100) / 4.1f;
        float fatGram = (calories * carb / 100) / 9f;

        System.out.println("item\tcarbs in gm\tprotein in gm\tfat in gm");

        for (Map.Entry<String, List<Float>> entry : data.entrySet()) {
            List<Float> types = entry.getValue();

            float carbsGms = (types.get(0)) / (types.size() * 100) * carbsGram;
            float proteinGms = (types.get(1)) / (types.size() * 100) * proteinGram;
            float fatGms = (types.get(2)) / (types.size() * 100) * fatGram;

            System.out.println(entry.getKey() + "\t" + carbsGms + "\t" + proteinGms + "\t" + fatGms);
        }
    }
}
