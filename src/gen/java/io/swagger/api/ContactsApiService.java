package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.Contact;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-01-11T11:34:36.200Z")
public abstract class ContactsApiService {
    public abstract Response contactsGet(SecurityContext securityContext) throws NotFoundException;
    public abstract Response contactsGetById(Integer id,SecurityContext securityContext) throws NotFoundException;
}
