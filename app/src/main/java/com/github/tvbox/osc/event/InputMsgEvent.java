package com.github.tvbox.osc.event;

public class InputMsgEvent {
    private String text;

    public InputMsgEvent(String str) {
        this.text = str;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String str) {
        this.text = str;
    }
}