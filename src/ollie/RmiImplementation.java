package ollie;

import java.io.File;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class RmiImplementation extends UnicastRemoteObject implements RmiInterface, Serializable{

	protected RmiImplementation(String s) throws RemoteException {
		File storageDir = new File (s);
		storageDir.mkdir();
	}
	
    
	
        @Override
	public String[] listFiles(String serverpath) throws RemoteException {
		File serverpathdir = new File(serverpath);
		return serverpathdir.list();
		
	}
	
        @Override
	public boolean createDirectory(String serverpath) throws RemoteException {	
		File serverpathdir = new File(serverpath);
		return serverpathdir.mkdir();
		
	}

        @Override
	public boolean removeDirectoryOrFile(String serverpath) throws RemoteException {
		File serverpathdir = new File(serverpath);
		return serverpathdir.delete();
		
	}
    
}
