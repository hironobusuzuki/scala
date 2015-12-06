//高水準（抽象度の高いコード、新しい制御構造を定義できる表現力）
//java
//boolean nameHasUpperCase = false;
//for(int i = 0; i < name.length(); ++i) {
//  if (Character.isUpperCase(name.charAt(i))) {
//    nameHasUpperCase = true;
//    break;
//  }
//}
//interface CharacterProperty {
//  boolean hasProperty(char ch);
//}
//exists(name, new CharacterProperty() {
//  public boolean hasProperty(char ch)) {
//    return Character.isUpperCase(ch);
//  }
//});

val name = "Hoge"
val nameHasUpperCase = name.exists(_.isUpper) //_.Upper 述語関数(predicate) = 関数リテラル
                                              // アンダースコアは文字引数を表すプレースホルダ
println(nameHasUpperCase);
