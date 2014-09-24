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
    public Integer competitorId;

    /**
     * @since  version 1
     */
    public String competitorName;

    /**
     * @since  version 1
     */
    public String competitorClub;

    /**
     * @since  version 1
     */
    public Integer timeInMillis;

    /**
     * Lap times if they were recorded.
     *
     * @since  version 1
     */
    public Integer[] splitsInMillis;

    /**
     * @since  version 1
     */
    public Integer position;

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
}
