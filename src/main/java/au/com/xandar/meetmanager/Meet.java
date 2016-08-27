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

import java.util.Date;

/**
 * Resents a Meet within the MeetManagementService.
 */
public final class Meet {
    /**
     * Opaque Meet identifier. Unique for each Meet that can be provided by the MeetManagerService
     *
     * @since  version 1
     */
    public String meetId;

    /**
     * @since  version 1
     */
    public String description;

    /**
     * Determines the number of lanes shown for a race if the race doesn't explicitly provide a value.
     * May be null, in which case the system default will be used.
     *
     * @since version 4
     */
    public Integer nrLanes;

    /**
     * First day of the meet.
     *
     * @since version 14
     */
    public Date startDate;

    /**
     * Last day of the meet.
     *
     * @since version 14
     */
    public Date endDate;

    /**
     * @since version 14
     */
    public Course course;

    // TODO add startDate
    // TODO add endDate
    // TODO add course (Short, Long, Yards)

    @Override
    public String toString() {
        final int offset = meetId.length() < 10 ? 0 : meetId.length() - 10;
        return "Meet{" +
                "meetId='" + meetId.substring(offset) + '\'' +
                ", description='" + description + '\'' +
                ", nrLanes=" + nrLanes +
                '}';
    }
}
