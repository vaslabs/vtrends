package com.vaslabs.vtrends;

/**
 * Created by vnicolao on 16/05/15.
 */
public interface TrendListener {
    void onTrendEvent();

    VelocityState getVelocityState();

    TrendPoint getValueLimit();

    TrendDirection getDirectionAction();

}
