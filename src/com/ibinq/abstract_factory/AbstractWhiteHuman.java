package com.ibinq.abstract_factory;

/**
 * Created by Administrator on 2017/4/11.
 */
public abstract class AbstractWhiteHuman implements Human {
    public void cry() {
        System.out.println("白色人种会哭");
    }
    public void laugh() {
        System.out.println("白色人种会大笑，侵略的笑声");
    }
    public void talk() {
        System.out.println("白色人种会说话，一般都是但是单字节！");
    }
}
