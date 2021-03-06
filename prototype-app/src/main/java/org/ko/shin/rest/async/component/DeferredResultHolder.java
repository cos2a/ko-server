package org.ko.prototype.rest.async.component;


import org.ko.prototype.core.support.Response;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.async.DeferredResult;

import java.util.HashMap;
import java.util.Map;

@Component
public class DeferredResultHolder {

    /**
     * key: order number
     * value: result
     */
    private Map<String, DeferredResult<Response<String>>> map = new HashMap<>();




    public Map<String, DeferredResult<Response<String>>> getMap() {
        return map;
    }

    public void setMap(Map<String, DeferredResult<Response<String>>> map) {
        this.map = map;
    }
}
