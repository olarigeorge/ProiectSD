package ollie;


import java.rmi.*;
public interface RmiInterface extends Remote {
	
	public String[] listFiles(String serverpath) throws RemoteException;
	public boolean createDirectory(String serverpath) throws RemoteException;
	public boolean removeDirectoryOrFile(String serverpath) throws RemoteException;
       
        

}
