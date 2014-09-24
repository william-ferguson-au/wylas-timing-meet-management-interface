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
 * Represents the result of a RaceEntry.
 *
 * A valid RaceEntry won't have a ResultStatus.
 */
@SuppressWarnings("unused")
public enum ResultStatus {

    /**
     * Disqualified.
     *
     * @since  version 1
     */
    DQ,

    /**
     * Did not start.
     *
     * @since  version 1
     */
    DNS,

    /**
     * Did not finish.
     *
     * @since  version 1
     */
    DNF
}
