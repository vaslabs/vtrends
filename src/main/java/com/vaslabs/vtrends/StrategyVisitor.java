package com.vaslabs.vtrends;

/**
 * Created by vnicolaou on 30/08/15.
 */
public interface StrategyVisitor {
    void visit(AbstractTrendStrategy trendStrategy);
}
