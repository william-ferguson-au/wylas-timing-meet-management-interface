/*
 * Copyright (c) Xandar IP 2013.
 *
 * All Rights Reserved
 * No part of this application may be reproduced, copied, modified or adapted, without the prior written consent
 * of the author, unless otherwise indicated for stand-alone materials.
 *
 * Contact support@xandar.com.au for copyright requests.
 */

package au.com.xandar.meetmanager.rest;

import java.util.Collections;
import java.util.List;

/**
 * A Race as represented within the MeetManagement Service.
 */
public final class Race {

    /**
     * Opaque Race identifier. Unique for each race within a Meet.
     *
     * @since version 1
     */
    public String raceId;


    /**
     * @since  version 1
     */
    public Integer eventNr;

    /**
     * @since  version 1
     */
    public EventType eventType;

    /**
     * Splits events up into heats.
     *
     * @since  version 1
     */
    public Integer heatNr;

    /**
     * Reasonably short (less than 30 char) description.
     * It should contain enough information about the race to make sense.
     * Eg 100m Freestyle Boys 8 yrs
     *    4*50m Medley Relay Girls 10-12 yrs
     *
     * @since version 1
     */
    public String description;


    /**
     * @since  version 1
     */
    public RaceState raceState = RaceState.Unmarshalled;

    /**
     * @since  version 1
     */
    public List<RaceEntry> raceEntries = Collections.emptyList();

    @Override
    public String toString() {
        return "Race{" +
                "eventNr=" + eventNr +
                ", eventType=" + eventType +
                ", heatNr=" + heatNr +
                ", nrRaceEntries=" + raceEntries.size() +
                '}';
    }
}
