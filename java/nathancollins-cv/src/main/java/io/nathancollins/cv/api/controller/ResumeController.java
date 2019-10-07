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

@Path("resume")
public class ResumeController {
  private ResumeRepository resumeRepository;

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Path("findById/{id}")
  public Response findById(@PathParam("id") Long id) {
    return Response.ok(resumeRepository.findById(id)).build();
  }

  @GET
  @Path("FindAll")
  public Response findAll() {
    return Response.ok(resumeRepository.findAll()).build();
  }

  @POST
  public Response save(Resume resume) {
    resumeRepository.save(resume);
    return Response.accepted().build();
  }

}
