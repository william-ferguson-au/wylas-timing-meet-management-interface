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
 * Represents a disqualification code, that is a reason for disqualifying a competitor.
 */
public final class DQItem {

    /**
     * @since  version 1
     */
    public String id;

    /**
     * @since  version 1
     */
    public String displayCode;

    /**
     * @since  version 1
     */
    public String description;

    public DQItem() {
        // For reflective construction.
    }

    public DQItem(String id, String description) {
        this.id = id;
        this.displayCode = id;
        this.description = description;
    }
}
