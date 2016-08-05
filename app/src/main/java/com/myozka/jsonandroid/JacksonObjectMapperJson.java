package com.myozka.jsonandroid;

/**
 * Created by myozka on 8/4/2016.
 */
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonObjectMapperJson implements TestJson {

    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public String getName() {
        return "JacksonObjectMapper";
    }

    @Override
    public List<Map> parsePublicTimeline(InputStream inputStream) {

        List<Map> result = null;
        try {
            result = mapper.readValue(inputStream, List.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;

    }
}