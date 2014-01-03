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

    @Override
    public String toString() {
        final int offset = meetId.length() < 10 ? 0 : meetId.length() - 10;
        return "Meet{" +
                "meetId='" + meetId.substring(offset) + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
