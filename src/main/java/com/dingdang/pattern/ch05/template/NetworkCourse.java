package com.dingdang.pattern.ch05.template;

/**
 * @author: blessed
 * @Date: 2019/3/25
 */
public abstract class NetworkCourse {
    protected final void createCourse(){
        //步骤1
        this.postPreResource();
        //步骤2
        this.createPPT();
        //步骤3
        this.liveVideo();
        //步骤4
        this.postNote();
        //步骤5
        this.postResource();
        if (needHomework()){
            //步骤6
            checkHomework();
        }
    }

    /**
     * 钩子方法
     * @return
     */
    protected abstract boolean needHomework();

    protected abstract void checkHomework();

    protected void postPreResource() {
        System.out.println("发预习资料");
    }

    protected void createPPT() {
        System.out.println("制作PPT");
    }

    protected void liveVideo() {
        System.out.println("直播授课");
    }

    protected void postNote() {
        System.out.println("提交课件和笔记");
    }

    protected void postResource() {
        System.out.println("提交源代码");
    }
}
