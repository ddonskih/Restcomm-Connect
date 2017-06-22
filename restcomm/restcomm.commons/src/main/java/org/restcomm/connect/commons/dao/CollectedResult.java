package org.restcomm.connect.commons.dao;

/**
 * Created by hamsterksu on 6/6/17.
 */
public class CollectedResult {

    private final String result;
    private final boolean isAsr;

    public CollectedResult(String result, boolean isAsr) {
        this.result = result;
        this.isAsr = isAsr;
    }

    public String getResult() {
        return result;
    }

    public boolean isAsr() {
        return isAsr;
    }
}
