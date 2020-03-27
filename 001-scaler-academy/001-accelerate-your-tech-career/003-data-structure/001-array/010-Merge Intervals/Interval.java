package io.github.raveerocks;


public class Interval {
    int start;
    int end;

    /**
     * Default Constructor
     */
    Interval() {
        start = 0;
        end = 0;
    }

    /**
     *
     * @param s : start
     * @param e : end
     */
    Interval(int s, int e) {
        start = s;
        end = e;
    }
}