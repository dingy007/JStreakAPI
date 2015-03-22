
package main.com.koreinfo.crm.streakapi.queryStreak.resources.streakObjects;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")

public class Fields {
    @JsonIgnore
    private Map<String, Object> allFields = new HashMap<String, Object>();

    public Fields withAllFields(String name, Object value) {
        this.allFields.put(name, value);
        return this;
    }
    
    @JsonAnyGetter
    public Map<String, Object> getAllFields() {
        return this.allFields;
    }

    @JsonAnySetter
    public void setAllFields(String name, Object value) {
        this.allFields.put(name, value);
    }
    

}
