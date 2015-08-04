package com.wenyue.pattern.adapter;

/**
 * 采用继承的方式的插座适配器（类适配器）
 * 特点：通过多重继承不兼容接口，实现对目标接口的匹配，单一的为某个类而实现适配
 *
 * Created by wswenyue on 2015/8/3.
 */
public class TwoPlugAdapterExtends extends GBTwoPlug implements ThreePlugIf {
    @Override
    public void powerWithThree() {
        System.out.println("借助继承适配器");
        this.powerWithTwo();
    }
}
