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
 * Represents the different types of events.
 */
@SuppressWarnings("unused")
public enum Round {

    /**
     * @since  version 1
     */
    Prelim,

    /**
     * @since  version 1
     * @deprecated since version 10 - used {@link Race#eventAlpha} to differentiate instead.
     */
    Prelim_SwimOff,

    /**
     * @since  version 1
     */
    Semi,

    /**
     * @since  version 1
     * @deprecated since version 10 - used {@link Race#eventAlpha} to differentiate instead.
     */
    Semi_SwimOff,

    /**
     * @since  version 1
     */
    Final
}
