package com.Nick.DishProject.exception;

public class IngredientNotFoundException extends RuntimeException {
    public IngredientNotFoundException(String s) {
        super(s);
    }
}
