package io.getmedusa.hydra.core.heartbeat.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.getmedusa.hydra.core.discovery.model.Fragment;
import io.getmedusa.hydra.core.discovery.model.FragmentRequestWrapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;

class FragmentRequestWrapperTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    void testSerializable() throws Exception {
        FragmentRequestWrapper wrapper = new FragmentRequestWrapper();
        Fragment request = new Fragment();
        request.setService("xyz");
        request.setRef("234");
        wrapper.setRequests(List.of(request));
        wrapper.setAttributes(new HashMap<>());

        String value = objectMapper.writeValueAsString(wrapper);
        Assertions.assertNotNull(value);
        System.out.println(value);

        FragmentRequestWrapper wrapper1 = objectMapper.readValue(value, FragmentRequestWrapper.class);
        Assertions.assertNotNull(wrapper1);
        System.out.println(wrapper1);
    }

}
