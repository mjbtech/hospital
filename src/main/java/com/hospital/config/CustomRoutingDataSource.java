package com.hospital.config;


import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public class CustomRoutingDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();     // get request object
        System.out.println("attr : "+attr);
        if(attr!=null) {
            String tenantId = attr.getRequest().getParameter("tenantId");
            if (tenantId != null) {
                return tenantId;
            } else {
                return "default";
            }
        }else{
            return "default";
        }
    }
}