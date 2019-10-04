package io.nathancollins.cv.api.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import io.nathancollins.cv.api.beans.ResumeBean;
import io.nathancollins.cv.api.entities.Resume;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
@Path("resume")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class ResumeService {
  @EJB
  private ResumeBean resumeBean;

  @GET
  @Path("findById/{id}")
  public Response findById(@PathParam("id") Long id) {
    return Response.ok(resumeBean.findById(id)).build();
  }
}
