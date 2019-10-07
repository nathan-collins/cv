package io.nathancollins.cv.api.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import io.nathancollins.cv.api.repository.ResumeRepository;
import io.nathancollins.cv.api.entity.Resume;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
@Path("resume")
@Produces(MediaType.APPLICATION_JSON)

public class ResumeController {
  @EJB
  private ResumeRepository resumeBean;

  @GET
  @Path("findById/{id}")
  public Response findById(@PathParam("id") Long id) {
    return Response.ok(resumeBean.findById(id)).build();
  }

  @GET
  @Path("FindAll")
  public Response findAll() {
    return Response.ok(resumeBean.findAll()).build();
  }

  @POST
  public Response save(Resume resume) {
    resumeBean.save(resume);
    return Response.accepted().build();
  }

}
