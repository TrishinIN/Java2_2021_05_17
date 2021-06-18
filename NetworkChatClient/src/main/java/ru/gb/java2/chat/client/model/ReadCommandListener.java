package NetworkChatClient.src.main.java.ru.gb.java2.chat.client.model;

import NetworkChatClientServer.src.ru.gb.java2.chat.clientserver.Command;

public interface ReadCommandListener {

    void processReceivedCommand(Command command);
}
