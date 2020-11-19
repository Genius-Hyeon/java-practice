package multiChatting;

import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

// Singleton
public class ClientManager {

    private static final ClientManager INSTANCE = new ClientManager();
    private List<Client> list = new ArrayList<>();

    private ClientManager() {
        // 외부 생성 막기
    }

    public static ClientManager getInstance() {
        return INSTANCE;
    }

    public static void registerClient(Socket client) {
        getInstance().addClient(client);

    }

    private void addClient(Socket socket) {
        final Client client = new Client(socket);
        list.add(client);
        client.start();
    }

    public void broadcast(String message) {
        for (Client client : list) {
            client.send(message);
        }
    }
}
