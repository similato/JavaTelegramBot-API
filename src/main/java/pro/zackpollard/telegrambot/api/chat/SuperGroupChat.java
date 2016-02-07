package pro.zackpollard.telegrambot.api.chat;

/**
 * @author Zack Pollard
 */
public interface SuperGroupChat extends Chat {

    default ChatType getType() {

        return ChatType.SUPERGROUP;
    }
}
