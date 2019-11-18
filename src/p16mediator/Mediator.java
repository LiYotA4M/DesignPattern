package p16mediator;

public interface Mediator {
    void createColleagues(); //生成该仲裁者辖下的组员
    void colleaguesChanged(); //被各个组员调用，保证仲裁者可随时接收各方的状态变换
}