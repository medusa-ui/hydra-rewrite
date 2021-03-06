package io.getmedusa.hydra.core.discovery.model;

import java.util.List;
import java.util.Map;

public class FragmentHydraRequestWrapper {

    private Map<String, Object> attributes;
    private Map<String, List<Fragment>> requests;

    public Map<String, Object> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, Object> attributes) {
        this.attributes = attributes;
    }

    public Map<String, List<Fragment>> getRequests() {
        return requests;
    }

    public void setRequests(Map<String, List<Fragment>> requests) {
        this.requests = requests;
    }
}
