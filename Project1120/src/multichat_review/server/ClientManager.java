package multichat_review.server;

import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

// singleton pattern
public class ClientManager {

    private static final ClientManager INSTANCE = new ClientManager();

    private List<Client> clients = new ArrayList<>();

    private ClientManager() {
        // 외부 생성 막기
        // static 메소드
    }

    public static void registerClient(Socket clientSocket) {
        getInstance().addClient(clientSocket);

    }

    public static ClientManager getInstance() {
        return INSTANCE;
    }

    public void broadcast(String message) {
        for (Client client : clients) {
            client.sendMessage(message);
        }
    }

    private void addClient(Socket clientSocket) {
        final Client client = new Client(clientSocket);
        // 1. 클라이언트 객체 등록
        clients.add(client);
        // 2. 클라이언트 스레드 시작
        client.start();
    }

}
