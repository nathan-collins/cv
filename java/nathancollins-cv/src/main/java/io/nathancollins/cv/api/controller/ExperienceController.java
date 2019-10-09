package io.nathancollins.cv.api.controller;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import io.nathancollins.cv.api.repository.ExperienceRepository;

@Path("experience")
public class ExperienceController {
  private ExperienceRepository experienceRepository;

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Path("findByResume/{id}")
  public Response findByResume(@PathParam("resumeId") Long resumeId) {
    return Response.ok(experienceRepository.findByResume(resumeId).build());
  }
}
