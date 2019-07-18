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
     * @deprecated since version 10 - use {@link #competitorFirstName} and {@link #competitorLastName} instead.
     */
    public String competitorName;

    /**
     * @since  version 10
     */
    public String competitorFirstName;

    /**
     * @since  version 10
     */
    public String competitorLastName;

    /**
     * @since  version 1
     */
    public String competitorClub;

    /**
     * @since  version 10
     */
    public String competitorClubAbbreviation;

    /**
     * A RaceEntry marked as as exhibition swim will receive a time but cannot place or score.
     *
     * @since  version 10
     */
    public Boolean exhibitionSwim;

    /**
     * The time provided by the competitor as their entry time for this event.
     *
     * @since  version 15
     */
    public Integer entryTimeInMillis;

    /**
     * This is the official result time for this RaceEntry.
     *
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
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RaceEntry)) {
            return false;
        }

        RaceEntry entry = (RaceEntry) o;

        if (laneNr != null ? !laneNr.equals(entry.laneNr) : entry.laneNr != null) {
            return false;
        }
        if (competitorId != null ? !competitorId.equals(entry.competitorId) : entry.competitorId != null) {
            return false;
        }
        if (competitorName != null ? !competitorName.equals(entry.competitorName) : entry.competitorName != null) {
            return false;
        }
        if (competitorFirstName != null
            ? !competitorFirstName.equals(entry.competitorFirstName)
            : entry.competitorFirstName != null) {
            return false;
        }
        if (competitorLastName != null
            ? !competitorLastName.equals(entry.competitorLastName)
            : entry.competitorLastName != null) {
            return false;
        }
        if (competitorClub != null ? !competitorClub.equals(entry.competitorClub) : entry.competitorClub != null) {
            return false;
        }
        if (competitorClubAbbreviation != null
            ? !competitorClubAbbreviation.equals(entry.competitorClubAbbreviation)
            : entry.competitorClubAbbreviation != null) {
            return false;
        }
        if (entryTimeInMillis != null ? !entryTimeInMillis.equals(entry.entryTimeInMillis) : entry.entryTimeInMillis != null) {
            return false;
        }
        if (timeInMillis != null ? !timeInMillis.equals(entry.timeInMillis) : entry.timeInMillis != null) {
            return false;
        }
        if (padTimeInMillis != null ? !padTimeInMillis.equals(entry.padTimeInMillis) : entry.padTimeInMillis != null) {
            return false;
        }
        if (backup1TimeInMillis != null
            ? !backup1TimeInMillis.equals(entry.backup1TimeInMillis)
            : entry.backup1TimeInMillis != null) {
            return false;
        }
        if (backup2TimeInMillis != null
            ? !backup2TimeInMillis.equals(entry.backup2TimeInMillis)
            : entry.backup2TimeInMillis != null) {
            return false;
        }
        if (backup3TimeInMillis != null
            ? !backup3TimeInMillis.equals(entry.backup3TimeInMillis)
            : entry.backup3TimeInMillis != null) {
            return false;
        }
        if (manualTimeInMillis != null
            ? !manualTimeInMillis.equals(entry.manualTimeInMillis)
            : entry.manualTimeInMillis != null) {
            return false;
        }
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(splitsInMillis, entry.splitsInMillis)) {
            return false;
        }
        if (position != null ? !position.equals(entry.position) : entry.position != null) {
            return false;
        }
        if (heatPosition != null ? !heatPosition.equals(entry.heatPosition) : entry.heatPosition != null) {
            return false;
        }
        if (eventPosition != null ? !eventPosition.equals(entry.eventPosition) : entry.eventPosition != null) {
            return false;
        }
        if (status != entry.status) {
            return false;
        }
        if (dqItemId != null ? !dqItemId.equals(entry.dqItemId) : entry.dqItemId != null) {
            return false;
        }
        return dqDisplayCode != null ? dqDisplayCode.equals(entry.dqDisplayCode) : entry.dqDisplayCode == null;

    }

    @Override
    public int hashCode() {
        int result = laneNr != null ? laneNr.hashCode() : 0;
        result = 31 * result + (competitorId != null ? competitorId.hashCode() : 0);
        result = 31 * result + (competitorName != null ? competitorName.hashCode() : 0);
        result = 31 * result + (competitorFirstName != null ? competitorFirstName.hashCode() : 0);
        result = 31 * result + (competitorLastName != null ? competitorLastName.hashCode() : 0);
        result = 31 * result + (competitorClub != null ? competitorClub.hashCode() : 0);
        result = 31 * result + (competitorClubAbbreviation != null ? competitorClubAbbreviation.hashCode() : 0);
        result = 31 * result + (entryTimeInMillis != null ? entryTimeInMillis.hashCode() : 0);
        result = 31 * result + (timeInMillis != null ? timeInMillis.hashCode() : 0);
        result = 31 * result + (padTimeInMillis != null ? padTimeInMillis.hashCode() : 0);
        result = 31 * result + (backup1TimeInMillis != null ? backup1TimeInMillis.hashCode() : 0);
        result = 31 * result + (backup2TimeInMillis != null ? backup2TimeInMillis.hashCode() : 0);
        result = 31 * result + (backup3TimeInMillis != null ? backup3TimeInMillis.hashCode() : 0);
        result = 31 * result + (manualTimeInMillis != null ? manualTimeInMillis.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(splitsInMillis);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (heatPosition != null ? heatPosition.hashCode() : 0);
        result = 31 * result + (eventPosition != null ? eventPosition.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (dqItemId != null ? dqItemId.hashCode() : 0);
        result = 31 * result + (dqDisplayCode != null ? dqDisplayCode.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "RaceEntry{" +
            "laneNr=" + laneNr +
            ", competitorId='" + competitorId + '\'' +
            ", competitorName='" + competitorName + '\'' +
            ", competitorFirstName='" + competitorFirstName + '\'' +
            ", competitorLastName='" + competitorLastName + '\'' +
            ", competitorClub='" + competitorClub + '\'' +
            ", competitorClubAbbreviation='" + competitorClubAbbreviation + '\'' +
            ", entryTimeInMillis=" + entryTimeInMillis +
            ", timeInMillis=" + timeInMillis +
            ", padTimeInMillis=" + padTimeInMillis +
            ", backup1TimeInMillis=" + backup1TimeInMillis +
            ", backup2TimeInMillis=" + backup2TimeInMillis +
            ", backup3TimeInMillis=" + backup3TimeInMillis +
            ", manualTimeInMillis=" + manualTimeInMillis +
            ", splitsInMillis=" + Arrays.toString(splitsInMillis) +
            ", position=" + position +
            ", heatPosition=" + heatPosition +
            ", eventPosition=" + eventPosition +
            ", status=" + status +
            ", dqItemId='" + dqItemId + '\'' +
            ", dqDisplayCode='" + dqDisplayCode + '\'' +
            '}';
    }
}
