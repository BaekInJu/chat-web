package com.lhb.backend.chat;

import lombok.Getter;
import lombok.Setter;

public class Chat {


    @Getter
    @Setter
    public static class SendMessage{
        private Long sender;
        private String content;
        private String time;
    }

    @Getter
    @Setter
    public static class ChatMessage{
        private String time;
        private String content;
    }
}
