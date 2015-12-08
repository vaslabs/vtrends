package com.vaslabs.vtrends;


import com.vaslabs.vtrends.types.Differentiable;
import com.vaslabs.vtrends.types.TrendPoint;

import java.util.List;

public interface Trend<V extends Number, P extends Differentiable> {
    void acceptValue(V value, P point);
    void getValueAt(P point);
    List<TrendPoint> getNormalisedTrend();
}
