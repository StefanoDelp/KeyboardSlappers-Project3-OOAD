import java.util.Random;

public class Extenstion2 implements IExtenstion {

    int priceper= 0;
    int many;
    @Override
    public int price() {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public int Getmany ()
    {
        Random rand = new Random();
        return rand.nextInt(6);
    }

}