//高水準（抽象度の高いコード、新しい制御構造を定義できる表現力）
public class MyClass {
  interface CharacterProperty {
    boolean hasProperty(char ch);
  }
  public static void main(String args[]) {
    String name = "Hoge";

//    boolean nameHasUpperCase = false;
//    for(int i = 0; i < name.length(); ++i) {
//      if (Character.isUpperCase(name.charAt(i))) {
//        nameHasUpperCase = true;
//        break;
//      }
//    }
//    System.out.println(nameHasUpperCase);

    System.out.println(
    exists(name, new CharacterProperty() {
      public boolean hasProperty(char ch) {
        return Character.isUpperCase(ch);
      }
    })
    );
  }
  public static boolean exists(String str, CharacterProperty cp) {
    boolean hasProperty = false;
    for(int i = 0; i < str.length(); ++i) {
      cp.hasProperty(str.charAt(i));
       hasProperty = true;
       break;
    }
    return hasProperty;
  }
}
