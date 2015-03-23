package com.streakapi.crm.queryStreak.resources.streakObjects;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "creatorKey",
    "name",
    "description",
    "orgWide",
    "fields",
    "stages",
    "stageOrder",
    "creationTimestamp",
    "lastUpdatedTimestamp",
    "aclEntries",
    "owner",
    "pipelineKey",
    "key"
})
public class Pipeline {

//    @JsonProperty("creatorKey")
    private String creatorKey;
//    @JsonProperty("name")
    private String name;
//    @JsonProperty("description")
    private String description;
//    @JsonProperty("orgWide")
    private Boolean orgWide;
//    @JsonProperty("fields")
    private List<Field> fields = new ArrayList<Field>();
//    @JsonProperty("stages")
    private Stages stages;
//    @JsonProperty("stageOrder")
    private List<String> stageOrder = new ArrayList<String>();
//    @JsonProperty("creationTimestamp")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy,HH:00:00")
    private Calendar creationTimestamp;
//    @JsonProperty("lastUpdatedTimestamp")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy,HH:00:00")
    private Calendar lastUpdatedTimestamp;
//    @JsonProperty("aclEntries")
    private List<Object> aclEntries = new ArrayList<Object>();
//    @JsonProperty("owner")
    private Owner owner;
//    @JsonProperty("pipelineKey")
    private String pipelineKey;
//    @JsonProperty("key")
    private String key;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The creatorKey
     */
    @JsonIgnore
    public String getCreatorKey() {
        return creatorKey;
    }

    /**
     * 
     * @param creatorKey
     *     The creatorKey
     */
    @JsonIgnore
    private void setCreatorKey(String creatorKey) {
        this.creatorKey = creatorKey;
    }

    public Pipeline withCreatorKey(String creatorKey) {
        this.creatorKey = creatorKey;
        return this;
    }

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Pipeline withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Pipeline withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 
     * @return
     *     The orgWide
     */
    @JsonProperty("orgWide")
    public Boolean getOrgWide() {
        return orgWide;
    }

    /**
     * 
     * @param orgWide
     *     The orgWide
     */
    @JsonProperty("orgWide")
    public void setOrgWide(Boolean orgWide) {
        this.orgWide = orgWide;
    }

    public Pipeline withOrgWide(Boolean orgWide) {
        this.orgWide = orgWide;
        return this;
    }

    /**
     * 
     * @return
     *     The fields
     */
    @JsonIgnore
    public List<Field> getFields() {
        return fields;
    }

    /**
     * 
     * @param fields
     *     The fields
     */
    @JsonProperty("fields")
    private void setFields(List<Field> fields) {
        this.fields = fields;
    }

    public Pipeline withFields(List<Field> fields) {
        this.fields = fields;
        return this;
    }

    /**
     * 
     * @return
     *     The stages
     */
    @JsonIgnore
    public Stages getStages() {
        return stages;
    }

    /**
     * 
     * @param stages
     *     The stages
     */
    @JsonProperty("stages")
    public void setStages(Stages stages) {
        this.stages = stages;
    }

    public Pipeline withStages(Stages stages) {
        this.stages = stages;
        return this;
    }

    /**
     * 
     * @return
     *     The stageOrder
     */
    @JsonProperty("stageOrder")
    public List<String> getStageOrder() {
        return stageOrder;
    }

    /**
     * 
     * @param stageOrder
     *     The stageOrder
     */
    @JsonProperty("stageOrder")
    public void setStageOrder(List<String> stageOrder) {
        this.stageOrder = stageOrder;
    }

    public Pipeline withStageOrder(List<String> stageOrder) {
        this.stageOrder = stageOrder;
        return this;
    }

    /**
     * 
     * @return
     *     The creationTimestamp
     */
    @JsonIgnore
    public Calendar getCreationTimestamp() {
        return creationTimestamp;
    }

    /**
     * 
     * @param creationTimestamp
     *     The creationTimestamp
     */
    @JsonProperty("creationTimestamp")
    private void setCreationTimestamp(Calendar creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    public Pipeline withCreationTimestamp(Calendar creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
        return this;
    }

    /**
     * 
     * @return
     *     The lastUpdatedTimestamp
     */
    @JsonIgnore
    public Calendar getLastUpdatedTimestamp() {
        return lastUpdatedTimestamp;
    }

    /**
     * 
     * @param lastUpdatedTimestamp
     *     The lastUpdatedTimestamp
     */
    @JsonProperty("lastUpdatedTimestamp")
    private void setLastUpdatedTimestamp(Calendar lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    }

    public Pipeline withLastUpdatedTimestamp(Calendar lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        return this;
    }

    /**
     * 
     * @return
     *     The aclEntries
     */
    @JsonProperty("aclEntries")
    public List<Object> getAclEntries() {
        return aclEntries;
    }

    /**
     * 
     * @param aclEntries
     *     The aclEntries
     */
    @JsonProperty("aclEntries")
    public void setAclEntries(List<Object> aclEntries) {
        this.aclEntries = aclEntries;
    }

    public Pipeline withAclEntries(List<Object> aclEntries) {
        this.aclEntries = aclEntries;
        return this;
    }

    /**
     * 
     * @return
     *     The owner
     */
    @JsonIgnore
    public Owner getOwner() {
        return owner;
    }

    /**
     * 
     * @param owner
     *     The owner
     */
    @JsonProperty("owner")
    private void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Pipeline withOwner(Owner owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 
     * @return
     *     The pipelineKey
     */
    @JsonIgnore
    public String getPipelineKey() {
        return pipelineKey;
    }

    /**
     * 
     * @param pipelineKey
     *     The pipelineKey
     */
    @JsonProperty("pipelineKey")
    private void setPipelineKey(String pipelineKey) {
        this.pipelineKey = pipelineKey;
    }

    public Pipeline withPipelineKey(String pipelineKey) {
        this.pipelineKey = pipelineKey;
        return this;
    }

    /**
     * 
     * @return
     *     The key
     */
    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    /**
     * 
     * @param key
     *     The key
     */
    @JsonIgnore
    private void setKey(String key) {
        this.key = key;
    }

    public Pipeline withKey(String key) {
        this.key = key;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Pipeline withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
