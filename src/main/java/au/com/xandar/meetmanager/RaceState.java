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
 * The various states of a race.
 */
@SuppressWarnings("unused")
public enum RaceState {

    /**
     * Race has not been marshalled.
     *
     * @since version 1
     */
    Unmarshalled,

    /**
     * Race has been marshalled but not yet started.
     * There should really only be a single Race in this state.
     *
     * @since  version 1
     */
    Starting,

    /**
     * Race has been started but not finalised (or all swimmers have not yet completed).
     *
     * @since version 1
     */
    Racing,

    /**
     * Race has been finalised and next race has yet to be queued.
     *
     * @since version 1
     */
    RaceOver
}
