package day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {

    @Test
    void testCreateByName() {
        Recipe recipe = new Recipe("Gulyás leves");
        assertEquals("Gulyás leves", recipe.getName());
        assertNull(recipe.getDescription());
        assertEquals(0, recipe.getIngredients().size());
    }

    @Test
    void testCreateByNameAndDescription() {
        Recipe recipe = new Recipe("Gulyás leves", "Nagyon finom");
        assertEquals("Gulyás leves", recipe.getName());
        assertEquals("Nagyon finom", recipe.getDescription());
        assertEquals(0, recipe.getIngredients().size());
    }

    @Test
    void testAddIngredient() {
        Recipe recipe = new Recipe("Gulyás leves", "Nagyon finom");
        recipe.addIngredient("hagyma");
        assertEquals("hagyma", recipe.getIngredients().get(0));
    }

    @Test
    void testAddMoreIngredients() {
        Recipe recipe = new Recipe("Bableves", "Nagyon finom");
        recipe.addIngredient("hagyma", "bab", "répa");
        assertEquals(3, recipe.getIngredients().size());
        assertArrayEquals(new String[]{"hagyma", "bab", "répa"}, recipe.getIngredients().toArray());
    }
}