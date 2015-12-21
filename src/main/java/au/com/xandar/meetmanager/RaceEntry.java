/*
 * Copyright (c) Xandar IP 2013.
 *
 * All Rights Reserved
 * No part of this application may be reproduced, copied, modified or adapted, without the prior written consent
 * of the author, unless otherwise indicated for stand-alone materials.
 *
 * Contact support@xandar.com.au for copyright requests.
 */

package au.com.xandar.meetmanager;

import java.util.Arrays;

/**
 * An entry of a single competitor into a race.
 */
@SuppressWarnings("unused")
public class RaceEntry {

    /**
     * @since  version 1
     */
    public Integer laneNr;

    /**
     * @since  version 1
     */
    public String competitorId;

    /**
     * @since  version 1
     */
    public String competitorName;

    /**
     * @since  version 1
     */
    public String competitorClub;

    /**
     * This is the official time for this RaceEntry.
     * @since  version 1
     */
    public Integer timeInMillis;

    /**
     * Any touchpad time that was recorded.
     * @since  version 5
     */
    public Integer padTimeInMillis;

    /**
     * 1st backup time that was recorded.
     * @since  version 5
     */
    public Integer backup1TimeInMillis;

    /**
     * 2nd backup time that was recorded.
     * @since  version 5
     */
    public Integer backup2TimeInMillis;

    /**
     * 3rd backup time that was recorded.
     * @since  version 5
     */
    public Integer backup3TimeInMillis;

    /**
     * Any manual time that was recorded.
     * @since  version 5
     */
    public Integer manualTimeInMillis;

    /**
     * Lap times if they were recorded.
     *
     * @since  version 1
     */
    public Integer[] splitsInMillis;

    /**
     * Position of this RaceEntry within it's heat.
     *
     * @since  version 1
     * @deprecated since version 9. Use {@link #heatPosition} instead.
     */
    public Integer position;

    /**
     * Position of this RaceEntry within it's heat.
     * Previously known as {@link #position}.
     *
     * @since  version 9
     */
    public Integer heatPosition;

    /**
     * The position of this RaceEntry across all heats of this Event (of the same EventType).
     *
     * @since  version 9
     */
    public Integer eventPosition;

    /**
     * @since  version 1
     */
    public ResultStatus status;

    /**
     * @since  version 1
     */
    public String dqItemId;

    /**
     * @since  version 1
     */
    public String dqDisplayCode;

    @Override
    public String toString() {
        return "RaceEntry{" +
            "laneNr=" + laneNr +
            ", competitorId=" + competitorId +
            ", competitorName='" + competitorName + '\'' +
            ", competitorClub='" + competitorClub + '\'' +
            ", timeInMillis=" + timeInMillis +
            ", padTimeInMillis=" + padTimeInMillis +
            ", backup1TimeInMillis=" + backup1TimeInMillis +
            ", backup2TimeInMillis=" + backup2TimeInMillis +
            ", backup3TimeInMillis=" + backup3TimeInMillis +
            ", manualTimeInMillis=" + manualTimeInMillis +
            ", splitsInMillis=" + Arrays.toString(splitsInMillis) +
            ", position=" + position +
            ", status=" + status +
            ", dqItemId='" + dqItemId + '\'' +
            ", dqDisplayCode='" + dqDisplayCode + '\'' +
            '}';
    }
}
