//scalaは関数型言語
// 関数はfirst class value
// プログラム内の操作は、データをその場で書き換え（変更）するのでなく、入力の値を出力の値にマップ(写像)すべき
//  =>イミュータブル、副作用がない、参照透明
// 文字列はイミュータブル(変更不能)、
var s = "hoge;fuga"
println(s)
var ss = s.replace(";", ".")
println(ss)
// replaceは副作用をもたない=>参照透明
println(s)
