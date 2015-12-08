package com.vaslabs.vtrends;

import com.vaslabs.vtrends.impl.AbstractTrendStrategy;

/**
 * Created by vnicolaou on 30/08/15.
 */
public interface StrategyVisitor {
    void visit(AbstractTrendStrategy trendStrategy);
}
