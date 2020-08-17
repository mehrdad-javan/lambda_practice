package se.lexicon.interfaces;

import se.lexicon.model.Product;

public interface Conditional {

    boolean test(Product product);
}
