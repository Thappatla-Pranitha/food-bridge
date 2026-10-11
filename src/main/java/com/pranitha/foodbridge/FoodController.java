
package com.pranitha.foodbridge;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/food")
public class FoodController {

    private final List<Map<String, Object>> foodItems =
            new ArrayList<>();

    @GetMapping
    public List<Map<String, Object>> getAllFood() {
        return foodItems;
    }

    @PostMapping
    public Map<String, Object> addFood(
            @RequestBody Map<String, Object> food) {

        food.put("id", foodItems.size() + 1);
        foodItems.add(food);

        return food;
    }

    @GetMapping("/{id}")
    public Map<String, Object> getFoodById(
            @PathVariable int id) {

        return foodItems.stream()
                .filter(food ->
                    food.get("id").equals(id))
                .findFirst()
                .orElseThrow(() ->
                    new NoSuchElementException(
                        "Food item not found"));
    }
}
