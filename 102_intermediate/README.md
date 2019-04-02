# Java の課題 (中級編)

## 練習問題

**以下の課題は任意の IDE を使用して実行する**

1. int の配列で任意の数値が存在するかどうかを確認する
1. String の配列で任意の文字列が存在するかどうかを確認する
1. 1,000,000件の文字列のリスト ( ```ArrayList<String>``` ) を作成して任意の文字列を検索する
1. 1,000,000件の文字列のセット ( ```HashSet<String>``` ) を作成して任意の文字列を検索する
1. リストとセットのパフォーマンス ( 実行時間 ) を比較する

## 練習問題: 時刻表

**以下の課題は Maven を使用してプロジェクトを作成する**

丸の内の始発から8時台の名古屋・中村区役所方面時刻表

```
 5: 37 53
 6: 03 14 24 34 43 53
 7: 02 07 11 17 23 29 36 41 46 51 56
 8: 00 04 08 12 16 20 24 28 32 36 40 44 48 52 57
```
1. Time ( 時間 ) クラスを作成し、hours ( 時間 ) と minutes ( 分 ) を持たせる
2. 上記の時刻表として Time クラスのリストを作成して上記のように表示する
3. Time クラスに Object の equeals をオーバーライドして同じ値を持つ Time クラスインスタンスを同一と判定する
4. ユーザーからの入力値を Time クラスに変換して時刻表にその時間が存在するかどうかを確認する

## Maven プロジェクトの作成

1. 以下のコマンドを実行して Maven の archetype:generate を archetypeArtifactId 対話モードで開始します

```cmd
mvn archetype:generate -DarchetypeArtifactId=maven-archetype-quickstart
```

2. 対話モードの設問に以下のように回答する

```
groupId: com.example
artifactId: timetable
version: 1.0-SNAPSHOT
package: com.example
```

入力の例

```
Define value for property 'groupId': com.example
Define value for property 'artifactId': timetable
Define value for property 'version' 1.0-SNAPSHOT: :
Define value for property 'package' com.example: : com.example
```

3. Y: に "Y" と入力して Enter キーを押下する

入力の例

```
 Y: : Y
```

4. プロジェクトのフォルダに移動します

```cmd
cd timetable
```

5. 以下のコマンドを実行しプロジェクトをコンパイルします

```cmd
mvn compile
```

※上記のコマンドを実行することで、timetable フォルダの target\classes 内に class ファイルが作成されます。

6. コンパイルされたプログラムを実行する

```cmd
java -cp target\classes com.example.timetable.App
```

7. 5.-6. の手順を簡略化するためには以下のサイトを参考に exec-maven-plugin プラグインを導入するか、バッチファイルを書きます

[Java プログラムを Maven から実行する方法](https://qiita.com/hide/items/0c8795054219d04e5e98)

## Maven のインストール方法

1. [Maven のサイト](https://maven.apache.org/download.cgi) より、Maven の Binary zip archive (例: バージョン 3.5.4 をインストール) をダウンロードする
1. ダウンロードしたファイルを解凍して ```C:\Program Files\apache-maven-3.5.4```に展開する
1. 環境変数の PATH に ```C:\Program Files\apache-maven-3.5.4\bin``` を追加する
1. コマンドプロンプトを開いて ```mvn --version``` と打ってバージョンが表示されることを確認する
