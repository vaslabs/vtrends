package com.vaslabs.vtrends.types;

/**
 * Created by vnicolao on 10/05/15.
 */
public interface Differentiable<T extends Differentiable> extends Comparable<T> {
    double differantiate(T differentiable);
}
