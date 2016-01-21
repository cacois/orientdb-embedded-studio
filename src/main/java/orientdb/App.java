package orientdb;

import com.orientechnologies.orient.server.OServer;
import com.orientechnologies.orient.server.OServerMain;

public class App {

	public static void main(String[] args) throws Exception {
		App app = new App();
		app.startServer();
	}

	public void startServer() throws Exception {
		OServer server = OServerMain.create();
		server = server.startup(getClass().getClassLoader().getResourceAsStream("db.config"));
		server.activate();
		System.out.println("Server started");
	}
}
