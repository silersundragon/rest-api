package com.restfulwebservices;

public class ApplicationBean {

	private String version;
	private String lastCommitSHA;
	private String description;

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
	public String getLastCommitSHA() {
		return lastCommitSHA;
	}

	public void setLastCommitSHA(String lastCommitSHA) {
		this.lastCommitSHA = lastCommitSHA;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return String.format("ApplicationBean [version=%s] [version=%s]", version, lastCommitSHA);
	}

}
