package com.sarathi.support.cache;

import java.util.HashMap;

public class SarathiTicketMasterCache {

	public static HashMap<Integer, String> TrackerCache = new HashMap<Integer, String>();
	public static HashMap<Integer, String> ProjectCache = new HashMap<Integer, String>();
	public static HashMap<Integer, String> IssueStatusCache = new HashMap<Integer, String>();
	public static HashMap<Integer, String> UserCache = new HashMap<Integer, String>();
	public static HashMap<Integer, String> UserPriorityCache = new HashMap<Integer, String>();
	public static HashMap<Integer, String> CategoryCache = new HashMap<Integer, String>();

	static {
		createTrackercache();
		createProjectCache();
		createIssueStatusCache();
		createCategoryCache();
	}

	public static void createTrackercache() {
		TrackerCache.put(1, "Support");
		TrackerCache.put(2, "Bug");
		TrackerCache.put(3, "Feature");
	}

	public static void createProjectCache() {
		ProjectCache.put(1, "Development");
		ProjectCache.put(11, "Sarathi Support");
		ProjectCache.put(13, "Project Management");
		ProjectCache.put(16, "Initiatives");
		ProjectCache.put(17, "Testing");
		ProjectCache.put(18, "DemoProject");
		ProjectCache.put(19, "Fancy Support");
		ProjectCache.put(20, "Data Dictionary");

	}

	public static void createIssueStatusCache() {
		IssueStatusCache.put(1, "InProgress");
		IssueStatusCache.put(2, "ForClarification");
		IssueStatusCache.put(3, "Deploy");
		IssueStatusCache.put(4, "Closed");
		IssueStatusCache.put(5, "Resolved");
		IssueStatusCache.put(6, "DeployedInProduction");
		IssueStatusCache.put(7, "ReOpen");
 		IssueStatusCache.put(8, "Approve");
		IssueStatusCache.put(9, "Test-Staging");
		IssueStatusCache.put(10, "Rejected");
		IssueStatusCache.put(11, "Test_Preprod");
		IssueStatusCache.put(12, "New");
		IssueStatusCache.put(13, "Open");

	}
	
	

	public static void createCategoryCache() {
		CategoryCache.put(1, "LL");
		CategoryCache.put(2, "DL");
		CategoryCache.put(3, "CL");
		CategoryCache.put(4, "DS");
		CategoryCache.put(5, "Application");
		CategoryCache.put(6, "Appointment");
		CategoryCache.put(7, "Payment");
		CategoryCache.put(8, "MIS Reports");
		CategoryCache.put(9, "Masters");
		CategoryCache.put(10, "Common");
		CategoryCache.put(11, "Server Related");
		CategoryCache.put(12, "Database Related");
		CategoryCache.put(13, "Complaint");
		CategoryCache.put(14, "Others");
	}

	public static String getCategoryCache(Integer categoryId) {
		return CategoryCache.get(categoryId);
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
