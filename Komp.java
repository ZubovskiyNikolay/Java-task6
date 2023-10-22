public class Komp {
  private String brand;
  private String opsystem;
  private int ram;
  private int hdd;
  private String color;
  private int price;

  public Komp(String brand, String opsystem, int ram, int hdd, String color, int price) {
    this.brand = brand;
    this.opsystem = opsystem;
    this.ram = ram;
    this.hdd = hdd;
    this.color = color;
    this.price = price;
  }

  public Komp() {

  }

  public String getBrand() {
    return brand;
  }

  public String getOpsystem() {
    return opsystem;
  }

  public int getRam() {
    return ram;
  }

  public int getHdd() {
    return hdd;
  }

  public String getColor() {
    return color;
  }

  public int price() {
    return price;
  }

  public void setComp(String brand, String opsystem, int ram, int hdd, String color, int price) {
    this.brand = brand;
    this.opsystem = opsystem;
    this.ram = ram;
    this.hdd = hdd;
    this.color = color;
    this.price = price;
  }

  public String setName(String brand) {
    this.brand = brand;
    return brand;
  }

  public String setOpsystem(String opsystem) {
    this.opsystem = opsystem;
    return opsystem;
  }

  public int setRam(int ram) {
    this.ram = ram;
    return ram;
  }

  public int setHdd(int hdd) {
    this.hdd = hdd;
    return hdd;
  }

  public String setColor(String color) {
    this.color = color;
    return color;
  }

  public int setPrice(int price) {
    this.price = price;
    return price;
  }

  @Override
  public String toString() {
      return "brand: " + brand + " opsystem: " + opsystem + " ram: " + ram + " hdd: " + hdd + " color: " + color
        + " price: " + price;
  }

  @Override
  public boolean equals(Object obj) {
    Komp comp = (Komp)obj; 
    return this.brand != null && this.brand.equals(comp.brand) ||
           this.opsystem != null && this.opsystem.equals(comp.opsystem) ||
           this.ram == comp.ram ||
           this.hdd == comp.hdd ||
           this.color != null && this.color.equals(comp.color) ||
           this.price <= comp.price; 
  }
}
