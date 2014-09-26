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
 * Provides two way access to the MeetManager data necessary to manage the timing of a meet.
 *
 * Handles Meet related requests in the context of the current loaded Meet.
 *
 * Implementations of this interfaces will be loaded using {@link java.util.ServiceLoader}.
 * So they must include a META-INF/services/au.com.xandar.meetmanager.MeetManagerService file
 * containing the full qualified names of the implementations they support.
 *
 * @see http://docs.oracle.com/javase/6/docs/api/index.html?java/util/ServiceLoader.html
 * @since version 2
 */
@SuppressWarnings("unused")
public interface MeetManagerService {

    /**
     * Strongly suggested that {@link java.util.ResourceBundle} be used to ensure that the Service name is provided in the appropriate language.
     *
     * @return Name that can be provided for human consumption to differentiate this Service from others.
     */
    public String getReadableName();

    /**
     * Properties are defined as a LinkedHashMap so that each MeetManagerService can define the order in which to present the properties to the user.
     *
     * @return Map of properties that can be configured for this MeetManagerService along with any defaults.
     *
     * @since  version 2
     */
    public LinkedHashMap<String, String> getProperties();

    /**
     * Start this MeetManagerService.
     *
     * Prior to this point all methods other than {@link #stop()} and {@link #getProperties()} should throw {@link java.lang.IllegalStateException}
     *
     * @since  version 2
     */
    public void start();

    /**
     * Stop this MeetManagerService.
     *
     * After this point all methods other than {@link #start()} and {@link #getProperties()} should throw {@link java.lang.IllegalStateException}
     *
     * @since  version 2
     */
    public void stop();

    /**
     * @return true if this Service has been started, otherwise false.
     */
    public boolean isStarted();

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
    public int getApiVersion();

    /**
     * @return List of Meets currently accessible via this MeetManagementService.
     *
     * @since  version 2
     */
    public List<Meet> getMeets();

    /**
     * Return the List of all seeded Races for the Meet.
     *
     * @param meetId        Id of the Meet for which to retrieves races.
     * @return List of all seeded Races for the Meet.
     *
     * @since  version 2
     */
    public List<Race> getRaces(String meetId);

    /**
     * Returns the List of RaceEntry for the supplied Race.
     *
     * @param meetId            Id of the Meet for which to retrieve entries.
     * @param raceId            Id of the Race for which to retrieve entries.
     * @return List of RaceEntry for the supplied Race.
     *
     * @since  version 2
     */
    public List<RaceEntry> getRaceEntries(String meetId, String raceId);

    /**
     * Updates the Race with the RaceEntry results and marks it as completed.
     *
     * @param meetId            Id of the Meet to update.
     * @param raceId            Id of the Race to update.
     * @param entries           List of RaceEntry to set as the Race results.
     *
     * @since  version 2
     */
    public void updateRaceEntries(String meetId, String raceId, List<RaceEntry> entries);

    /**
     * Notifies the meet manager that the state of the race has changed.
     *
     * The most relevant of these from a meet management perspective is probably the change to {@link RaceState#RaceOver}.
     *
     * @param meetId            Id of the Meet to notify.
     * @param raceId            Id of the Race to notify.
     * @param state new state for the Race.
     *
     * @since  version 2
     */
    public void raceStateChanged(String meetId, String raceId, RaceState state);

    /**
     * Returns the List of all disqualification codes that are valid for the given race.
     *
     * NB supported by version 1.
     *
     * @param meetId            Id of the Meet for which to retrieve DQItems.
     * @param raceId            Id of the Race for which to retrieve DQItems.
     * @return List of DQItems that are valid for the given race.
     *
     * @since  version 2
     */
    public List<DQItem> getDQItems(String meetId, String raceId);
}
