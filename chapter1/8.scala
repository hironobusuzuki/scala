// 簡潔性（Javaの半分以下のコード量）
//class MyClass {
//  private int index;
//  private String name;
//  public MyClass(int index, String name) {
//    this.index = index;
//    this.name = name;
//  }
//}
class MyClass(var index: Int, var name: String) {}
val myClass = new MyClass(1, "hoge");
println(myClass);
