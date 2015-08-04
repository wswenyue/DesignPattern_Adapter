package com.wenyue.pattern.adapter;

/**
 * 二相转三相的插座适配器
 * 采用组合方式的适配器（对象适配器）
 * 特点：把“被适配者”作为一个对象组合到适配器类中，以修改目标接口包装被适配者
 * Created by wswenyue on 2015/8/3.
 */
public class TwoPlugAdapter implements ThreePlugIf {
    private GBTwoPlug plug;

    public TwoPlugAdapter(GBTwoPlug twoPlug) {
        plug = twoPlug;
    }

    @Override
    public void powerWithThree() {
        System.out.println("通过转化");
        plug.powerWithTwo();

    }
}
