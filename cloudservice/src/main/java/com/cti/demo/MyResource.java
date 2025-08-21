package com.cti.demo;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.*;

@Path("hello")
public class MyResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, Object> hello() {
        Map<String, Object> res = new LinkedHashMap<>();
        res.put("message", "Hello from EB");
        res.put("requestId", UUID.randomUUID().toString());
        res.put("timestamp", new Date().toString());
        return res;
    }
}
