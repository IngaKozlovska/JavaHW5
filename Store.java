package Lesson5.HW;

public class Store {
    public static void main(String[] args) {
        boolean isEdekaOpen = false;
        boolean isReweOpen = false;

        if (isEdekaOpen == true || isReweOpen == true){
            boolean canBay = true;

            System.out.println("Я могу купить еду, это " + canBay);
        } else {
            boolean canBay = false;
            System.out.println("Я могу купить еду, это " + canBay);
        }
    }
}
