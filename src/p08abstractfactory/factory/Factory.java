package p08abstractfactory.factory;

public interface Factory {
    static Factory getFactory(String classname) {
        Factory factory = null;
        try {
            // p08abstractfactory.listfactory.ListFactory
            factory = (Factory) Class.forName(classname).newInstance();
        } catch (ClassNotFoundException e) {
            System.err.println("没有找到" + classname + "类。");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }
    Link createLink(String caption, String url);
    Tray createTray(String caption);
    Page createPage(String title, String author);
}
