package p17observer;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class NumberGenerator { //感觉功能有点耦合了，可以拆分成两个接口，一个是观察对象接口，一个是具体功能接口
    private ArrayList<Observer> observers = new ArrayList(); //保存观察者们
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }
    public void notifyObserver() {
        Iterator iterator = observers.iterator();
        while(iterator.hasNext()) {
            Observer observer = (Observer)iterator.next();
            observer.update(this);
        }
    }
    public abstract int getNumber(); //获取数值
    public abstract void execute(); //生成数值
}
