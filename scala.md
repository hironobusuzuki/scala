# scala
## 特徴
* オブジェクト指向+関数型のマルチパラダイムプログラム言語
* 一般にJVM(Java仮想マシン)上で動作させる
## 参考
* 公式
http://www.scala-lang.org/
* wikipedia
https://ja.wikipedia.org/wiki/Scala
* Scalaプログラミング入門
http://bach.istc.kobe-u.ac.jp/lect/ProLang/org/scala.html
## install
* jvm上で動作させる場合
 - mac
  - jdk(java development kit)を入れる(javaが使える環境ならOK)
    $ java -version
    => java version "1.8.0_60"
       Java(TM) SE Runtime Environment (build 1.8.0_60-b27)
       Java HotSpot(TM) 64-Bit Server VM (build 25.60-b23, mixed mode)
  - scalaインストール
   $ brew install scala
    ==> Downloading https://homebrew.bintray.com/bottles/scala-2.11.7.mavericks.bottle.tar.gz
    ######################################################################## 100.0%
    ==> Pouring scala-2.11.7.mavericks.bottle.tar.gz
    Error: The `brew link` step did not complete successfully
    The formula built, but is not symlinked into /usr/local
    Could not symlink bin/fsc
    /usr/local/bin is not writable.

    You can try again using:
    brew link scala
    ==> Caveats
    To use with IntelliJ, set the Scala home to:
      /usr/local/opt/scala/idea

    Bash completion has been installed to:
    /usr/local/etc/bash_completion.d
    ==> Summary
    🍺  /usr/local/Cellar/scala/2.11.7: 46 files, 31M
  brew doctorでエラーなどつぶす
  $ scala
Welcome to Scala version 2.11.7 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0_60).
Type in expressions to have them evaluated.
Type :help for more information.

scala> 

