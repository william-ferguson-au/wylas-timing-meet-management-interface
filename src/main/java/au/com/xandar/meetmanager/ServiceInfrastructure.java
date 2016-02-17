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

import java.util.LinkedHashMap;
import java.util.List;

/**
 * Provides the Service infrastructure methods.
 *
 * @since version 10
 */
@SuppressWarnings("unused")
public interface ServiceInfrastructure {

    /**
     * Strongly suggested that {@link java.util.ResourceBundle} be used to ensure that the Service name is provided in the appropriate language.
     *
     * @return Name that can be provided for human consumption to differentiate this Service from others.
     */
    String getReadableName();

    /**
     * Properties are defined as a LinkedHashMap so that each MeetManagerService can define the order in which to present the properties to the user.
     *
     * @return Map of properties that can be configured for this MeetManagerService along with any defaults.
     *
     * @since  version 2
     */
    LinkedHashMap<String, String> getProperties();

    /**
     * Start this MeetManagerService.
     *
     * Prior to this point all methods other than {@link #stop()} and {@link #getProperties()} should throw {@link IllegalStateException}
     *
     * @throws MMServiceException if this service cannot be started.
     * @since  version 2
     */
    void start();

    /**
     * Stop this MeetManagerService.
     *
     * After this point all methods other than {@link #start()} and {@link #getProperties()} should throw {@link IllegalStateException}
     *
     * @since  version 2
     */
    void stop();

    /**
     * @return true if this Service has been started, otherwise false.
     */
    boolean isStarted();

    /**
     * Returns the API supported by this version of MeetManagementService.
     *
     * This allows the interface to extended in the future
     * by giving the client a means of querying for what methods are available.
     *
     * @return the API supported by this version of MeetManagementService.
     *
     * @since  version 2
     */
    int getApiVersion();
}
