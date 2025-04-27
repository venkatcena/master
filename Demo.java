
class Computer{

    public void playMusic(){
        System.out.println("Playing Music");
    }

    public String getMePen(int cost){
        if(cost>=10) {
            return "Pen";
        }
        return "Nothing will come";

    }

}



public class Demo {
    public static void main(String[] args) {

        Computer comp = new Computer();

        comp.playMusic();
       String result = comp.getMePen(10);

        System.out.println(result);


    }
}
