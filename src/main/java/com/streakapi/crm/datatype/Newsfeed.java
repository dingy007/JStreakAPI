package com.streakapi.crm.datatype;

import java.util.Map;

/**
 * @author dineshkp
 *
 */
public class Newsfeed {
	private String creatorKey;
	private String timestamp;
	private NewsfeedEntryScope newsfeedEntryScope;
	private NewsfeedEntryOperation newsfeedEntryOperation;
	private String newsfeedEntrySpecific;
	private Map<String, String> specificVariables;

}
