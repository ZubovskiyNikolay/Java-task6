import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Findkomp {
  public static void main(String[] args) {
    Map<Integer, String> filter = new HashMap<>();
    filter.put(1, "Название бренда");
    filter.put(2, "Операционная система");
    filter.put(3, "Объем оперативной памяти");
    filter.put(4, "Объем жесткого диска");
    filter.put(5, "Цвет");
    filter.put(6, "Стоимость");

    Komp comp1 = new Komp("intel", "windows", 2, 150, "black", 1500);
    Komp comp2 = new Komp("hp", "windows", 4, 300, "black", 7500);
    Komp comp3 = new Komp("msi", "mac", 2, 200, "white", 20000);
    Komp comp4 = new Komp("asus", "linux", 4, 300, "grey", 2500);
    Komp comp5 = new Komp("lenovo", "mac", 2, 300, "white", 1200);

    HashSet<Komp> compSet = new HashSet<>();
    compSet.add(comp1);
    compSet.add(comp2);
    compSet.add(comp3);
    compSet.add(comp4);
    compSet.add(comp5);

    System.out.println("Критерии для поиска модели компьютера:");
    System.out.println("");
    for (Map.Entry<Integer, String> item : filter.entrySet()) {
      System.out.println(item.getKey() + "-" + item.getValue());
    }
    System.out.println("");
    
    HashSet<Komp> compSearch = conditionSearchKomp();
    System.out.println("");
    System.out.println("Количество моделей для поиска: " + compSearch.size());
      for (Komp comp : compSearch) {
       System.out.println(comp);
      }

    System.out.println("");
    System.out.println("Найденные модели: ");
    System.out.println("");

        for (Komp a : compSearch) {
          for (Komp b : compSet) {
            if (b.equals(a)){
              System.out.println(b);
            }
          }
        }
  }

  public static HashSet<Komp> conditionSearchKomp() {

    Scanner sc = new Scanner(System.in);
   
    System.out.println("Введите номер критерия для поиска, затем значение");
    System.out.println("Закончить ввод критериев для одной модели и перейти к следующей введите 0");
    System.out.println("");

    HashSet<Komp> compSearch = new HashSet<>();

    System.out.print("Введите кол-во моделей для поиска: ");
    int amount = sc.nextInt();

    for (int i = 1; i <= amount; i++) {
      Komp comp = new Komp();
      System.out.println("Модель номер " + i);

      while (true) {
        System.out.print("Номер критерия: ");
        int pos = sc.nextInt();
        
        if (pos == 0) {
          break;
        } else {
          switch (pos) {
            case 1:
              System.out.print("Введите название бренда(пример intel): ");
              Scanner sc1 = new Scanner((System.in));
              String brand = sc1.nextLine().toLowerCase();
              comp.setName(brand);
              compSearch.add(comp);
              break;
            case 2:
              System.out.print("Введите название операционной системы(пример linux): ");
              Scanner sc2 = new Scanner((System.in));
              String opsystem = sc2.nextLine().toLowerCase();
              comp.setOpsystem(opsystem);
              compSearch.add(comp);
              break;
            case 3:
              System.out.print("Введите объем памяти Гбайт: ");
              Scanner sc3 = new Scanner((System.in));
              int ram = sc3.nextInt();
              comp.setRam(ram);
              compSearch.add(comp);
              break;
            case 4:
              System.out.print("Введите объем жесткого диска Гбайт: ");
              Scanner sc4 = new Scanner((System.in));
              int hdd = sc4.nextInt();
              comp.setHdd(hdd);
              compSearch.add(comp);
              break;
            case 5:
              System.out.print("Введите цвет модели(пример grey): ");
              Scanner sc5 = new Scanner((System.in));
              String color = sc5.nextLine().toLowerCase();
              comp.setColor(color);
              compSearch.add(comp);
              break;
            case 6:
              System.out.print("Введите стоимость модели: ");
              Scanner sc6 = new Scanner((System.in));
              int price = sc6.nextInt();
              comp.setPrice(price);
              compSearch.add(comp);
              break;
            default:
              System.out.println("Введите корректную позицию");
              break;
          }
        }
      }
    } 
    sc.close();
    return compSearch;
  }
}
