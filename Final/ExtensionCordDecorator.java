import java.util.Random;

public class ExtensionCordDecorator extends ExtenstionDecorator
{
    public ExtensionCordDecorator(IExtenstion decExt) {
        super(decExt);

    }

    @Override
    public int price() {
        Random rand = new Random();
        int newint = rand.nextInt(6);
        return 5*newint;
    }

    @Override
    public int Getmany() {
        // TODO Auto-generated method stub
        return this.decExt.Getmany();
    }
}