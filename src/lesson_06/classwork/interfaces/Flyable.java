package lesson_06.classwork.interfaces;

/*
    Объявление интерфейса Flyable (в переводе "тот, кто может летать")
    Все классы, которые реализуют интерфейс, должны реализовать все методы
 */
public interface Flyable {

    /*
        В интерфейсе мы можем объявить только заголовок метода
     */
    void fly();     // лететь

    /*
        Переменные в интерфейсе объявлять нельзя,
        но зато можно объявить метод, который будет возвращать значение
     */
    double getMaxHeight(); // узнать максимальную высоту

    double getMaxSpeed(); // узнать максимальную скорость
}
