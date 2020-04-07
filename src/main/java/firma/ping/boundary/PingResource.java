package firma.ping.boundary;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("ping")
@Produces(value = MediaType.TEXT_PLAIN)
public class PingResource {

    @Inject
    @ConfigProperty(name = "message")
    private String message;
    
    @GET
    public String ping() {
        return "pong";
    }
    
    @GET
    @Path("/message")
    public String message() {
        return message;
    }
}
