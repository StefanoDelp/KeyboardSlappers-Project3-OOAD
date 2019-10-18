public abstract class ExtenstionDecorator implements IExtenstion{
    protected IExtenstion decExt;

    public ExtenstionDecorator(IExtenstion decExt) {
        this.decExt = decExt;
    }

    public int price() {
        return decExt.price();
    }
}