package p21proxy;

public class PrintProxy implements Printable {
    private String name; //名字
    private Printer real; //"本人"

    public PrintProxy() {}
    public PrintProxy(String name) {
        this.name = name;
    }

    @Override
    public synchronized void setPrintName(String name) {
        if (real != null) {
            real.setPrintName(name);
        }
        this.name = name;
    }

    @Override
    public String getPrintName() {
        return name;
    }

    @Override
    public void print(String string) {
        realize();
        real.print(string);
    }

    private synchronized void realize() { //生成"本人"
        if (real == null) {
            real = new Printer(name);
        }
    }
}
