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

import java.util.Collections;
import java.util.List;

/**
 * A Race as represented within the MeetManagement Service.
 */
@SuppressWarnings("unused")
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
     * Sub grouping within an event. Null if none.
     *
     * @since version 10
     */
    public String eventAlpha;

    /**
     * @since  version 10
     */
    public Round round;

    /**
     * @since  version 1
     * @deprecated since version 10 - use {@link #round} instead.
     */
    public Round eventType;

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
     * @since 14
     */
    public Gender gender;

    /**
     * @since 10
     */
    public Integer lowAge;

    /**
     * @since 10
     */
    public Integer highAge;

    /**
     * @since 10
     */
    public Integer distance;

    /**
     * @since 10
     */
    public Stroke stroke;

    /**
     * @since 10
     */
    public Boolean relay;

    /**
     * The number of lanes that are available for this race.
     *
     * @since 12
     */
    public Integer availableNrLanes;

    /**
     * @since  version 1
     */
    public List<RaceEntry> raceEntries = Collections.emptyList();

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Race)) {
            return false;
        }

        Race race = (Race) o;

        if (raceId != null ? !raceId.equals(race.raceId) : race.raceId != null) {
            return false;
        }
        if (eventNr != null ? !eventNr.equals(race.eventNr) : race.eventNr != null) {
            return false;
        }
        if (eventAlpha != null ? !eventAlpha.equals(race.eventAlpha) : race.eventAlpha != null) {
            return false;
        }
        if (round != race.round) {
            return false;
        }
        if (eventType != race.eventType) {
            return false;
        }
        if (heatNr != null ? !heatNr.equals(race.heatNr) : race.heatNr != null) {
            return false;
        }
        if (description != null ? !description.equals(race.description) : race.description != null) {
            return false;
        }
        if (raceState != race.raceState) {
            return false;
        }
        if (gender != null ? !gender.equals(race.gender) : race.gender != null) {
            return false;
        }
        if (lowAge != null ? !lowAge.equals(race.lowAge) : race.lowAge != null) {
            return false;
        }
        if (highAge != null ? !highAge.equals(race.highAge) : race.highAge != null) {
            return false;
        }
        if (distance != null ? !distance.equals(race.distance) : race.distance != null) {
            return false;
        }
        if (stroke != race.stroke) {
            return false;
        }
        if (relay != null ? !relay.equals(race.relay) : race.relay != null) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = raceId != null ? raceId.hashCode() : 0;
        result = 31 * result + (eventNr != null ? eventNr.hashCode() : 0);
        result = 31 * result + (eventAlpha != null ? eventAlpha.hashCode() : 0);
        result = 31 * result + (round != null ? round.hashCode() : 0);
        result = 31 * result + (eventType != null ? eventType.hashCode() : 0);
        result = 31 * result + (heatNr != null ? heatNr.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (raceState != null ? raceState.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (lowAge != null ? lowAge.hashCode() : 0);
        result = 31 * result + (highAge != null ? highAge.hashCode() : 0);
        result = 31 * result + (distance != null ? distance.hashCode() : 0);
        result = 31 * result + (stroke != null ? stroke.hashCode() : 0);
        result = 31 * result + (relay != null ? relay.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Race{" +
            "raceId='" + raceId + '\'' +
            ", eventNr=" + eventNr +
            ", eventAlpha='" + eventAlpha + '\'' +
            ", round=" + round +
            ", eventType=" + eventType +
            ", heatNr=" + heatNr +
            ", description='" + description + '\'' +
            ", raceState=" + raceState +
            ", gender='" + gender + '\'' +
            ", lowAge=" + lowAge +
            ", highAge=" + highAge +
            ", distance=" + distance +
            ", stroke=" + stroke +
            ", relay=" + relay +
            '}';
    }
}
