public class Main {
    public static void main(String[] args) {
        int pointa1 = 0;
        int pointb1 = 5;
        int pointa2 = 0;
        int pointb2 = 5;

        if (pointa1 == pointa2 && pointb1 == pointb2) {
            System.out.println("Отрезок пересечения от " + pointa1 + " до " + pointb1);
        }else {

            if (pointa2 > pointb1 || pointa1 > pointb2) {
                System.out.println("Пересечения нет");
            }

            if (pointa1 >= pointa2 && pointb1 <= pointb2) {
                System.out.println("Отрезок пересечения от " + pointa1 + " до " + pointb1);
            }

            if (pointa1 <= pointa2 && pointb1 >= pointb2) {
                System.out.println("Отрезок пересечения от " + pointa2 + " до " + pointb2);
            }

            if (pointa1 >= pointa2 && pointb1 >= pointb2 && pointa1 < pointb2) {
                System.out.println("Отрезок пересечения от " + pointa1 + " до " + pointb2);
            }

            if (pointa1 <= pointa2 && pointb1 <= pointb2 && pointa2 < pointb1) {
                System.out.println("Отрезок пересечения от " + pointa2 + " до " + pointb1);
            }

            if (pointa1 == pointb2) {
                System.out.println("Точка пересечения " + pointa1);
            }

            if (pointa2 == pointb1) {
                System.out.println("Точка пересечения " + pointa2);
            }
        }
    }
}