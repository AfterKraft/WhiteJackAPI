package com.whitejack.api.net.server;

/**
 * The basis of a WhiteJack Server. Used as a framework for 
 * starting a client offline or official server online server.
 * @author gabizou
 *
 */
public abstract class Server {
	
	private boolean onlineMode = true;
	
	private String version = this.getClass().getPackage().getImplementationVersion();
	
	/**
	 * If the server is online (Server) or offline (Client local)
	 * @return
	 */
	public boolean getOnlineMode() {
		return onlineMode;
	}
	
	/**
	 * To change the server status
	 * @param newOnlineMode
	 */
	public void setOnlineMode(boolean newOnlineMode) {
		this.onlineMode = newOnlineMode;
	}
	
	/**
	 * Get the version info of the server being run
	 * Use to cross reference requirements
	 * @return
	 */
	public String getVersion() {
		return version;
	}

}
