import java.util.Scanner;

public class Bottle {

    private float height;
    private int volume;

    Bottle(){}
    Bottle(float height,int volume){
        this.height = height;
        this.volume = volume;
    }

    public float getHeight(){
        return this.height;
    }

    public int getVolume(){
        return this.volume;
    }

    public float setHeight(){
        return this.height;
    }

    public int setVolume(){
        return this.volume;
    }

    void setDetails(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a Height : ");
        this.height = input.nextFloat();

        System.out.println("Please enter a Volume : ");
        this.volume = input.nextInt();

    }
    void print(){
        System.out.println("The bottle Height is : "+this.height+"m");
        System.out.println("The bottle Volume is : "+this.volume+"ml");
    }
}
