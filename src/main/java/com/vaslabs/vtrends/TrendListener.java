package com.vaslabs.vtrends;

import com.vaslabs.vtrends.types.TrendDirection;
import com.vaslabs.vtrends.types.TrendPoint;
import com.vaslabs.vtrends.types.VelocityState;

/**
 * Created by vnicolao on 16/05/15.
 */
public interface TrendListener {
    void onTrendEvent();

    VelocityState getVelocityState();

    TrendPoint getValueLimit();

    TrendDirection getDirectionAction();

}
