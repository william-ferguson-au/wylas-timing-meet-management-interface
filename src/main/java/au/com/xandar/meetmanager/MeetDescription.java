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
 * Describes a Meet.
 *
 * @since  version 14
 */
public final class MeetDescription {

    /**
     * Opaque Meet identifier. Unique for each Meet that can be provided by the MeetManagerService
     *
     * @since  version 14
     */
    public String meetId;

    /**
     * @since  version 14
     */
    public String description;

    @Override
    public String toString() {
        return "MeetDescription{" +
            "meetId='" + meetId + '\'' +
            ", description='" + description + '\'' +
            '}';
    }
}
