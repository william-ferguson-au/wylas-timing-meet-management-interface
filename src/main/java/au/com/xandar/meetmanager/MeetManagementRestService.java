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

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Provides two way access to the MeetManager data necessary for managing timing for a meet.
 *
 * Handles Meet related requests in the context of the current loaded Meet.
 *
 * Suggest the MeetManagementService use port 2525 (by default).
 * Further suggest that a standard path be used. Such as 'meetmanager'
 * So requests take the form of http://<host>:<port>/meetmanager/<method>
 *
 * If an application error occurs then the REST method response should contain HTTP 403 and the body should be a String detailing the problem.
 */
//@Path("/meetmanager")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface MeetManagementRestService {

    /**
     * Returns the API supported by this version of MeetManagementService.
     *
     * This allows the interface to extended in the future
     * by giving the client a means of querying for what methods are available.
     *
     * @return the API supported by this version of MeetManagementService.
     *
     * @since  version 1
     */
    @GET
    @Path("/api")
    public int getApiVersion();

    /**
     * @return List of Meets currently accessible via this MeetManagementService.
     *
     * @since  version 1
     */
    @GET
    @Path("/meets")
    public List<Meet> getMeets();

    /**
     * Return the List of all seeded Races for the Meet.
     *
     * NB supported by version 1.
     *
     * @param meetId        Id of the Meet for which to retrieves races.
     * @return List of all seeded Races for the Meet.
     *
     * @since  version 1
     */
    @GET
    @Path("/meet/{meetId}/races")
    public List<Race> getRaces(@PathParam("meetId") String meetId);

    /**
     * Returns the List of RaceEntry for the supplied Race.
     *
     * NB supported by version 1.
     *
     *
     * @param meetId            Id of the Meet for which to retrieve entries.
     * @param raceId            Id of the Race for which to retrieve entries.
     * @return List of RaceEntry for the supplied Race.
     *
     * @since  version 1
     */
    @GET
    @Path("/meet/{meetId}/{raceId}/raceEntries")
    public List<RaceEntry> getRaceEntries(@PathParam("meetId") String meetId, @PathParam("raceId") String raceId);

    /**
     * Updates the Race with the RaceEntry results and marks it as completed.
     *
     * NB supported by version 1.
     *
     * @param meetId            Id of the Meet to update.
     * @param raceId            Id of the Race to update.
     * @param entries           List of RaceEntry to set as the Race results.
     *
     * @since  version 1
     */
    @POST
    @Path("/meet/{meetId}/{raceId}/raceEntries")
    public void updateRaceEntries(@PathParam("meetId") String meetId, @PathParam("raceId") String raceId, List<RaceEntry> entries);

    /**
     * Notifies the meet manager that the state of the race has changed.
     *
     * The most relevant of these from a meet management perspective is probably the change to {@link RaceState#RaceOver}.
     *
     * NB supported by version 1.
     *
     * @param meetId            Id of the Meet to notify.
     * @param raceId            Id of the Race to notify.
     *
     * @since  version 1
     * @param state new state for the Race.
     *
     * @since  version 1
     */
    @POST
    @Path("/meet/{meetId}/{raceId}/raceStateChanged")
    public void raceStateChanged(@PathParam("meetId") String meetId, @PathParam("raceId") String raceId, RaceState state);

    /**
     * Returns the List of all disqualification codes that are valid for the given race.
     *
     * NB supported by version 1.
     *
     * @param meetId            Id of the Meet for which to retrieve DQItems.
     * @param raceId            Id of the Race for which to retrieve DQItems.
     * @return List of DQItems that are valid for the given race.
     *
     * @since  version 1
     */
    @GET
    @Path("/meet/{meetId}/{raceId}/dqItems")
    public List<DQItem> getDQItems(@PathParam("meetId") String meetId, @PathParam("raceId") String raceId);
}
