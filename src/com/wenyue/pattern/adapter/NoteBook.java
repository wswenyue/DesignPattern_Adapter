package com.wenyue.pattern.adapter;

/**
 * Created by wswenyue on 2015/8/3.
 */
public class NoteBook {
    private ThreePlugIf plugIf;
    public NoteBook(ThreePlugIf plugIf) {
        this.plugIf = plugIf;
    }

    public void charge(){
        plugIf.powerWithThree();
    }

    public static void main(String[] args) {

        GBTwoPlug twoPlug = new GBTwoPlug();
        ThreePlugIf threePlugIf = new TwoPlugAdapter(twoPlug);
        NoteBook noteBook = new NoteBook(threePlugIf);
        noteBook.charge();

        System.out.println("\n ***************");

        threePlugIf = new TwoPlugAdapterExtends();
        noteBook = new NoteBook(threePlugIf);
        noteBook.charge();

    }
}
