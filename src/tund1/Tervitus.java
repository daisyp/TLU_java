package tund1;

public class Tervitus {
    public static void main(String[] arg) {
        System.out.println("Tere");
        int vanus = 14;
        System.out.println("argument> "+arg.length);
        if(arg.length>0){
            vanus=Integer.parseInt(arg[0]);
        }
        if(vanus<7) {
            System.out.println("Tasuta");
        } else if(vanus<14 || vanus > 65) {
                System.out.println("sooduspilet");
        } else {
            System.out.println("Taispilet");
        }
    }
}
