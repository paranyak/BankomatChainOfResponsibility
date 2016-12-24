package com.paranyak;

/**
 * Created by cs.ucu.edu.ua on 12/24/2016.
 */
public interface DispenseChain {
    /**
     *
     * @param nextChain next Chain
     */
    void setNextChain(DispenseChain nextChain);

    /**
     *
     * @param cur current amount
     */
    void dispense(Currency cur);
}
