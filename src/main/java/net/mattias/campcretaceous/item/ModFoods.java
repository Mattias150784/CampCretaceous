package net.mattias.campcretaceous.item;


import net.minecraft.world.food.FoodProperties;

public class ModFoods {


      public static final FoodProperties RAW_ANKYLOSAURUS  = new FoodProperties.Builder().nutrition(1).fast()
            .saturationMod(0.3f).build();

    public static final FoodProperties COOKED_ANKYLOSAURUS  = new FoodProperties.Builder().nutrition(1).fast()
            .saturationMod(0.7f).build();
}