package lesson4;

public class FiguresUtils {
    // 1- модификатор доступа - область видимости метода (4 варианта могут быть)
    // public - самое широкое
    // 2 - какой тип данных получаем на выходе(или указание типа, или void если метод ничего не возвращает)
    // 3 - название метода )(придумываем сами)
    // 4 - входящие параметры в()

    public static void printTypeOfTriangle(int storonaA, int storonaB, int storonaC){
        if (storonaA == storonaB && storonaB == storonaC) {
            System.out.println("Это равносторонний треугольник");
        }
        else if ((storonaA == storonaB && storonaB == storonaC)  || (storonaB != storonaC)) {
            System.out.println("Это равнобедренный треугольник");
        }

        else   {
            System.out.println("Это разносторонний треугольник");

    }
}}
