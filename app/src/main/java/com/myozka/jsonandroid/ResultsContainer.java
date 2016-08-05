package com.myozka.jsonandroid;

/**
 * Created by myozka on 8/4/2016.
 */

public class ResultsContainer {
    private final long mDuration;
    private final int mTestRepeats;
    private final String mParserName;

    public long getDuration() {
        return mDuration;
    }

    public int getTestRepeats() {
        return mTestRepeats;
    }

    public String getParserName() {
        return mParserName;
    }

    public ResultsContainer(String parserName, long duration, int testRepeats){
        mParserName = parserName;
        mDuration = duration;
        mTestRepeats = testRepeats;
    }

}
