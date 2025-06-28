package com.sarathi.support.cache;

import java.util.HashMap;

public  class SarathiTicketMasterCache {
	
	public static HashMap<Integer,String> TrackerCache = new HashMap<Integer, String>();
	public static HashMap<Integer,String> ProjectCache = new HashMap<Integer, String>();
	public static HashMap<Integer,String> IssueStatusCache = new HashMap<Integer, String>();
	public static HashMap<Integer,String> UserCache = new HashMap<Integer, String>();
	public static HashMap<Integer,String> UserPriorityCache = new HashMap<Integer, String>();
	
	static
	{
		createTrackercache();
		createProjectCache();
		createIssueStatusCache();
	}
	
	
	public static void createTrackercache() {
		TrackerCache.put(1,"Bug");
		TrackerCache.put(2,"Feature");
		TrackerCache.put(3,"Support");
	}
	
	public static void createProjectCache() {
		ProjectCache.put(1,"Development");
		ProjectCache.put(11,"Sarathi Support");
		ProjectCache.put(13,"Project Management");
		ProjectCache.put(16,"Initiatives");
		ProjectCache.put(17,"Testing");
		ProjectCache.put(18,"DemoProject");
		ProjectCache.put(19,"Fancy Support");
		ProjectCache.put(20,"Data Dictionary");
		
	}
	
	public static  void createIssueStatusCache() {
		IssueStatusCache.put(1,"New");
		IssueStatusCache.put(2,"InProgress");
		IssueStatusCache.put(3,"Resolved");
		IssueStatusCache.put(4,"ReOpen");
		IssueStatusCache.put(5,"Closed");
		IssueStatusCache.put(6,"Rejected");
		IssueStatusCache.put(7,"Test-Staging");
		IssueStatusCache.put(10,"DeployedInProduction");
		IssueStatusCache.put(11,"Test-Preprod");
		IssueStatusCache.put(12,"ForClarification");
		IssueStatusCache.put(13,"Deploy");
		IssueStatusCache.put(14,"Approve");
	}
	
	public static String getTrackerInfoByTrackerId(Integer trackerId) {
		return TrackerCache.get(trackerId);
	}
	
	public static String getProjectInfoByProjectId(Integer projectId) {
		return ProjectCache.get(projectId);
	}
	
	public static String getIssueStatusInfoByStatusId(Integer IssueStatusId) {
		return IssueStatusCache.get(IssueStatusId);
	}



}
