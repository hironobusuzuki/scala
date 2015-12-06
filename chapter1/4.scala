//新しい制御構造を作れる言語
//アクターベースの平行プログラミング
//送信
recipient ! msg
//受信(receiveブロック)
receive {
  case Msg1 => ... // Msg1の処理
  case Msg2 => ... // Msg2の処理
  // ...
}

//check sum(データ誤り検出用)計算サービス
actor {
  var sum = 0
  loop {
    receive {
      case Data(bytes)       => sum += hash(bytes)
      case GetSum(requester) => requester ! sum
    }
  }
}
