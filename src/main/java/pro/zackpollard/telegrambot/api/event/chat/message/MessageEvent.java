package pro.zackpollard.telegrambot.api.event.chat.message;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import pro.zackpollard.telegrambot.api.chat.Chat;
import pro.zackpollard.telegrambot.api.chat.message.Message;
import pro.zackpollard.telegrambot.api.event.Event;

/**
 * @author Zack Pollard
 */

@RequiredArgsConstructor
public abstract class MessageEvent implements Event {

	@Getter
	private final Message message;

	public Chat getChat() {

		return message.getChat();
	}
}
